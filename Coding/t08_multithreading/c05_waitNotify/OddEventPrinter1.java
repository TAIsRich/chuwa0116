package com.chuwa.tutorial.t08_multithreading.c05_waitNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEventPrinter1 {
    private static Lock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    private static int value = 1;

    public static void main(String[] args) {
        OddEventPrinter.PrintRunnable runnable = new OddEventPrinter.PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            lock.lock();
            try {
                while (value <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    condition.signal();
                    try {
                        if (value < 11) {
                            condition.await();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
