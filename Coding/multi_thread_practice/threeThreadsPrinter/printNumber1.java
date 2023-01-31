package threeThreadsPrinter;

public class printNumber1 {
    private static int n = 1;

    public static void main(String[] args){
        Thread t1 = new Thread(printNumber1::printNumber);
        Thread t2 = new Thread(printNumber1::printNumber);
        Thread t3 = new Thread(()->printNumber());

        t1.start();
        t2.start();
        t3.start();
    }

    private static synchronized void printNumber(){
        int count = 0;
        while (count<10){
            System.out.println(Thread.currentThread().getName()+ ": " + n++);
            count += 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        printNumber1.class.notifyAll();

    }
}
