package org.example.module12;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Выполнение дочернего потока " + Thread.currentThread().getName());
    }
}
