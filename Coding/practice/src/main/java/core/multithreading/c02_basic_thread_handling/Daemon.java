package core.multithreading.c02_basic_thread_handling;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/29/23
 */
public class Daemon {

    public static void main(String[] args) {
        Thread tPeople = new Thread(new People());
        Thread tGod1 = new Thread(new God());
        Thread tGod2 = new Thread(new God());

        tGod1.setDaemon(true);
        tGod1.start();
        tPeople.start();
        tGod2.setDaemon(true);
        tGod2.start();
        System.out.println("Main end");
    }
}

class People implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("people live");
        }
        System.out.println("people thread end");
    }
}

class God implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("上帝守护你");
        }
    }
}
