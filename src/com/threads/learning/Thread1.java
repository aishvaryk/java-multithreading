package com.threads.learning;

public class Thread1 extends Thread{

    Thread1 (String name) {
        super(name);
    }

    Thread1 () {
        super();
    }

    @Override
    public void run() {
        System.out.println("Thread 1");
    }
}
