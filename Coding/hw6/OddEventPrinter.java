package Coding.hw6;

class OddEventPrinter {

    private static Object lock = new Object();
    private static int count = 1;

    public static void main(String[] args) {
        SelfRunnable r = new SelfRunnable();
        new Thread(r).start();
        new Thread(r).start();
    }

    static class SelfRunnable implements Runnable{
        @Override
        public void run(){
            synchronized (lock){
                while (count<=10){
                    System.out.println(Thread.currentThread().getName()+": "+count++);
                    lock.notifyAll();
                    if (count<=10){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
            }
        }
    }
}