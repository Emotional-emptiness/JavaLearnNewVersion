package org.example.module12;

public class InterruptDemo {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Thread thread = new InterruptThread();
        thread.start();

        try {
            Thread.sleep(5);
            thread.interrupt();
            Thread.sleep(5);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted... ");
        }
        System.out.println("Main thread finish ");
        }
}
