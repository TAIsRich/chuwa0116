package core.multithreading.c01_create;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/29/23
 */
public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Thread t = new MyThread();
        t.start();
        System.out.println("----------------");

        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        System.out.println("----------------");

        Thread t3 = new Thread(() -> System.out.println("Using lambda"));
        t3.start();
        System.out.println("----------------");

        Callable<String> callable = new MyCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<>();
        Future<String> future = executorService.submit(callable);
        list.add(future);
        Future<String> stringFuture = list.get(0);

        for (int i = 0; i < 5; i += 1) {
            Thread.sleep(1000);
            String s = future.get();
            System.out.println(s);
        }


        executorService.shutdown();
    }
}
