### 1.  Explain volatile variables in java? (we also use it in Singleton)
A  volatile variable in Java is a type of variable that is guaranteed to be visible multiple threads. When a thread accesses a volatile variable, the JVM will ensure that the thread sees the most up-to-date value of the variable, rather than a cached value in the thread's local memory.

### 2. how to create a new thread(Please also consider Thread Pool case)?
1.Extending the Thread class:
```java
class MyThread extends Thread {
    public void run() {
        // code that will be executed in the new thread
    }
}
MyThread myThread = new MyThread();
myThread.start();
```
2.Implementing the Runnable interface:
```java
class MyRunnable implements Runnable {
public void run() {
// code that will be executed in the new thread
}
}
Thread thread = new Thread(new MyRunnable());
thread.start();
```
3.Implmenting the Callable interface (include return values):
```java
class CallableThread implements Callable {
                    public Integer call() throws Exception {
                        System.out.println(Thread.currentThread().getName() + " thread is created by implementing Callable interface");
                        return 123;
                    }
Callable<Integer> sumTask = new Callable<Integer>(new CallableThread);
sumTask.call();
```
4.Thread pool:
```java
ExecutorService threadPool = new ThreadPoolExecutor(
                        2,
                        5,
                        2L,
                        TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(4),
                        Executors.defaultThreadFactory(),
                        new ThreadPoolExecutor.DiscardOldestPolicy()
                );

                for (int i=1; i<=10; i++) {
                    int finalI = i;
                    threadPool.execute(() -> {
                        System.out.println(Thread.currentThread().getName() + " is working on " + finalI + " task");
                    });
                }
                threadPool.shutdown();
```
### 3.  Difference between Runnable and Callable
Runnable                         
>It has no  return values<br>
>You needs to override the run() method in Java.<br>
>It cannot throw a checked Exception.<br>

Callable
>It has return values<br>
>You need to override the call()<br>
>It can throw a checked Exception.

### 4.  what is the diff between t.start() and t.run()?
t.start() Its starts a new thread to execute the task.<br>
t.run() Its executes this task in the current, rather than creating a new thread
### 5.  Which way of creating threads is better: Thread class or Runnable interface?
The Runnable interface is more flexible and scalable than the Thread class because it allows multiple threads to share the same Runnable object, which reduces memory overhead. Additionally, it allows you to design classes that can be executed by any Thread object, making it easier to reuse code.
### 6.  what is the thread status?
**_New_**: The thread has been created but has not yet been started.

**_Runnable_**: The thread is executing and has not been blocked or blocked for a short period of time.

**_Blocked_**: The thread is blocked, waiting for a resource to become available or for a specific event to occur.

**_Waiting_**: The thread is waiting indefinitely for another thread to perform a specific action.

**_Timed_** waiting: The thread is waiting for a specified amount of time for another thread to perform a specific action.

**_Terminated_**: The thread has completed its execution or has been interrupted.
### 7. difference between wait() and sleep() method
sleep() is a static method of the Thread class and is used to pause the execution of the current thread for a amount of time. The thread remains in the runnable state and can be interrupted during its sleep.<br>
wait() is an instance method of the Object class and is used for inter-thread communication.When a thread calls a method on an object called wait(), it releases its lock on the object and enters the wait state. This thread can only be awakened by another thread that calls notify() or notifyAll() on the same object.

### 8.  What is deadlock?
Two or more threads are waiting for each other.
Deadlock in Java is a condition where two or more threads are blocked forever, waiting for each other.

### 9.  how do threads communicate with each other?
The wait() and notify() methods of the Object class allow threads to communicate and coordinate their actions. One thread can call wait() on an object to give up the lock and go into a waiting state, while another thread can call notify() on the same object to wake up the waiting thread.

### 10. what is join() method?
Join() allows one thread to wait for the completion of another thread. When a thread calls the join() method on another thread, the calling thread is blocked and does not resume execution until the specified thread has completed its execution.

### 11. what is yield() method
The yield() can stop the currently executing thread and will give a chance to other waiting threads of the same priority. If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution.
### 12. Explain thread pool
A thread pool is a group of pre-instantiated, idle threads which stand ready to be given work. These are preferred over instantiating new threads for each task when there is a large number of short tasks to be done rather than a small number of long ones. This prevents having to incur the overhead of creating a thread a large number of times.

### 13. What is Executor Framework in Java, its different types and how to create these executors?
The Executor Framework contains a bunch of components that are used to efficiently manage multiple threads. It is used to run the Runnable objects without creating new threads every time and also mostly re-using the already created threads.<br>
Type:
>SingleThreadExecutor<br>
ExecutorService executor = Executors.newSingleThreadExecutor();

>FixedPoolExecutor <br>
ExecutorService fixedPool = Executors.newFixedThreadPool(2);

>CachedThreadExecutor<br>
ExecutorService executorService = Executors.newCachedThreadPool();

>ScheduledExecutor<br>
ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);

### 14. Difference between shutdown() and shutdownNow() methods of executor
The shutdown() initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted.<br>
The shutdownNow(), forcibly, attempts to stop all actively executing tasks, halts the processing of waiting tasks, and returns a list of the tasks that were awaiting execution.

### 15. What is Atomic classes? when do we use it?
The atomic classes provide a **_lock-free_** and **_thread-safe_** environment or programming on a single variable. It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable.

### 16. What is the concurrent collections?
Concurrent collection APIs are an addition to Java from version 5 .They are an improvement of existing collection APIs and have been designed for concurrent access from multiple threads.

### 17.  what kind of locks you know?
1. ReentrantLock
2. ReadWriteLock
3. StampedLock
### 18. What is the difference between class lock and object lock?
**_Object Level Locks_** − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread.<br>
**_Class Level locks_** − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime. It should always be used to make static data thread safe.

### 19. What is future and completableFuture?
Limitations of Future:
1. It cannot be manually completed
2. We cannot perform further action on a Future’s result without blocking:
Future does not notify you of its completion. It provides a get() method which blocks until the result is available.
3. Multiple Futures cannot be chained together
4. We can not combine multiple Futures together :
5. No Exception Handling

So completableFuture is an extension of Future

### 20. what is ThreadLocal?
The Java ThreadLocal class enables we to create variables that can only be read and written by the same thread.
The TheadLocal construct allows us to store data that will be accessible only by a specific thread.
Eg.
```java
ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();
```
when we want to use this value from a thread, we only need to call a get() or set() method. Simply put, we can imagine that ThreadLocal stores data inside of a map with the thread as the key.
```java
threadLocalValue.set(1);
Integer result = threadLocalValue.get();
```
### 21. Type the code by your self and try to understand it. (packagecom.chuwa.tutorial.t08_multithreading)
### 22. Read those interview questions and pick some important questions to this homework.
### 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter) 
a. One solution use synchronized and wait notify
b. One solution use ReentrantLock and await, signal
```java
public class ThreadTest { //One solution use synchronized and wait notify
    private static final Object obj = new Object();
    public  static  int value = 1;
    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();

    }
}
class PrintRunnable implements Runnable{

    @Override
    public void run() {
        synchronized (this){
            while (ThreadTest.value<=10){
                System.out.println(Thread.currentThread().getName() + ": " + ThreadTest.value++);
                this.notify();
                if(ThreadTest.value<11){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }
}
```
b
```java
public class ThreadTest1 {
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();
    private static  int value = 1;
    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
                lock.lock();
                try {
                    while (value <= 10) {
                        System.out.println(Thread.currentThread().getName() + ": " + value++);
                        condition.signal();

                        if(value< 11){
                            try {
                                condition.await();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }finally {
                    lock.unlock();
                }

            }
        }
    }
```

### 24.create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)
```java
public class PrintNumber {
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

        PrintNumber.class.notifyAll();
    }
}
```