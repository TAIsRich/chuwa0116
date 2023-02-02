package util_concurrent_locks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockLearn {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ArrayList<Thread> threads = new ArrayList<>();
        ArrayList<Thread> tWrites = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Thread tRead = new Thread(() -> {
                int[] nums = counter.get();
                for (int num : nums) {
                    System.out.print(num + " ");
                }
                System.out.println();
            });
            tRead.start();
            threads.add(tRead);
        }

        for (int j = 0; j < 2; j++) {
            Thread tWrite = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    counter.inc(i);
                }
            });
            tWrite.start();
            tWrites.add(tWrite);
        }

        Thread.sleep(15000);
        for (Thread thread : threads) thread.interrupt();
    }
}

class Counter {
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private final Lock rLock = rwLock.readLock();
    private final Lock wLock = rwLock.writeLock();
    private final int[] counts = new int[10];

    public void inc(int index){
        wLock.lock();
        try {
            counts[index] += 1;
        } finally {
            wLock.unlock();
        }
    }

    public int[] get() {
        rLock.lock();
        try {
            return Arrays.copyOf(counts, counts.length);
        } finally {
            rLock.unlock();
        }
    }
}
