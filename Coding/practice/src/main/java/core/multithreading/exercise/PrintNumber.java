package core.multithreading.exercise;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/30/23
 */
public class PrintNumber {

    private static final AtomicInteger val = new AtomicInteger(1);
    private static final Semaphore semaphore = new Semaphore(1);

    private static void printNumber() {
        try {
            semaphore.acquire(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i += 1) {
            System.out.println(Thread.currentThread().getName()
            + ": " + val.getAndIncrement());
        }
        semaphore.release(1);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(PrintNumber::printNumber);
        Thread t2 = new Thread(PrintNumber::printNumber);
        Thread t3 = new Thread(PrintNumber::printNumber);

        t2.start();
        t1.start();
        t3.start();
    }
}
