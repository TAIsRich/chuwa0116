package multithreading.c01_create;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Thread t = new MyThread();
        t.start(); // create a new thread and run the task in that thread
//        t.run(); // run the task in current thread
        System.out.println("*************");

        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        Thread t3 = new Thread(() -> System.out.println("Start new thread by providing Runnable with lambda"));
        t3.start();

        Callable<String> callable = new MyCallable();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<>();
        Future<String> future = executor.submit(callable);
        list.add(future);
        Future<String> stringFuture = list.get(0);

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            String s = future.get();
            System.out.println(s);
        }

        executor.shutdown();
    }
}
