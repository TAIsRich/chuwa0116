package thread;

/**
 * @author Zhipeng Yin
 * @date 2023-01-30 19:06
 */
public class ThreadTest {
    private static final Object obj = new Object();
    public  static  int value = 1;
    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();

    }
}
class PrintRunnable implements Runnable{

    @Override
    public void run() {
        synchronized (this){
            while (ThreadTest.value<=10){
                System.out.println(Thread.currentThread().getName() + ": " + ThreadTest.value++);
                this.notify();
                if(ThreadTest.value<11){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }
}
