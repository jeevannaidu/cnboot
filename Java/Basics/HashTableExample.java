package Basics;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        // Displaying entries
        for (Integer key : hashtable.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }
}
