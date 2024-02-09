package org.example.module12;

public class InterruptThread extends Thread {
    @Override
    public void run() {
        final Thread thread = Thread.currentThread();
        System.out.println("thread.getName() =  : STARTED..." + thread.getName());
        int counter = 0;
        while (!thread.isInterrupted()) {
            System.out.println("Loop " + counter);
            if ( counter > 99 ) {
                thread.interrupt();
            }
            counter++;
        }
    }
}
