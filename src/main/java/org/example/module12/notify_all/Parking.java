package org.example.module12.notify_all;

public class Parking {
    private int amountOfCars = 0;
    private int blockedPlaces = 0;
    private final Object monitor = new Object();

    public Parking(int amountOfCars) {
        this.amountOfCars = amountOfCars;
    }

    public  void joinParking() throws InterruptedException {
        synchronized (monitor) {
            while (blockedPlaces == amountOfCars) {
                System.out.println("Parking is full");
                monitor.wait();
            }
            blockedPlaces++;
            monitor.notifyAll();
        }
    }
    public void leaveParking() throws InterruptedException {
        synchronized (monitor) {
            while (blockedPlaces == 0) {
                monitor.wait();
            }
            blockedPlaces--;
            monitor.notifyAll();
        }
    }
}
