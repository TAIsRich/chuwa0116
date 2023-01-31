package com.chuwa.learn.hw6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEventPrinter2 {
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable implements Runnable {

        private final Lock lock = new ReentrantLock();
        private final Condition condition = lock.newCondition();
        @Override
        public void run() {
            lock.lock();
            try{
                while (value <= 10){
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    condition.signal();
                    try{
                        if (value < 11) {
                            condition.await();
                        }
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }finally{
                lock.unlock();
            }
        }
    }
}