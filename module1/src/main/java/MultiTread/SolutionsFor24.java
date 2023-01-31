package MultiTread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SolutionsFor24 {
    private static int n = 1;

    public static void main(String[] args) {
        /*
        Thread t1 = new Thread(() -> printNumber());
        Thread t2 = new Thread(() -> printNumber());
        Thread t3 = new Thread(() -> printNumber());

        t1.start();
        t2.start();
        t3.start();

         */
        CounterReentrant counterReentrant = new CounterReentrant();
        Thread t1 = new Thread(() -> {
            counterReentrant.add(10,1);
        });

        Thread t2 = new Thread(() -> {
            counterReentrant.add(10,11);
        });

        Thread t3 = new Thread(() -> {
            counterReentrant.add(10,21);
        });

        t1.start();
        t2.start();
        t3.start();
    }

    private static synchronized void printNumber(){
        int count = 10;
        while(count-- > 0){
            System.out.println(Thread.currentThread().getName() + ": " + n++);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        SolutionsFor24.class.notifyAll();
    }
}

class CounterReentrant{
    private final Lock lock = new ReentrantLock();
    //private int value = 10;

    public void add(int value, int num){
        while(value-- > 0){
            lock.lock();
            try{
                System.out.println(Thread.currentThread().getName() + ": " + num++);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }finally {
                lock.unlock();
            }
        }

    }

}