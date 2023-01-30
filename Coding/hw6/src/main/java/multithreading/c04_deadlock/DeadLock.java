package multithreading.c04_deadlock;

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        Thread[] ts = new Thread[] {
                new Thread(() -> {
                    while (true) {
                        Counter.add(2);
                    }
                }),
                new Thread(() -> {
                    while (true) {
                        Counter.dec(2);
                    }
                }),
        };

        for (Thread t : ts) {
            t.start();
        }

        for (Thread t : ts) {
            t.join();
        }

        System.out.println("main thread");
    }
}

class Counter {
    public static final Object LOCK_A  = new Object();
    public static final Object LOCK_B  = new Object();
    public static int a = 0;
    public static int b = 0;

    public static void add(int m) {
        synchronized (LOCK_A) {
            a += m;
            synchronized (LOCK_B) {
                b += m;
            }
        }

        System.out.println("a is: " + a + ", b is: " + b);
    }

    public static void dec(int m) {
        synchronized (LOCK_A) {
            a -= m;
            synchronized(LOCK_B) {
                b -= m;
            }
        }

        System.out.println("a is: " + a + ", b is: " + b);
    }
}
