package org.example.module12;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLockDemo {
    public static void main(String[] args) {
        ArrayList<Resource> resources = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            resources.add(new Resource(i));
        }

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> handle(resources.get(0), resources.get(1)));
        executorService.execute(() -> handle(resources.get(1), resources.get(0)));
    }
    public static void handle(Resource res1, Resource res2) {
        System.out.println(Thread.currentThread().getName() + "start");
        synchronized (res1) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (res2) {
                res1.setValue(res2.getValue());
            }
        }
        System.out.println(Thread.currentThread().getName() + "end");
    }


    static class Resource {
        int value;
        public Resource(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
