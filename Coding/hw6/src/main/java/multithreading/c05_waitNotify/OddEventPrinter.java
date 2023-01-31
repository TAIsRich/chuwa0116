package multithreading.c05_waitNotify;

public class OddEventPrinter {
    private static final Object lock = new Object();
    private static int value = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintRunnable());
        Thread t2 = new Thread(new PrintRunnable());

        t1.start();
        t2.start();

    }

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                while (value <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + value);
                    value += 1;
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
