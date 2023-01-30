package multithreading.c06_util_concurrent_locks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockLearn {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        ArrayList<Thread> ts = new ArrayList<>();
        ArrayList<Thread> ws = new ArrayList<>();

        // set up consumer
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(() -> {
                int[] nums = counter.get();
//                System.out.println("Reading Started: ");
                for (int n : nums) {
                    System.out.print(n + " ");
                }
                System.out.println("\nReading Finished ");
            });
            t.start();
            ts.add(t);
        }

        // set up producer
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    counter.inc(j);
                }
            });
            t.start();
            ws.add(t);
        }

        // interrupt thread when last for too long
        Thread.sleep(15000);
        for (Thread t : ts) {
            t.interrupt();
        }
    }

}

class Counter {
    public final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    public final Lock rLock = rwLock.readLock();
    public final Lock wLock = rwLock.writeLock();
    public int[] nums = new int[10];

    public void inc(int idx) {
        wLock.lock();
        try {
            nums[idx] += 1;
        } finally {
            wLock.unlock();
        }
    }

    public int[] get() {
        rLock.lock();
        try {
            return Arrays.copyOf(nums, nums.length);
        } finally {
            rLock.unlock();
        }
    }
}
