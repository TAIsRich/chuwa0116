package Coding.hw6;

class ThreeThreads {
    private static Object lock = new Object();
    private static int ct = 1;
    private static volatile boolean oneDone=false, twoDone=false;

    public static void main(String[] args) {
        Thread t1 = new Thread(ThreeThreads::selfRunnable);
        Thread t2 = new Thread(ThreeThreads::selfRunnable);
        Thread t3 = new Thread(ThreeThreads::selfRunnable);

        t1.start();
        t2.start();
        t3.start();
    }

    public static void selfRunnable(){
        synchronized (lock){
            while (ct<=30){
                if (!oneDone){
                    while (ct<=10){
                        System.out.println(Thread.currentThread().getName() + ": " + ct++);
                    }
                    oneDone = true;

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    lock.notifyAll();
                }
                if (!twoDone){
                    while (ct<=20){
                        System.out.println(Thread.currentThread().getName() + ": " + ct++);
                    }
                    twoDone = true;
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    lock.notifyAll();
                }
                while (ct<=30){
                    System.out.println(Thread.currentThread().getName() + ": " + ct++);
                }
                lock.notifyAll();
            }
        }

    }


}
