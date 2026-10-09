package com.multithreading.project;

public class OrderConsumer implements Runnable {
    private final SharedOrderQueue queue;

    public OrderConsumer(SharedOrderQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Order order = queue.consume();
                if (order == null) {
                    break; // Queue shut down and drained
                }
                Thread.sleep(300); // Simulate fulfillment processing
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
