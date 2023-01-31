package executor_framework;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomExecutorDemo {
    // 1, create an Executor
    // 2, create a task
    // 3, use Executor to create a thread to execute task
    @Test
    public void demo01() {
        int size = 10;
        int taskNumber = 100;

        CountDownLatch latch = new CountDownLatch(taskNumber);
        ExecutorService executorService = Executors.newFixedThreadPool(size);

        for (int i = 0; i < taskNumber; i++) {
            MyTask task = new MyTask(latch);
            executorService.execute(task);
        }

        executorService.shutdown();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Custom thread pool demo
     */
    @Test
    public void demo02() {
        int size = 10;
        int taskNumber = 100;

        CountDownLatch latch = new CountDownLatch(taskNumber);
        CustomExecutor customExecutor = new CustomExecutor(20);

        for (int i = 0; i < taskNumber; i++) {
            MyTask task = new MyTask(latch);
            customExecutor.execute(task);
        }

        customExecutor.shutdown();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyTask implements Runnable {
    CountDownLatch latch;

    private static final AtomicInteger COUNT = new AtomicInteger(1);

    public MyTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + ": " + ", count: " + COUNT.getAndIncrement());
        latch.countDown();
    }
}
