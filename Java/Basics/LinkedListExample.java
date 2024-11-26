package Basics;

class LinkedListNode {
    int data;
    LinkedListNode next;

    // Constructor
    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {

    // Head node of the linked list
    LinkedListNode head;

    // Add a new task at the end
    public void addTask(int task) {
        LinkedListNode newNode = new LinkedListNode(task);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Print all tasks
    public void printTasks() {
        LinkedListNode temp = head;
        System.out.println("Tasks:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Remove a completed task (from the start)
    public void removeTask() {
        if (head == null) {
            System.out.println("No tasks to remove!");
            return;
        }
        head = head.next;
    }

    public static void main(String[] args) {
        LinkedListExample tasks = new LinkedListExample();

        // Adding tasks
        tasks.addTask(101);
        tasks.addTask(102);
        tasks.addTask(103);

        // Printing tasks
        tasks.printTasks();

        // Removing a task
        tasks.removeTask();
        System.out.println("After removing one task:");
        tasks.printTasks();
    }
}
