package basicThreadHandling;

// Who call Thread.sleep(), who sleeps
public class sleepTest {

    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(()->{
            System.out.println(" t thread starts... ");
            try {
                System.out.println("t thread starts to sleep 5 seconds");
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Main thread starts...");
        t.start();

        // if we try to comment this line, "Main thread starts to sleep 3 seconds" will be output prior to "t thread starts to sleep 5 seconds"
        Thread.sleep(3000);
        System.out.println("Main thread starts to sleep 3 seconds");
        System.out.println("Main thread done");
    }
}

/*
Main thread starts...
 t thread starts...
t thread starts to sleep 5 seconds
Main thread starts to sleep 3 seconds
Main thread done
 */