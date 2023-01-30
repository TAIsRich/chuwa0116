package core.multithreading.c06_util_concurrent_locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/29/23
 */
public class ReentrantLockLearn {
    public static void main(String[] args) {
        CounterReentrant counterReentrant = new CounterReentrant();

        Thread thread1 = new Thread(() -> {
            int n = 20;
            while (n-- > 0) {
                counterReentrant.add(2);
                System.out.println("t1 add 2: " + counterReentrant.getCount());
            }
        });

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                int n = 20;
                while (n-- > 0) {
                    counterReentrant.add(100);
                    System.out.println("t2 add 100: "
                        + counterReentrant.getCount());
                }
            }
        };

        thread1.start();
        thread2.start();
        System.out.println("main end");
    }
}

class CounterReentrant {
    private final Lock lock = new ReentrantLock();
    private int count;

    public void add(int n) {
        lock.lock();
        try {
            count += n;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}