package com.multithreading.project;

import java.util.LinkedList;
import java.util.Queue;

public class SharedOrderQueue {
    private final Queue<Order> queue = new LinkedList<>();
    private final int capacity;
    private boolean isShutdown = false;

    public SharedOrderQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(Order order) throws InterruptedException {
        while (queue.size() == capacity && !isShutdown) {
            wait();
        }
        if (isShutdown) return;

        queue.add(order);
        System.out.println(Thread.currentThread().getName() + " produced: " + order);
        notifyAll();
    }

    public synchronized Order consume() throws InterruptedException {
        while (queue.isEmpty() && !isShutdown) {
            wait();
        }
        if (queue.isEmpty() && isShutdown) {
            return null;
        }

        Order order = queue.poll();
        System.out.println(Thread.currentThread().getName() + " consumed: " + order);
        notifyAll();
        return order;
    }

    public synchronized void shutdown() {
        this.isShutdown = true;
        notifyAll();
    }
}
