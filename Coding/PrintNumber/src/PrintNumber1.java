public class PrintNumber1 {
    private static int n = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(PrintNumber1::printNumber);
        Thread t2 = new Thread(PrintNumber1::printNumber);
        Thread t3 = new Thread(PrintNumber1::printNumber);

        t1.start();
        t2.start();
        t3.start();
    }

    private static synchronized void printNumber() {
        int count = 10;
        while (count > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + n++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count--;
        }
        PrintNumber1.class.notifyAll();
    }
}