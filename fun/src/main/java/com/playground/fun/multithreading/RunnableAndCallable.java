/**
 * public class MyRunnable implements Runnable {
 *     @Override
 *     public void run() {
 *         System.out.println("Running in a thread");
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         Thread t = new Thread(new MyRunnable());
 *         t.start();
 *     }
 * }
 */


// ^^^ Used with Thread, ExecutorService
// No return value -- just executres a thread

/**
 * import java.util.concurrent.*;
 *
 * public class MyCallable implements Callable<Integer> {
 *     @Override
 *     public Integer call() throws Exception {
 *         Thread.sleep(1000);
 *         return 42; // returns a result
 *     }
 *
 *     public static void main(String[] args) throws Exception {
 *         ExecutorService executor = Executors.newSingleThreadExecutor();
 *         Future<Integer> future = executor.submit(new MyCallable());
 *         System.out.println("Result: " + future.get()); // waits for completion
 *         executor.shutdown();
 *     }
 * }
 */

// Used with ExecutorService.submit(Callable<T>)
//
