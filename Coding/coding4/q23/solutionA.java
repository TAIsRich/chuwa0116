package q23;

public class solutionA {
  private static final Object monitor = new Object();
  private static int val = 1;

  public static void main(String[] args) {
    MyRunnable r = new MyRunnable();
    new Thread(r).start();
    new Thread(r).start();
  }

  static class MyRunnable implements Runnable {
    @Override
    public void run() {
      while (val <= 10) {
        synchronized (monitor) {
          System.out.println(Thread.currentThread().getName() + ": " + val);
          val++;
          monitor.notify();
          try {
            if (val < 11) monitor.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
