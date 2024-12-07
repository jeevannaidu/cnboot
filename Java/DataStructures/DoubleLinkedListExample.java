class DoublyNode {
    int data;
    DoublyNode next, prev; // Pointers to next and previous nodes

    DoublyNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    DoublyNode head;

    // Add a node at the head
    void addAtHead(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Print list forward
    void printForward() {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Print list backward
    void printBackward() {
        DoublyNode current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}

public class DoubleLinkedListExample {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtHead(30);
        list.printForward(); // Output: 30 <-> 20 <-> 10 <-> null
        list.printBackward(); // Output: 10 <-> 20 <-> 30 <-> null
    }
}
