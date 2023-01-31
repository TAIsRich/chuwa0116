package MultiTread.Executor_Framework;

import java.util.*;
import java.util.concurrent.Executor;

public class CustomExecutor implements Executor {

    private static final int MAX_WORKER_NUMBERS = 30;
    private final Deque<Runnable> tasks = new LinkedList<>();
    private final List<Worker> workers = Collections.synchronizedList(new ArrayList<>());

    //initialize thread pool
    public CustomExecutor(int num){
        initializeWorkers(Math.min(num, MAX_WORKER_NUMBERS));
    }

    private void initializeWorkers(int num){
        for(int i = 0; i < num; i++){
            Worker worker = new Worker();
            workers.add(worker);

            //start worker thread
            new Thread(worker).start();
        }
    }

    @Override
    public void execute(Runnable task){
        if(task == null){
            throw new NullPointerException();
        }
        synchronized (tasks){
            tasks.addLast(task);
            tasks.notify();
        }
    }

    //close thread pool
    public void shutdown(){
        for(Worker worker : workers){
            worker.shutdown();
        }
    }

    //add worker
    public void addWorkers(int num){
        synchronized (tasks){
            if(num + workers.size() > MAX_WORKER_NUMBERS){
                num = MAX_WORKER_NUMBERS - workers.size();
            }
            initializeWorkers(num);
        }
    }

    //decrease workers
    public void removeWorker(int num){
        synchronized (tasks){
            if(num >= workerSize()){
                throw new IllegalArgumentException("exceed current worker size");
            }
            for(int i = 0; i < num; i++){
                Worker worker = workers.get(i);
                if(worker != null){
                    worker.shutdown();
                    workers.remove(i);
                }
            }
        }
    }

    public int workerSize(){
        return workers.size();
    }


    //worker get task from task queue and execute the task
    class Worker implements Runnable{
        private volatile  boolean running = true;

        @Override
        public void run() {
            Runnable task = null;
            while(running || task != null){
                //execute task
                if(task != null){
                    task.run();
                }

                synchronized (tasks){
                    if(tasks.isEmpty() && running){
                        try{
                            tasks.wait();
                        }catch (InterruptedException e){
                            //return when current thread is interrupted
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    //get a task from task queue
                    task = tasks.isEmpty() ? null : tasks.removeFirst();
                }
            }
        }

        //shut down worker
        public void shutdown(){
            running = false;
            synchronized (tasks){
                //notify worker to shut down
                tasks.notify();
            }
        }
    }
}
