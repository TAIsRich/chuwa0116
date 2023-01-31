# Homework 6

### 1. Explain volatile variables in java? (we also use it in Singleton)
volatile has semantics for memory visibility. Basically, the value of a volatile field becomes visible to all readers (other threads in particular) after a write operation completes on it. Without volatile, readers could see some non-updated value.


### 2. how to create a new thread(Please also consider Thread Pool case)?
Create a class that implements a the runnable interface/extends thread class, and overriding the run() method. Then, we can create a thread object and call the start() method. 
Or we can use java thread pool, after we create a thread pool, we could submit some tasks to threads and make them start. 

### 3. Difference between Runnable and Callable
```
Runnable interface           | Callable interface
------------------------------------------------------------------
The package named java.lang  | It is considered a part of a 
is used in this interface.   | package named java.util.concurrent.
------------------------------------------------------------------
Can’t throw an exception     | This interface can throw an exception
------------------------------------------------------------------
It uses the run() method     | Call() method is used in this regard
------------------------------------------------------------------
This interface can’t return  | A runnable interface can return the 
the result of any calculation| result of any processed task.
------------------------------------------------------------------
```

### 4. what is the diff between t.start() and t.run()?
t.start() will create a new thread to run tasks, t.run() will run tasks on the current thread.

### 5. Which way of creating threads is better: Thread class or Runnable interface?
It is preferred to implement a Runnable interface instead of extending Thread class. As implementing Runnable makes your code loosely coupled as the code of thread is different from the class that assign job to the thread. It requires less memory and also allows a class to inherit any other class.

### 6. what is the thread status?
Thread status is the status of a tread. A thread can be in only one state at a given point in time. 
There are 6 different status: NEW; RUNNABLE; BLOCKED; WAITING; TIMED_WAITING; TERMINATED;

### 7. difference between wait() and sleep() method
```
Runnable interface           | Callable interface
------------------------------------------------------------------
Wait() method belongs to     | Sleep() method belongs to Thread 
Object class.                | class.
------------------------------------------------------------------
Wait() method releases lock  | Sleep() method does not release 
during Synchronization.      | the lock on object during Synchronization.
------------------------------------------------------------------
Wait() should be called only | There is no need to call sleep() 
from Synchronized context.   | from Synchronized context.
------------------------------------------------------------------
Wait() is not a static method| Sleep() is a static method. 
------------------------------------------------------------------
Wait() Has Three Overloaded  | Sleep() Has Two Overloaded Methods
Methods                      |
------------------------------------------------------------------
```

### 8. What is deadlock?
Deadlock is a situation where a set of processes are blocked because each process is holding a resource and waiting for another resource acquired by some other process. 

### 9. how do threads communicate with each other?
All the threads in the same program share the same memory space. If an object is accessible to various threads then these threads share access to that
 object's data member and thus communicate each other. The second way for threads to communicate is by using thread control methods, these methods are
 wait(), notify(), notifyAll(). 

### 10. what is join() method?
Join method in Java allows one thread to wait until another thread completes its execution. In simpler words, it means it waits for the other thread to die. It has a void type and throws InterruptedException.

### 11. what is yield() method
The yield() method is used in Java to hint the task scheduler to move the currently executing task to the Ready state and move another task or thread to the running state. The task scheduler is free to ignore the hint. Through the yield() method, a thread is willing to yield or relinquish its current use of the processor.

### 12. Explain thread pool
Java thread pool reuses previously created threads to execute current tasks and offers a solution to the problem of thread cycle overhead and resource thrashing. Since the thread is already existing when the request arrives, the delay introduced by thread creation is eliminated, making the application more responsive.

### 13. What is Executor Framework in Java, its different types and how to create these executors?
The Executor framework in Java is a utility class that helps to execute tasks concurrently. There are different types of executors, such as FixedThreadPool, SingleThreadExecutor, CachedThreadPool, and ScheduledThreadPool. We can create these executors using the Executors factory class.

### 14. Difference between shutdown() and shutdownNow() methods of executor
The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks. 


### 15. What is Atomic classes? when do we use it?
The java.util.concurrent.atomic package defines classes that support atomic operations on single variables. All classes have get and set methods that work like reads and writes on volatile variables. That is, a set has a happens-before relationship with any subsequent get on the same variable. The atomic compareAndSet method also has these memory consistency features, as do the simple atomic arithmetic methods that apply to integer atomic variables.
how to use: https://docs.oracle.com/javase/tutorial/essential/concurrency/atomicvars.html


### 16. What is the concurrent collections?
Concurrent collections are data structures in Java that are designed to be thread-safe and can be shared among multiple threads without the need for explicit synchronization. Some examples include ConcurrentHashMap, ConcurrentLinkedDeque, and ConcurrentSkipListMap.


### 17. what kind of locks you know?
Lock interfaces in Java include ReentrantLock, ReadWriteLock, and StampedLock. There is also the intrinsic lock or monitor lock that is automatically acquired and released by synchronized blocks and methods.

### 18. What is the difference between class lock and object lock?
Class lock: A lock acquired on the class itself, not on any instances of the class. Only one thread can acquire the class lock at any given time, making it a way to implement singleton behavior for the class and its subclasses.
Object lock: A lock acquired on a specific instance of an object. Multiple threads can acquire locks on different instances of the same class, allowing for multiple threads to access different instances of the object concurrently.

### 19. What is future and completableFuture?
Future is an interface that represents the result of an asynchronous computation. It allows the caller to retrieve the result of the computation and determine if the computation is complete.
CompletableFuture is an implementation of the Future interface that also allows the completion of the future to be dependent on the completion of other futures, providing a way to chain multiple asynchronous operations together.

### 20. what is ThreadLocal?
ThreadLocal is a class in Java that allows for data to be stored in a thread-local variable, meaning that the data is specific to the current thread and cannot be accessed by other threads. This can be useful for maintaining thread-specific data, such as a transaction ID or user ID.

### 21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)

### 22. Read those interview questions and pick some important questions to this homework
Can we use new Thread(lambda)? is it equal to implement Runnable? Why?
What is the difference between synchronized(this) and synchronized(Singleton.class)?

### 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
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

### 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)

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
