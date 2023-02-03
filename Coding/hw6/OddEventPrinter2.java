package Coding.hw6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class OddEventPrinter2 {

    private static int count = 1;

    public static void main(String[] args) {
        SelfRunnable r = new SelfRunnable();
        new Thread(r).start();
        new Thread(r).start();
    }

    static class SelfRunnable implements Runnable{
        private final Lock lock = new ReentrantLock();

        private final Condition condition = lock.newCondition();

        @Override
        public void run(){
            lock.lock();
            while (count<=10){
                System.out.println(Thread.currentThread().getName()+": "+count++);
                condition.signal();
                if (count<=10){
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
            lock.unlock();

        }
    }
}