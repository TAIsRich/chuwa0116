package core.multithreading.c02_basic_thread_handling;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/29/23
 */
public class JoinTest {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("t start");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t end");
        });

        System.out.println("Main start");
        t.start();
        try {
            System.out.println("main stop waiting for t");
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main stop");
    }
}
