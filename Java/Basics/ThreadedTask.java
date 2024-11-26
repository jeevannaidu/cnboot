package Basics;

public class ThreadedTask implements Runnable {
    private int number;
    private static int threadCounter = 0;
    private int threadNumber;

    // Constructor that accepts a number and increments the thread counter
    public ThreadedTask(int number) {
        this.number = number;
        threadCounter++;
        this.threadNumber = threadCounter;

        // Creating a new thread and starting it
        Thread thread = new Thread(this);
        thread.start();
    }

    // Method to run the task
    @Override
    public void run() {
        runTask();
    }

    // Method to print the input number and thread number
    public void runTask() {
        System.out.println("Input Number: " + number + ", Thread Number: " + threadNumber);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating instances of ThreadedTask

        for(int i = 0; i < 100; i++) {
            new ThreadedTask(i);
        }
    }
}
