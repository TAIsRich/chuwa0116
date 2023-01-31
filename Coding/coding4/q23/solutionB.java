package q23;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class solutionB {
  private static int val = 1;

  public static void main(String[] args) {
    solutionA.MyRunnable r = new solutionA.MyRunnable();
    new Thread(r).start();
    new Thread(r).start();
  }

  static class MyRunnable implements Runnable {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    @Override
    public void run() {
      while (val <= 10) {
        lock.lock();
        try {
          System.out.println(Thread.currentThread().getName() + ": " + val);
          val++;
          condition.signal();
          try {
            if (val < 11) condition.await();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        } finally {
          lock.unlock();
        }
      }
    }
  }
}
