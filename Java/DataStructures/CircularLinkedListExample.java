class CircularNode {
    int data;
    CircularNode next;

    CircularNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    CircularNode head;

    // Add a node
    void add(int data) {
        CircularNode newNode = new CircularNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point to itself
            return;
        }
        CircularNode current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
    }

    // Print the circular linked list
    void printList() {
        if (head == null) return;
        CircularNode current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }
}

public class CircularLinkedListExample {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList(); // Output: 10 -> 20 -> 30 -> (back to head)
    }
}
