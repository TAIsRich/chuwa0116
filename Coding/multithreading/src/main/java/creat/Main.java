package creat;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t = new Thread();
        t.start();
//        -> run task in current process/thread
//        t.run();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        Thread t3 = new Thread(() -> System.out.println("Start new thread by implementing Runnable with lambda"));
        t3.start();

        MyCallable t4 = new MyCallable();

        ExecutorService executor = Executors.newFixedThreadPool(10);
        ArrayList<Future<String>> list = new ArrayList<>();
        Future<String> future = executor.submit(t4);
        list.add(future);
        Future<String> stringFuture = list.get(0);

        for (int i = 0; i < 5; i++){
            Thread.sleep(1000);
            String s = future.get();
            System.out.println(s);
        }

        executor.shutdown();
    }
}
