package MultiTread.Basic_Thread_Handling;

import org.junit.Test;

public class InterruptTest {
    //中断线程就是其他线程给该线程发一个信号，该线程收到信号后结束执行run()方法，使得自身线程能立刻结束运行。
    //main线程通过调用t.interrupt()方法中断t线程，但是要注意，interrupt()方法仅仅向t线程发出了“中断请求”，
    //至于t线程是否能立刻响应，要看具体代码。而t线程的while循环会检测isInterrupted()，所以上述代码能正确响应interrupt()请求，
    //使得自身立刻结束运行run()方法。
    @Test
    public void testIsInterrupted() throws InterruptedException{
        Thread t = new MyThreadWithIsInterrupted();
        execute(t);

    }

    @Test
    public void testInterruptedWhileTrue() throws InterruptedException{
        Thread t = new WhileTrue();
        execute(t);
    }

    @Test
    public void testInterruptSleep() throws InterruptedException{
        Thread t = new SleepForever();
        execute(t);
    }

    private void execute(Thread t) throws InterruptedException{
        t.start();
        Thread.sleep(2000);
        t.interrupt();
        t.join();
        System.out.println("end");
    }



}

class MyThreadWithIsInterrupted extends Thread{
    @Override
    public void run(){
        int n = 0;
        while(!isInterrupted()){
            n++;
            System.out.println(n + "hello!");
        }
    }
}


class WhileTrue extends Thread{
    @Override
    public void run(){
        int n = 0;
        while(true){
            n++;
            System.out.println(n + "hello!");
        }
    }
}

class SleepForever extends Thread{
    @Override
    public void run(){
        int n = 0;
        try{
            Thread.sleep(5000 * 1000);
        }catch (InterruptedException e){
            System.out.println("t thread is interrupted");
            e.printStackTrace();
        }
    }
}
