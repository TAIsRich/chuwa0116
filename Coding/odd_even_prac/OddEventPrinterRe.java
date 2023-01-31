package com.chuwa.tutorial.t08_multithreading.odd_even_prac;
import java.util.concurrent.locks.*;
/**
 * @author b1go
 * @date 7/18/22 12:41 AM
 */
public class OddEventPrinterRe {

    static int value = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable implements Runnable {
        final static ReentrantLock lock = new ReentrantLock();
        final static Condition readyToPrint = lock.newCondition();
        @Override
        public void run() {


            while (value <= 10) {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    if(value >10) System.exit(0);
                    readyToPrint.signal();
                    try {

                        readyToPrint.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
