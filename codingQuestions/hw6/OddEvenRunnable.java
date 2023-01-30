import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenRunnable implements Runnable{
    private static final ReentrantLock lock  = new ReentrantLock();
    private static final Condition condition = lock.newCondition();
    private final int n = 10;
    private static volatile int value = 1;
    @Override
    public void run() {
        while(value <= n){
            lock.lock();
            try{
                System.out.println(Thread.currentThread().getName() + ": " + value);
                value ++;
                condition.signal();
                if(value <= 10){
                    condition.await();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}