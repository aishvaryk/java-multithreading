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


//        if we want to run thread 3 to stop running parallely and work synchronously

        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // thread has priority from 1 to 10 and it is just an advisory method

        thread3.getPriority();
        thread3.setPriority(6);


    }
}
