package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Zhipeng Yin
 * @date 2023-01-30 19:20
 */
public class ThreadTest1 {
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();
    private static  int value = 1;
    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
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

                        if(value< 11){
                            try {
                                condition.await();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }finally {
                    lock.unlock();
                }

            }
        }
    }

