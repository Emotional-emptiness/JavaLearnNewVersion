package org.example.module12;

public class RaceConditionDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread0 = new Thread(counter);
        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);
        Thread thread3 = new Thread(counter);
        Thread thread4 = new Thread(counter);
        Thread thread5 = new Thread(counter);
        Thread thread6 = new Thread(counter);
        Thread thread7 = new Thread(counter);

        thread0.start(); // 5
        thread1.start(); // 10
        thread2.start(); // 15
        thread3.start(); // 20
        thread4.start(); // 25
        thread5.start(); // 30
        thread6.start(); // 35
        thread7.start(); // 40 каждый записывает по 5 значений
    }
}
