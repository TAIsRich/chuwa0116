package syncronized;

public class SynchronizedThreadsFailed {
    public static void main(String[] args) throws InterruptedException {
        Thread[] ts = {
                new AddStudentThreadFailed(),
                new DecStudentThreadFailed(),
                new AddTeacherThreadFailed(),
                new DecTeacherThreadFailed()
        };

        for (Thread t : ts){
            t.start();
        }

        for (Thread t : ts){
            t.join();
        }

        System.out.println(CounterFailed.studentCount);
        System.out.println(CounterFailed.teacherCount);
    }
}

class CounterFailed {
    public static final Object LOCK_STUDENT = new Object();
    public static final Object LOCK_TEACHER = new Object();
    public static final Object LOCK_COMMON = new Object();
    public static int studentCount = 0;
    public static int teacherCount = 0;
}

class AddStudentThreadFailed extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++){
            synchronized (CounterFailed.LOCK_STUDENT){
                CounterFailed.studentCount++;
            }
        }
    }
}

class DecStudentThreadFailed extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++){
            synchronized (CounterFailed.LOCK_TEACHER){
                CounterFailed.studentCount--;
            }
        }
    }
}

class AddTeacherThreadFailed extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++){
            synchronized (CounterFailed.LOCK_COMMON){
                CounterFailed.teacherCount++;
            }
        }
    }
}

class DecTeacherThreadFailed extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++){
            synchronized (CounterFailed.LOCK_COMMON){
                CounterFailed.teacherCount--;
            }
        }
    }
}