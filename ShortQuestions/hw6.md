## 1.  Explain volatile variables in java? (we also use it in Singleton)
    In Java, a volatile variable is a type of variable that is designated with the volatile keyword. This ensures that the value of the variable is always kept in the main memory and not in the CPU cache. When multiple threads access a volatile variable, each thread will see the latest value written by any other thread.
## 2.  how to create a new thread(Please also consider Thread Pool case)?
    To create a new thread in Java, you can extend the Thread class or implement the Runnable interface. Then, you can create an instance of the class and call the start() method to start the thread. 

    Thread t = new Thread(new Runnable());
    t.start();

    To use a thread pool, you can create an Executor and use its execute() method to submit Runnable or Callable tasks.

    ExecutorService executor = Executors.newFixedThreadPool(3);
    executor.submit(task1);

## 3.  Difference between Runnable and Callable
    The Runnable interface represents a task that can be executed by a single thread, while Callable is a functional interface similar to Runnable but allows for a return value and the ability to throw an exception.

## 4.  what is the diff between t.start() and t.run()?
    t.start() will create a new thread and then excute run(), t.run() doesn't invoke creating a new thread.

## 5.  Which way of creating threads is better: Thread class or Runnable interface?
    Using the Runnable interface is considered a better approach compared to using the Thread class as it allows multiple classes to share the same interface and be executed by a single thread, while the Thread class can only be extended by a single class and cannot be reused.

## 6.  what is the thread status?
    New, Runnable, Blocked, Waiting, Timed Waiting, and Terminated.

## 7. difference between wait() and sleep() method
    The wait() method releases the lock on the current object and waits for another thread to call the notify() or notifyAll() method. The sleep() method is a static method that causes the current thread to pause for a specified number of milliseconds.

## 8.  What is deadlock?
    Deadlock is a situation in which two or more threads are blocked forever, waiting for each other to release a lock.

## 9.  how do threads communicate with each other?
    Threads can communicate with each other using the wait(), notify(), and notifyAll() methods, or by using a shared object or variable.

## 10. what is join() method?
    The join() method is used to wait for a thread to finish its execution. The calling thread will block until the execution of the thread it joins is complete.

## 11. what is yield() method
    The yield() method is used to temporarily pause the current thread to give other threads a chance to run.

## 12. Explain thread pool
    Generally, we create a thread for each task, and this is often expensive. Thread pool allows us to multiple tasks to dynamic size of threads. 

## 13. What is Executor Framework in Java, its different types and how to create these executors?
    The Executor framework in Java is a utility class that helps to execute tasks concurrently. There are different types of executors, such as FixedThreadPool, SingleThreadExecutor, CachedThreadPool, and ScheduledThreadPool. You can create these executors using the Executors factory class.

## 14. Difference between shutdown() and shutdownNow() methods of executor
    The shutdown() method of the executor stops the acceptance of new tasks, while the shutdownNow() method tries to stop all the running tasks and return a list of tasks that were not executed.

## 15. What is Atomic classes? when do we use it?
    The Atomic classes in Java provide a set of classes that support atomic operations on single variables. These classes are used when you need to update a single variable in a thread-safe manner.

## 16. What is the cocurrent collections?
    Concurrent collections are data structures in Java that are designed to be thread-safe and can be shared among multiple threads without the need for explicit synchronization. Some examples include ConcurrentHashMap, ConcurrentLinkedDeque, and ConcurrentSkipListMap.

## 17.  what kind of locks you know? 
    Lock interfaces in Java include ReentrantLock, ReadWriteLock, and StampedLock. There is also the intrinsic lock or monitor lock that is automatically acquired and released by synchronized blocks and methods.

## 18. What is the difference between class lock and object lock?
    Class lock: A lock acquired on the class itself, not on any instances of the class. Only one thread can acquire the class lock at any given time, making it a way to implement singleton behavior for the class and its subclasses.
    Object lock: A lock acquired on a specific instance of an object. Multiple threads can acquire locks on different instances of the same class, allowing for multiple threads to access different instances of the object concurrently.

## 19. What is future and completableFuture?
    Future is an interface that represents the result of an asynchronous computation. It allows the caller to retrieve the result of the computation and determine if the computation is complete.
    CompletableFuture is an implementation of the Future interface that also allows the completion of the future to be dependent on the completion of other futures, providing a way to chain multiple asynchronous operations together.

## 20. what is ThreadLocal?
    ThreadLocal is a class in Java that allows for data to be stored in a thread-local variable, meaning that the data is specific to the current thread and cannot be accessed by other threads. This can be useful for maintaining thread-specific data, such as a transaction ID or user ID.

## 21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)
## 22. Read those interview questions and pick some important questions to this homework.
    What is the difference between synchronized(this) and 
    synchronized(Singleton.class)?

## 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)


a. One solution use synchronized and wait notify

```java:
class OddEventPrinter {
    private int count = 1;
    private Object lock = new Object();

    public void printOdd() {
        while (count < 10) {
            synchronized (lock) {
                if (count % 2 != 0) {
                    System.out.println("Thread-0: " + count);
                    count++;
                }
                lock.notifyAll();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printEven() {
        while (count < 10) {
            synchronized (lock) {
                if (count % 2 == 0) {
                    System.out.println("Thread-1: " + count);
                    count++;
                }
                lock.notifyAll();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

```


b. One solution use ReentrantLock and await, signal

```java:
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class OddEventPrinter {
    private int count = 1;
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void printOdd() {
        while (count < 10) {
            lock.lock();
            try {
                if (count % 2 != 0) {
                    System.out.println("Thread-0: " + count);
                    count++;
                }
                condition.signalAll();
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public void printEven() {
        while (count < 10) {
            lock.lock();
            try {
                if (count % 2 == 0) {
                    System.out.println("Thread-1: " + count);
                    count++;
                }
                condition.signalAll();
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}

```

```
    Thread-0: 1
    Thread-1: 2
    Thread-0: 3
    Thread-1: 4
    Thread-0: 5
    Thread-1: 6
    Thread-0: 7
    Thread-1: 8
    Thread-0: 9
    Thread-1: 10
    Process finished with exit code 0
```

## 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1

```    
Thread-0: 1
Thread-0: 2
Thread-0: 3
Thread-0: 4
Thread-0: 5
Thread-0: 6
Thread-0: 7
Thread-0: 8
Thread-0: 9
Thread-0: 10
Thread-2: 11
Thread-2: 12
Thread-2: 13
Thread-2: 14
Thread-2: 15
Thread-2: 16
Thread-2: 17
Thread-2: 18
Thread-2: 19
Thread-2: 20
Thread-1: 21
Thread-1: 22
Thread-1: 23
Thread-1: 24
Thread-1: 25
Thread-1: 26
Thread-1: 27
Thread-1: 28
Thread-1: 29
Thread-1: 30
```

```java:
public class PrintNumber implements Runnable {
    private int start;
    private int end;

    public PrintNumber(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PrintNumber printNumber = new PrintNumber(1, 10);
        Thread t1 = new Thread(printNumber);
        t1.start();
        t1.join();

        PrintNumber printNumber2 = new PrintNumber(11, 20);
        Thread t2 = new Thread(printNumber2);
        t2.start();
        t2.join();

        PrintNumber printNumber3 = new PrintNumber(21, 30);
        Thread t3 = new Thread(printNumber3);
        t3.start();
        t3.join();
    }
}


```