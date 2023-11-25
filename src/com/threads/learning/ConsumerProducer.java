package com.threads.learning;

import java.util.LinkedList;
import java.util.Queue;

public class ConsumerProducer {

    private final Queue<Integer> q = new LinkedList<Integer>();

    private final int capacity;

    ConsumerProducer(int cap) {
        this.capacity = cap;
    }

    public void add(int elem) throws InterruptedException {
        synchronized (q) {

            while (q.size() == capacity) {
                q.wait();
            }
            q.add(elem);
            q.notifyAll();

        }
    }

    public int remove() throws InterruptedException {
        synchronized (q) {
            while (q.isEmpty()) {
                q.wait();
            }
        }

        int removedElem =  q.poll();
        q.notifyAll();
        return removedElem;
    }

}
