public class OddEvenPrinterWithReentrantLockTest {
    public static void main(String[] args) {
        OddEvenRunnable oddEvenRunnable = new OddEvenRunnable();
        new Thread(oddEvenRunnable).start();
        new Thread(oddEvenRunnable).start();
    }
}
