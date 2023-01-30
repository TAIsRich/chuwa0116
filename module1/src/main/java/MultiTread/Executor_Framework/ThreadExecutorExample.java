package MultiTread.Executor_Framework;

import java.util.concurrent.Executor;

public class ThreadExecutorExample {
    public static void main(String[] args) {
        //create an executor
        DumbExecutor myExecutor = new DumbExecutor();
        //create a task
        MyTask myTask = new MyTask();
        //use Executor to create a thread to execute task
        myExecutor.execute(myTask);
    }

    static class DumbExecutor implements Executor{
        @Override
        public void execute(Runnable runnable){
            Thread newThread = new Thread(runnable);
            newThread.start();
        }
    }

    static class MyTask implements Runnable{
        @Override
        public void run(){
            System.out.println("MyTask is running now ....");
        }
    }
}
