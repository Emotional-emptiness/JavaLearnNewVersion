package org.example.module12;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class LiveLock implements Runnable {
    public static final String NAME_FIRST_LOCK = "firstlock";
    public static final String NAME_SECOND_LOCK = "secondlock";

    private final Lock firstlock;
    private final Lock secondlock;

    public LiveLock(Lock firstlock, Lock secondlock) {
        this.firstlock = firstlock;
        this.secondlock = secondlock;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + NAME_FIRST_LOCK + " try acquire lock");
        this.firstlock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + NAME_FIRST_LOCK + " success acquire lock");
            TimeUnit.MILLISECONDS.sleep(50);
            while (!this.tryAcquireSecondLock()) {
                TimeUnit.MILLISECONDS.sleep(50);
                this.firstlock.unlock();
                System.out.println(Thread.currentThread().getName() + NAME_FIRST_LOCK + " release lock");
                TimeUnit.MILLISECONDS.sleep(50);
                System.out.println(Thread.currentThread().getName() + NAME_FIRST_LOCK + " try acquire lock");
                this.firstlock.lock();
                System.out.println(Thread.currentThread().getName() + NAME_SECOND_LOCK +" success acquire lock");
                TimeUnit.MILLISECONDS.sleep(50);
            }
            try {
                System.out.println(Thread.currentThread().getName() + NAME_SECOND_LOCK +" success acquire lock");
            }
            finally {
                this.secondlock.unlock();
                System.out.println(Thread.currentThread().getName() + NAME_SECOND_LOCK + " release lock");
            }
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally {
            this.firstlock.unlock();
            System.out.println(Thread.currentThread().getName() + NAME_FIRST_LOCK + " release lock");
        }
    }
    private boolean tryAcquireSecondLock() {
        final String currentThreadName = Thread.currentThread().getName();
        System.out.println(Thread.currentThread().getName() + NAME_SECOND_LOCK + " try acquire lock");
        return this.secondlock.tryLock();

    }
}
