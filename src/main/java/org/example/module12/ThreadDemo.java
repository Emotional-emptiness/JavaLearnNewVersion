package org.example.module12;

public class ThreadDemo  {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main поток стартовал " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().getPriority() = " + Thread.currentThread().getPriority());
        Thread thread = new ChildThread();
        thread.start();
        Thread.sleep(10);
        System.out.println("Main поток завершен " + Thread.currentThread().getName());

        Thread thread1 = new ChildThread();
        System.out.println("Thread.currentThread().getPriority() = " + Thread.currentThread().getPriority());
        thread1.start();
    }
}
