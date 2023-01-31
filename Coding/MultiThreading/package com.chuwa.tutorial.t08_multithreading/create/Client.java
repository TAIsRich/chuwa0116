package create;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t= new Thread();
        t.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        Thread t3 = new Thread(() -> System.out.println("start thread by lambda"));
        t3.start();

        Callable<String> callable = new MyCallable();
        ExecutorService et = Executors.newFixedThreadPool(2);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Future<String> future = et.submit(callable);
        list.add(future);
        Future<String> stringFuture = list.get(0);
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            String s = future.get();
            System.out.println(s);
        }

        et.shutdown();
    }
}
