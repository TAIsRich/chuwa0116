package c02_basic_thread_handling;

public class JoinTest {
  public static void main(String[] args) throws InterruptedException {
    Thread t =
        new Thread(
            () -> {
              System.out.println("Thread starts");
              try {
                Thread.sleep(2000);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
              System.out.println("Thread ends");
            });

    System.out.println("Main starts");
    t.start();
    try {
      System.out.println("Main thread is stopped and waiting for t thread end");
      t.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Main ends");
  }
}
