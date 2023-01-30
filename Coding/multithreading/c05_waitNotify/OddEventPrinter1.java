package multithreading.c05_waitNotify;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEventPrinter1 {
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();
    private static int value = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintRunnable());
        Thread t2 = new Thread(new PrintRunnable());

        t1.start();
        t2.start();
    }

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            lock.lock();
            try {
                while (value <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + value);
                    value += 1;
                    condition.signalAll();
                    try {
                        condition.await();
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
