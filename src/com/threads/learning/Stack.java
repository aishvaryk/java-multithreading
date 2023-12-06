package com.threads.learning;

public class Stack {

    Object lock;
    int size;
    int[] array;
    Stack (int size) {
        this.array = new int[size];
    }


//generally when multiple threads are trying to use the shared resource locking is good to just allow one
// thread to change the shared object, the same shared object can be used as a lock


//    Any object can be considered a lock


//    both push and pop has different lock, now if two threads or same thread want to push and pop at the same time
//    then it would not happen as other threads will not have access to same lock
//    public boolean push(int elem) {
//        synchronized (lock1) {
//            this.array[0] = elem;
//        }
//        return false;
//    }
//
//    public int pop() {
//        synchronized (lock2) {
//            return 0;
//        }
//    }



//    now in below example instance of current class is given as lock now the instance is thread safe
//    as this all the threads will require the same instance

    public boolean push(int elem) {
        synchronized (this) {
            this.array[0] = elem;
        }
        return false;
    }

    public int pop() {
        synchronized (this) {
            return 0;
        }
    }


    //class reflection will be used as lock in the method
    private static void method() {
        synchronized (Stack.class) {

        }
    }


}
