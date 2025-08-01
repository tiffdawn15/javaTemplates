package com.playground.fun.multithreading;

/**
 * Need synchronization when multiple threads are accessing shared resources
 * and at least one of them is modifying the resource.
 */
public class Synchronization {

    public static void main(String[] args) {
        Counter cnt = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cnt.inc();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cnt.inc();
            }
        });
        // Start both threads
        t1.start();
        t2.start();

        try {
            t1.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter: " + cnt.get());

    }
}


/**
 * Types of Synchronization
 * 1. Process Synchronization - used to coordinate the execution of processes
 * 2. Thrad Synchronization - coordinate and ordering of the execution of threas in a multi-threaded environment
 *      2a. Mutual Exclusion - only one thread can access the resource at a time
 *      2b. Cooperation - threads work together to achieve a common goal
 */