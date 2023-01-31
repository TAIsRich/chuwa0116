package multithreading.c01_creat;

public class Mythread extends Thread {
    @Override
    public void run(){
        System.out.println("start new thread using extends thread");
    }
}
