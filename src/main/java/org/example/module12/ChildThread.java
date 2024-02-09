package org.example.module12;

public class ChildThread extends Thread {
    @Override
    public void run() {
        System.out.println("выполнение дочернего потока " + Thread.currentThread().getName());
    }
}
