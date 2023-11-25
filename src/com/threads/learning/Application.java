package com.threads.learning;

public class Application {

    public static void main(String[] args) {

        System.out.println("Main Thread Started");

        Thread1 thread1 = new Thread1("Thread 1");

        thread1.start();

        thread1.setDaemon(true);

        Thread thread2 = new Thread(new Thread2(), "Thread 2");

        thread2.start();

        Thread thread3 = new Thread(()->{
            System.out.println("Thread 3");
        }, "Thread 3");
    }
}
