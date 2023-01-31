package core.multithreading.c02_basic_thread_handling;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/29/23
 */
public class SleepTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Thread t starts....");
            try {
                System.out.println("Sleep 5 sec");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread t done.");
        });

        System.out.println("Thread main starts....");
        t.start();
        Thread.sleep(2000);
        System.out.println("Main sleep 3 sec");
        System.out.println("Main thread done");
    }
}
