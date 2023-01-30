package core.multithreading.c01_create;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/29/23
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Start new thread using extends Thread class");
    }
}
