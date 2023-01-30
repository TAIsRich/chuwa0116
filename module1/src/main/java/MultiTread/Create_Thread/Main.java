package MultiTread.Create_Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //using extends thread
        Thread t = new MyThread();
        //create a new thread then run the task in the new thread
        //t.run() -> run task in current process/thread
        t.start();
        System.out.println("*************************");

        //using implements Runnable
        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        //use lambda
        Thread t3 = new Thread(() ->System.out.println("Start new thread by implementing Runnable with lambda"));
        t3.start();

        //user implements  Callable
        Callable<String> callable = new MyCallable();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        List<Future<String>> list = new ArrayList<>();
        Future<String> future = executor.submit(callable);
        list.add(future);
        Future<String> stringFuture = list.get(0);

        for(int i = 0; i < 5; i++){
            Thread.sleep(1000);
            String s = future.get();
            System.out.println(s);
        }

        executor.shutdown();

    }
}
