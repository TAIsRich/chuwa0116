package MultiTread.Basic_Thread_Handling;

public class JoinTest {
    //调用t.join()的线程(main)会stop，等待t线程运行完之后调用者(main线程)再继续运行
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread start");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thread end");
        });

        System.out.println("Main Start");
        t.start();
        try{
            System.out.println("Main thread is stopped and waiting for t thread end");
            t.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main stop");
    }
}
