package Basics;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

class Document {
    private String id;

    public Document(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

class Helper {
    // Mock method to fetch related documents from the database
    public List<Document> getRelatedDocuments(String documentId) {
        // Simulate a database call with some mock related documents
        return Arrays.asList(new Document(documentId + "_rel1"), new Document(documentId + "_rel2"));
    }
}

public class DocumentProcessor {

    // Method to process documents in batches
    public static Map<Document, List<Document>> processDocuments(List<Document> documents) {
        Helper helper = new Helper();
        int batchSize = 2000; // Maximum threshold for one batch
        int numberOfBatches = (int) Math.ceil((double) documents.size() / batchSize);
        ExecutorService executorService = Executors.newFixedThreadPool(5); // 5 threads for parallel execution

        // Map to store the result
        Map<Document, List<Document>> resultMap = new ConcurrentHashMap<>();

        // List of CompletableFutures
        List<CompletableFuture<Void>> futures = new ArrayList<>();

        // Splitting documents into batches and processing each batch
        for (int i = 0; i < numberOfBatches; i++) {
            // Calculate start and end index for current batch
            int start = i * batchSize;
            int end = Math.min(start + batchSize, documents.size());
            List<Document> batch = documents.subList(start, end);

            // Create a CompletableFuture task for each batch
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                for (Document document : batch) {
                    // Fetch related documents for the current document
                    List<Document> relatedDocs = helper.getRelatedDocuments(document.getId());

                    // If related documents are found, put them in the resultMap
                    if (!relatedDocs.isEmpty()) {
                        resultMap.put(document, relatedDocs);
                    } else {
                        // If no related documents, add the document with an empty list
                        resultMap.put(document, Collections.emptyList());
                    }
                }
            }, executorService);

            futures.add(future);
        }

        // Wait for all tasks to complete
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        // Shutdown the executor service
        executorService.shutdown();

        return resultMap;
    }

    public static void main(String[] args) {
        // Create a list of 10,000 mock documents
        List<Document> documents = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            documents.add(new Document("doc" + i));
        }

        // Process the documents and get the result map
        Map<Document, List<Document>> resultMap = processDocuments(documents);

        // Printing the result (sample output)
        resultMap.forEach((doc, relatedDocs) -> {
            System.out.println("Document ID: " + doc.getId() + " has related documents: " +
                    relatedDocs.stream().map(Document::getId).collect(Collectors.toList()));
        });
    }
}

