package multithreading.c02_basic_thread_handling;

import org.junit.Test;

public class InterruptTest {
    @Test
    public void testIsInterrupted() throws InterruptedException {
        Thread t = new MyThreadWithIsInterrupted();
        execute(t);
    }

    @Test
    public void testInterruptWhileTrue() throws InterruptedException {
        Thread t = new WhileTrue();
        execute(t);
    }

    @Test
    public void testInterruptSleep() throws InterruptedException {
        Thread t = new SleepForever();
        execute(t);
    }
    private void execute(Thread t) throws InterruptedException {
        t.start();
        Thread.sleep(2000);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class MyThreadWithIsInterrupted extends Thread {
    @Override
    public void run() {
        int n = 0;

        // Question, can be interrupted? -> Yes
        // Question, where is isInterrupted() from? -> t.interrupt()
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " Hello!");
        }
    }
}

class WhileTrue extends Thread {
    @Override
    public void run() {
        int n = 0;
        // Question, can be interrupted? -> No
        while (true) {
            n++;
            System.out.println(n + " Hello!");
        }
    }
}

class SleepForever extends Thread {
    @Override
    public void run() {
        int n = 0;
        // Question, can be interrupted? -> Yes
        try {
            Thread.sleep(5000*1000);
        } catch (InterruptedException e) {
            System.out.println("t thread is interrupted");
            e.printStackTrace();
        }
    }
}