import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Q24 {
  private static int val = 1;

  public static void main(String[] args) {
    MyRunnable r = new MyRunnable();
    Thread t1 = new Thread(r);
    Thread t2 = new Thread(r);
    Thread t3 = new Thread(r);

    t1.start();
    t2.start();
    t3.start();
  }

  static class MyRunnable implements Runnable {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    @Override
    public void run() {
      lock.lock();
      try {
        for (int i = 0; i < 10; i++) {
          System.out.println(Thread.currentThread().getName() + ": " + val++);
          try {
            Thread.sleep(500);
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
