package com.playground.fun.multithreading;

class ProducerConsumerProblem {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.inc();
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Counter value: " + counter.get());
            }
        });

        producer.start();
        consumer.start();
    }
}

//************************************
// wait() and notify() solutin

//class Buffer {
//    private final Queue<Integer> queue = new LinkedList<>();
//    private final int CAPACITY = 5;
//
//    public synchronized void produce(int value) throws InterruptedException {
//        while (queue.size() == CAPACITY) {
//            wait(); // wait until space is available
//        }
//        queue.add(value);
//        System.out.println("Produced: " + value);
//        notifyAll(); // wake up consumers
//    }
//
//    public synchronized int consume() throws InterruptedException {
//        while (queue.isEmpty()) {
//            wait(); // wait until data is available
//        }
//        int value = queue.poll();
//        System.out.println("Consumed: " + value);
//        notifyAll(); // wake up producers
//        return value;
//    }
//}
//
//public class ProducerConsumerDemo {
//    public static void main(String[] args) {
//        Buffer buffer = new Buffer();
//
//        Thread producer = new Thread(() -> {
//            int i = 0;
//            try {
//                while (true) {
//                    buffer.produce(i++);
//                    Thread.sleep(500);
//                }
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        });
//
//        Thread consumer = new Thread(() -> {
//            try {
//                while (true) {
//                    buffer.consume();
//                    Thread.sleep(800);
//                }
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        });
//
//        producer.start();
//        consumer.start();
//    }
//}



// ****************// BlockingQueue solution

/**
 * import java.util.concurrent.*;
 *
 * public class ProducerConsumerBQ {
 *     public static void main(String[] args) {
 *         BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
 *
 *         Thread producer = new Thread(() -> {
 *             int i = 0;
 *             try {
 *                 while (true) {
 *                     queue.put(i); // waits if full
 *                     System.out.println("Produced: " + i++);
 *                     Thread.sleep(500);
 *                 }
 *             } catch (InterruptedException e) {
 *                 Thread.currentThread().interrupt();
 *             }
 *         });
 *
 *         Thread consumer = new Thread(() -> {
 *             try {
 *                 while (true) {
 *                     int value = queue.take(); // waits if empty
 *                     System.out.println("Consumed: " + value);
 *                     Thread.sleep(800);
 *                 }
 *             } catch (InterruptedException e) {
 *                 Thread.currentThread().interrupt();
 *             }
 *         });
 *
 *         producer.start();
 *         consumer.start();
 *     }
 * }
 */