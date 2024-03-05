package org.example.module12.notify_all;

public class Main {
    Parking parking = new Parking(5);
    public static void main(String[] args) {
        Main parkingDemo = new Main();
        for (int i = 0; i < 15; i++) {
            Thread car = new Thread(() -> {
                try {
                    parkingDemo.parking();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            car.start();
        }
    }
    public void  parking() throws InterruptedException {
        parking.joinParking();
        // машина в этот момент заблокировала место
        System.out.println("Машина " + Thread.currentThread().getName() + " заехала на парковку");
        Thread.sleep(3000);
        parking.leaveParking();
        System.out.println("Машина " + Thread.currentThread().getName() + " выехала с парковки");
    }
}
