### 1.  Explain volatile variables in java? (we also use it in Singleton)
Volatile variables have the visibility features of synchronized but not the atomicity features. The values of the volatile variable will never be cached and all writes and reads will be done to and from the main memory.
### 2.  how to create a new thread(Please also consider Thread Pool case)?
- Extends Thread Class
- Implements Runnable
- Implements Callable
- Create the thread pool and submit the task to the thread pool
### 3.  Difference between Runnable and Callable
- runnable has no return
- callable has return
### 4.  what is the diff between t.start() and t.run()?
- t.start starts a new thread to excute the task.
- t.srun() excute the task in the current thread.
### 5.  Which way of creating threads is better: Thread class or Runnable interface?
It is preferred to implement a Runnable interface instead of extending Thread class. As implementing Runnable makes your code loosely coupled as the code of thread is different from the class that assign job to the thread.
### 6.  what is the thread status?
- New
- Runnable
- Blocked
- Waiting
- Timed_waiting
- Terminated
### 7. difference between wait() and sleep() method
The major difference is that wait() releases the lock while sleep() doesn't release any lock while waiting.
### 8.  What is deadlock?
Deadlock in java is a programming situation where two or more threads are blocked forever. 
### 9.  how do threads communicate with each other?
There are three ways for threads to communicate with each other. The first is through commonly shared data. All the threads in the same program share the same memory space. If an object is accessible to various threads then these threads share access to that object's data member and thus communicate each other.
The second way for threads to communicate is by using thread control methods. There are such three methods by which threads communicate for each other :
- wait()
- join()
- notify()
- notifyAll()
### 10. what is join() method?
This method can be used for the caller thread to wait for the completion of called thread.
### 11. what is yield() method
The yield() method is used in Java to hint the task scheduler to move the currently executing task to the Ready state and move another task or thread to the running state.
### 12. Explain thread pool
Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.
### 13. What is Executor Framework in Java, its different types and how to create these  executors?
The Executor Framework contains a bunch of components that are used to efficiently manage multiple threads. It was released with the JDK 5 which is used to run the Runnable objects without creating new threads every time and also mostly re-using the already created threads.
### 14. Difference between shutdown() and shutdownNow() methods of executor
Two different methods are provided for shutting down an ExecutorService. The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.
### 15. What is Atomic classes? when do we use it?
The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It also supports atomic operations.
### 16. What is the cocurrent collections?
The concurrent collection APIs, apart from the Java Collection API, are a set of collections APIs that are designed and optimized specifically for synchronized multithreaded access. They are grouped under the java. util. concurrent package.
### 17.  what kind of locks you know? 
- ReentrantLock
- ReadWriteLock
- StampedLock
### 18. What is the difference between class lock and object lock?
Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread. Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.
### 19. What is future and completableFuture?
A Future represents the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation. CompletableFuture is used for asynchronous programming in Java. Asynchronous programming is a means of writing non-blocking code by running a task on a separate thread than the main application thread and notifying the main thread about its progress, completion or failure.
### 20. what is ThreadLocal?
The ThreadLocal class in Java allows programmers to create variables that are accessible only to the thread that created them. This
### 21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)
### 22. Read those interview questions and pick some important questions to this homework.
- What is callable? what is the diff between callable and runnable?
    - Callable ia a task that returns a result and may throw an exception.The difference between callable and runnable is runnable has no return and callable has return.
- How to create a new thread?
    * Extends Thread Class
    * Implements Runnable
    * Implements Callable
    * Create the thread pool and submit the task to the thread pool
### 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print  2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
a. One solution use synchronized and wait notify
```
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
b. One solution use ReentrantLock and await, signal
```
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEventPrinter1 {
    private static Lock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    private static int value = 1;

    public static void main(String[] args) {
        OddEventPrinter.PrintRunnable runnable = new OddEventPrinter.PrintRunnable();
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
                    try {
                        if (value < 11) {
                            condition.await();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
```
### 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)
```
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
