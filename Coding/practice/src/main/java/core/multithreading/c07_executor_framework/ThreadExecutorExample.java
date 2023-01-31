package core.multithreading.c07_executor_framework;

import java.util.concurrent.Executor;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/29/23
 */
public class ThreadExecutorExample {

    public static void main(String[] args) {
        DumbExecutor dumbExecutor = new DumbExecutor();
        MyTask myTask = new MyTask();
        dumbExecutor.execute(myTask);
    }

    static class DumbExecutor implements Executor {
        @Override
        public void execute(Runnable command) {
            Thread t = new Thread(command);
            t.start();
        }
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Mytask is running");
        }
    }
}
