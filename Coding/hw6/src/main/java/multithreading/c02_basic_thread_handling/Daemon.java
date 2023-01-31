package multithreading.c02_basic_thread_handling;

public class Daemon {
    public static void main(String[] args) {
        Thread ppl = new Thread(new People());
        Thread god1 = new Thread(new God());
        Thread god2 = new Thread(new God());

        // question: 当其它线程都运行完后，守护线程会结束么？ -> YES
        // question: 当main 运行完后，守护线程会结束么？ -> No
        god1.setDaemon(true);
        god1.start();
        ppl.start();
        god2.setDaemon(true);
        god2.start();
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
            System.out.println("ppl live");
        }

        System.out.println("ppl thread end");
    }
}

class God implements  Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("God bless you");
        }
    }
}
