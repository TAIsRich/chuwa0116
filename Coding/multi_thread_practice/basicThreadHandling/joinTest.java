package basicThreadHandling;

/*
调用t.join(), main线程（调用者）会等t线程运行完后再继续运行

*/
public class joinTest {
    public static void main(String[] args){
        Thread t = new Thread(()->{
            System.out.println("Thread start");
            try {
                Thread.sleep(2000); // question, who sleep? -> who calls, who sleeps
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread end");
        });

        System.out.println("Main start...");
        t.start();
        try {
            System.out.println("Main thread is stopped and waiting for t thread end");
            t.join();   // main thread wait for t thread end. main thread's status is Timed Waiting.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main stop");
    }
}
