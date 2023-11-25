package com.threads.learning;

public class Deadlock {


    public static void run() {

        String lock1 = "lock1";
        String lock2 = "lock1";

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock2) {
                    System.out.println("lock2 by thread1 acquired");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock1) {
                    System.out.println("lock1 by thread2 acquired");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

}
