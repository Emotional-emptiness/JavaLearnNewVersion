package org.example.module12;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnerLiveLock {
    public static void main(String[] args) {
        final Lock firstGivenLock = new ReentrantLock();
        final Lock secondGivenLock = new ReentrantLock();

        final Thread firstGivenThread = new Thread(new LiveLock(firstGivenLock, secondGivenLock));
        final Thread secondGivenThread = new Thread(new LiveLock(secondGivenLock, firstGivenLock));

        firstGivenThread.start();
        secondGivenThread.start();

    }
}
