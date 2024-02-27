package org.example.module12;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable object = new RunnableThread();
        object.run();


//        Runnable run = new RunnableThread();
//        Thread thread = new Thread(run);
//        thread.interrupt();
//        thread.start();
    }
}
