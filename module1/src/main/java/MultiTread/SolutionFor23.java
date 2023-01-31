package MultiTread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SolutionFor23 {
    private static final Object monitor = new Object();
    private static int value = 1;

    public static void main(String[] args) throws InterruptedException {
        //using synchronized
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();

    /*
        //using lock
        PrintOddEven printer = new PrintOddEven();
        Thread t1 = new Thread(printer::print);
        Thread t2 = new Thread(printer::print);
        t1.start();
        t2.start();

     */

    }

    //Solution used synchronized and wait notify
    static class PrintRunnable implements Runnable{

        @Override
        public void run() {
            synchronized (monitor){
                while(value <= 10){
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    monitor.notify();
                    try {
                        if(value < 11){
                            monitor.wait();
                        }
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

//Solution used lock
class PrintOddEven{
    private int value = 1;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public void print(){
        while(value <= 10){
            lock.lock();
            try{
                System.out.println(Thread.currentThread().getName() + ": " + value++);
                condition.signalAll();
                try{
                    condition.await();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }finally {
                lock.unlock();
            }
        }
    }
}
