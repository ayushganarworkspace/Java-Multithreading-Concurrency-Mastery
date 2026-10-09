package com.multithreading.project;

public class OrderProducer implements Runnable {
    private final SharedOrderQueue queue;
    private final int totalOrdersToProduce;

    public OrderProducer(SharedOrderQueue queue, int totalOrdersToProduce) {
        this.queue = queue;
        this.totalOrdersToProduce = totalOrdersToProduce;
    }

    @Override
    public void run() {
        for (int i = 1; i <= totalOrdersToProduce; i++) {
            try {
                Order order = new Order(i, "Laptop-Model-" + i);
                queue.produce(order);
                Thread.sleep(150); // Simulate network/creation delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
