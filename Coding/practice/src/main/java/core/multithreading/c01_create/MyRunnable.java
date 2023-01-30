package core.multithreading.c01_create;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/29/23
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Start new thread using Runnable");
    }
}
