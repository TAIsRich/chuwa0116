package multithreading.c05_waitNotify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WaitNotify {

    public static void main(String[] args) throws InterruptedException {
        TaskQueue q = new TaskQueue();
        ArrayList<Thread> ts = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            Thread t = new Thread(() -> {
                while (true) {
                    try {
                        String str = q.getTask();
                        System.out.println("execute task: " + str);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();
            ts.add(t);
        }

        Thread add = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                String s =  "t-" + Math.random();
                System.out.println("add task: " + s);
                q.addTask(s);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        add.start();
        add.join();
        Thread.sleep(100);
        for (Thread t : ts) {
            t.interrupt();
        }
    }
}

class TaskQueue {
    Queue<String> queue = new LinkedList<>();

    synchronized public void addTask(String s) {
        queue.add(s);
        this.notifyAll();
    }

    synchronized public String getTask() throws InterruptedException {
        while (queue.isEmpty()) {
            this.wait();
        }
        this.notifyAll();
        return queue.remove();
    }
}
