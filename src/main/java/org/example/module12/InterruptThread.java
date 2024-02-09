package org.example.module12;

public class InterruptThread extends Thread {
    @Override
    public void run() {
        final Thread thread = Thread.currentThread();
        System.out.println("thread.getName() =  : STARTED..." + thread.getName());
        int counter = 0;
        while (!thread.isInterrupted()) {
            System.out.println("Loop " + counter);
//            if ( counter > 99 ) {
//                thread.interrupt();
//                System.out.println("Thread has been interrupted... ");
//                System.out.println("Main thread finish ");
//            }
            counter++;
            ThreadSleep(thread);
        }
    }
    private void ThreadSleep(Thread thread) {
        try {
            thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Interrupted : " + Thread.currentThread().getName());
            System.out.println("IsInterrupted flag : " + Thread.currentThread().isInterrupted());
            Thread.currentThread().interrupt();
        }
    }
}
