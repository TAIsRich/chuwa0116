### 1. Explain volatile variables in java? 
The value of a volatile field becomes visible to all readers (other threads in particular) after a write operation completes on it. Without volatile, readers could see some non-updated value.

### 2. how to create a new thread(Please also consider Thread Pool case)?
Implements Runnable
```agsl
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Start new thread using Runnable");
    }
}
Thread t2=new Thread(new MyRunnable);
```
Implements Callable

```agsl
public class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception{
    Thread.sleep(5000);
    return "Start New Thread using Callable";
    }
}
```

Extends Thread Class
```agsl
public class MyThread extends Thread{
    @Override
    public void run(){
    System.out.println("start new thread using extends 
thread");
    }
    Thread t=new MyThread();
    t.start();
}
```

Thread Pool

```agsl
ExecutorService executor=Executors.newFixedThreadPool(1);
executor.submit(tast1);
```

### 3. Difference between Runnable and Callable
Runnable has not return
Callable has return

### 4. what is the diff between t.start() and t.run()?
t.start starts a new thread to execute the task（run()）
t.run() excute the task in the current thread.

### 5. Which way of creating threads is better: Thread class or Runnable interface?
Runnable Interface. As implementing Runnable makes your code loosely coupled as the code of thread is different from the class that assign job to the thread. It requires less memory and also allows a class to inherit any other class.

### 6.  what is the thread status
New, Runnable, Running, Blocked(Non-runnable state), Waiting, Dead
### 7. difference between wait() and sleep() method
A wait() can be "woken up" by another thread calling notify on the monitor which is being waited on whereas a sleep cannot.
Also a wait (and notify) must happen in a block synchronized on the monitor object whereas sleep() does not.
### 8. What is deadlock
Deadlock is a situation where a set of processes are blocked because each process is holding a resource and waiting for another resource acquired by some other process. 

### 9. how do threads communicate with each other?
All the threads in the same program share the same memory space. If an object is accessible to various threads then these threads share access to that object's data member and thus communicate each other.
The second way for threads to communicate is by using thread control methods.

### 10. what is join() method
Join method in Java allows one thread to wait until another thread completes its execution.

### 11. what is yield() method
The yield() basically means that the thread is not doing anything particularly important and if any other threads or processes need to be run, they should run

### 12. Explain thread pool
Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.
In the case of a thread pool, a group of fixed-size threads is created. A thread from the thread pool is pulled out and assigned a job by the service provider. After completion of the job, the thread is contained in the thread pool again.

### 13. What is Executor Framework in Java, its different types and how to create these executors?

Java executor framework (java. util. concurrent. Executor), released with the JDK 5 is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads. 
Different types:
+ SingleThreadExecutor
```agsl
ExecutorService executor = Executors.newSingleThreadExecutor();
```
+ FixedThreadPool(n)
```agsl
ExecutorService fixedPool = Executors.newFixedThreadPool(2);
```
+ CachedThreadPool
```agsl
ExecutorService executorService = Executors.newCachedThreadPool();
```
+ ScheduledExecutor
```agsl
ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);
```

### 14. Difference between shutdown() and shutdownNow() methods of executor
+ shutdown() will just tell the executor service that it can't accept new tasks, but the already submitted tasks continue to run
+ shutdownNow() will do the same AND will try to cancel the already submitted tasks by interrupting the relevant threads. Note that if your tasks ignore the interruption, shutdownNow will behave exactly the same way as shutdown.

### 15. What is Atomic classes? when do we use it?
When multiple threads attempt to update the same value through CAS, one of them wins and updates the value. However, unlike in the case of locks, no other thread gets suspended; instead, they're simply informed that they did not manage to update the value. The threads can then proceed to do further work and context switches are completely avoided

When to use:
When we want to do some minor changes in one thread but do not want to use locks to disturb the execution of other threads.

### 16. What is the concurrent collections
The concurrent collection APIs, apart from the Java Collection API, are a set of collections APIs that are designed and optimized specifically for synchronized multithreaded access. They are grouped under the java.util.concurrent package. 

### 17. what kind of locks you know
+ ReentrantLock
+ ReentrantReadWriteLock
+ StampedLock 

### 18. What is the difference between class lock and object lock
+ Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread.
+ Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime. It should always be used to make static data thread safe

### 19. What is future and completableFuture
+ Future: They're basically placeholders for a result of an operation that hasn't finished yet. Once the operation finishes, the Future will contain that result.
+ CompletableFutures:  Using CompletableFutures, you can do something with the result of the operation without actually blocking a thread to wait for the result. 

### 20. what is ThreadLocal
The ThreadLocal class in Java allows programmers to create variables that are accessible only to the thread that created them

### 21. Type the code by your self and try to understand it. (package
com.chuwa.tutorial.t08_multithreading)

### 22. Read those interview questions and pick some important questions to this home
work.

### 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)

+ a. One solution use synchronized and wait notify
```agsl
public class OddEventPrinter {
    private static final Object monitor = new Object();
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (monitor) {
                while (value <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    monitor.notify();
                    try {
                        if (value < 11) {
                            monitor.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
```

+ One solution use ReentrantLock and await, signal
```agsl
static class PrintRunnable implements Runnable{
    private final Lock lock=new ReentrantLock();
    private final Condition condition=lock.newCondition();
    @Override
    public void run(){
        lock.lock();
        try{
            while(value<=10){
            System.out.println(Thread.currentThread().getName() + ": " + 
value++);
            condition.signal();
            try{
                condition.await();
            }
            catch(InterruptionException e){
                e.printStackTrace();
            }
            }
            finall{
            lock.unlock();
            }
        }
    }
}
```

### 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one threadoutput 21-22. threads run sequence is random. (solution is in com chuwa.exercise.t08_multithreading.PrintNumber1)
```agsl
public class PrintNumber1 {
    private static int n = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printNumber());
        Thread t2 = new Thread(() -> printNumber());
        Thread t3 = new Thread(() -> printNumber());

        t1.start();
        t2.start();
        t3.start();
    }

    private static synchronized void printNumber() {
        int count = 10;
        while (count-- > 0) {
            System.out.println(Thread.currentThread().getName() + ": " + n++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        PrintNumber1.class.notifyAll();
    }
}
```


