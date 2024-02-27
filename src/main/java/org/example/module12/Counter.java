package org.example.module12;

public class Counter implements Runnable {
    private int counter = 0;
//    private static final Object MONITOR = new Object();
    @Override
    public void run() {
        for( int i = 0; i < 5; i++ ) {

            synchronized (Counter.class) {
                increment();
                // synchronized (MONITOR) static/ not static
                // synchronized (Counter.class) static
                // synchronized (this) not static
            }
            System.out.println(Thread.currentThread().getName() + " - " + counter);
        }
    }

    private void increment() { // private void increment() static / not static
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            //NOP
        }
        counter++;
    }
}
