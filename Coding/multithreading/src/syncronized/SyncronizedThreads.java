package syncronized;

public class SyncronizedThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread[] ts = new Thread[]{
                new AddStudentThread(),
                new DecStudentThread(),
                new AddTeacherThread(),
                new DecTeacherThread()
        };
        for (Thread t : ts) {
            t.start();
        }

        for (Thread t : ts) {
            t.join();
        }

        System.out.println(Counter.studentCount);
        System.out.println(Counter.teacherCount);
    }
}
class Counter {
    public static final Object LOCK_STUDENT = new Object();
    public static final Object LOCK_TEACHER = new Object();
    public static int studentCount = 0;
    public static int teacherCount = 0;
}

class AddStudentThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (Counter.LOCK_STUDENT) {
                System.out.println("add stu");
                Counter.studentCount += 1;
            }
        }
    }
}

class DecStudentThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (Counter.LOCK_STUDENT) {
                System.out.println("dele stu");
                Counter.studentCount -= 1;
            }
        }
    }
}

class AddTeacherThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (Counter.LOCK_TEACHER) {
                System.out.println("add teacher");
                Counter.teacherCount += 1;
            }
        }
    }
}

class DecTeacherThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (Counter.LOCK_TEACHER) {
                System.out.println("del teacher");
                Counter.teacherCount -= 1;
            }
        }
    }
}
