package basic_thread_handling;

import org.junit.Test;

public class InterruputTest {
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
        //interrupt()方法仅仅向t线程发出了“中断请求”，至于t线程是否能立刻响应，要看具体代码
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
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
        }
    }
}

class WhileTrue extends Thread {
    @Override
    public void run() {
        int n = 0;
        // Question, can be interrupted?
        while (true) {
            n++;
            System.out.println(n + " hello!");
        }
    }
}


class SleepForever extends Thread {
    @Override
    public void run() {
        int n = 0;
        // Question, can be interrupted?
        try {
            Thread.sleep(5000 * 1000);
        } catch (InterruptedException e) {
            System.out.println("t thread is interrupted");
            e.printStackTrace();
        }
    }
}
