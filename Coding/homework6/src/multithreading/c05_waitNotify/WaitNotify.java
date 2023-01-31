package multithreading.c05_waitNotify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException{
        TaskQueue q = new TaskQueue();
        ArrayList<Thread>  ts = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            Thread t = new Thread(){
                @Override
                public void run(){
                    while(true) {
                        try {
                            String s = q.getTask();
                            System.out.println("execute task: " + s);
                        } catch (InterruptedException e){
                            e.printStackTrace();
                            return;
                        }
                    }
                }
            };
        }
    }
}
class TaskQueue {
    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String s) {
        this.queue.add(s);
        this.notifyAll();
    }

    public synchronized String getTask() throws InterruptedException {
        while(queue.isEmpty()) {
            this.wait();
        }
        return queue.remove();
    }
}