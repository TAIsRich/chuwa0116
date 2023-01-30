# HW6

## 1. Explain volatile variables in java? (we also use it in Singleton)

volatile means that the variable changes at runtime and that the compiler should not cache its value for any reason. It is a method to avoid threads work with stale data.

## 2. How to create a new thread(Please also consider Thread Pool case)?

Extends Thread Class

Implements Runnable

Implements Callable

Create a thread pool and submit task to thread pool

## 3. Difference between Runnable and Callable

runnable has no return

callable has return

## 4. what is the diff between t.start() and t.run()?

t.start() will create a new thread and run it.

t.run() will not create a new thread, it excute the task in the current thread.

## 5. Which way of creating threads is better: Thread class or Runnable interface?

Implementing Runnable is better. In this case, we can also extends other class.

## 6. What is the thread status?

New

Runnable

Blocked

Waiting

Timed_waiting

Terminated

## 7. difference between wait() and sleep() method

wait() is not a static method, sleep() is a static method.

wait() will release lock during waiting. sleep() will keep lock while waiting.

## 8. What is deadlock?

Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.

## 9. how do threads communicate with each other?

Threads communicate through shared memory by defining instance and class fields that are accessible from multiple threads.

The three methods that are used to implement inter-thread communication in Java

wait()

This method causes the current thread to release the lock. This is done until a specific amount of time has passed or another thread calls the notify() or notifyAll() method for this object.

notify()

This method wakes a single thread out of multiple threads on the current object’s monitor. The choice of thread is arbitrary.

notifyAll()

This method wakes up all the threads that are on the current object’s monitor.

## 10. what is join() method?

When we invoke the join() method on a thread, the calling thread goes into a waiting state. It remains in a waiting state until the referenced thread terminates.

## 11. what is yield() method?

The yield() basically means that the thread is not doing anything particularly important and if any other threads or processes need to be run, they should run. Otherwise, the current thread will continue to run.

## 12. Explain thread pool

Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.

## 13. What is Executor Framework in Java, its different types and how to create these executors?

Java executor framework  is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads. 

SingleThreadExecutor: `ExecutorService executor = Executors.newSingleThreadExecutor();`

FixedThreadPool(n): `ExecutorService fixedPool = Executors.newFixedThreadPool(2);`

CachedThreadPool: `ExecutorService executorService = Executors.newCachedThreadPool();`

ScheduledExecutor: `ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);`

## 14. Difference between shutdown() and shutdownNow() methods of executor

shutdown() will just tell the executor service that it can't accept new tasks, but the already submitted tasks continue to run

shutdownNow() will do the same AND will try to cancel the already submitted tasks by interrupting the relevant threads. Note that if your tasks ignore the interruption, shutdownNow will behave exactly the same way as shutdown.

## 15. What is Atomic classes? when do we use it?

Atomic package defines classes that support atomic operations on single variables. All classes have get and set methods that work like reads and writes on volatile variables. 

## 16. What is the cocurrent collections?

They are thread safe collections.

Thread safe collection for List is CopyOnWriteArrayList
Thread safe collection for Map is ConcurrentHashMap
Thread safe collection for Set is CopyOnWriteArraySet
Thread safe collection for Queue is ArrayBlockingQueue / LinkedBlockingQueue
Thread safe collection for Duque is LinkedBlockingDeque

## 17. what kind of locks you know?

ReentrantLock

ReadWriteLock

StampedLock


## 18. What is the difference between class lock and object lock?

Object-level lock: Every object in java has a unique lock. Whenever we are using a synchronized keyword, then only the lock concept will come into the picture. If a thread wants to execute then synchronized method on the given object. First, it has to get a lock-in that object. Once the thread got the lock then it is allowed to execute any synchronized method on that object. Once method execution completes automatically thread releases the lock. Acquiring and release lock internally is taken care of by JVM and the programmer is not responsible for these activities. 

Class level lock: Every class in Java has a unique lock which is nothing but a class level lock. If a thread wants to execute a static synchronized method, then the thread requires a class level lock. Once a thread got the class level lock, then it is allowed to execute any static synchronized method of that class. Once method execution completes automatically thread releases the lock. 

## 19. What is future and completableFuture?


A Future represents the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation.

CompletableFuture is used for asynchronous programming in Java. Asynchronous programming is a means of writing non-blocking code by running a task on a separate thread than the main application thread and notifying the main thread about its progress, completion or failure.

## 20. What is ThreadLocal?

The `TheadLocal` construct allows us to store data that will be accessible only by a specific thread.

## 22.Read those interview questions and pick some important questions to this home work.

27. Explain context switching.

Context switching is basically an important feature of multithreading. It is referred to as switching of CPU from one thread or process to another one. It allows multiple processes to share the same CPU. In context switching, the state of thread or process is stored so that the execution of the thread can be resumed later if required. 

32. What is busy spinning?

Busy Spinning, also known as Busy-waiting, is a technique in which one thread waits for some condition to happen, without calling wait or sleep methods and releasing the CPU. In this condition, one can pause a thread by making it run an empty loop for a certain time period, and it does not even give CPY control. Therefore, it is used to preserve CPU caches and avoid the cost of rebuilding cache.

41. Is it possible to call the run() method directly to start a new thread?

No, it's not possible at all. You need to call the start method to create a new thread otherwise run method won't create a new thread. Instead, it will execute in the current thread.

42. Is it possible that each thread can have its stack in multithreaded programming?

Of course, it is possible. In multithreaded programming, each thread maintains its own separate stack area in memory because of which every thread is independent of each other rather than dependent.

## 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)

```Java
class Playground {
    static int cur = 1;
    static int n = 10;

    public static void main(String[ ] args) {
        PrintFirst first = new PrintFirst();
        Thread t1 = new Thread(first);
        PrintSecond second = new PrintSecond();
        Thread t2 = new Thread(second);

        t2.start();
        t1.start();
    }

    static Object Lock1 = new Object();

    static class PrintFirst implements Runnable {
        @Override
        public void run() {
            while(cur <= 10){
                synchronized(Lock1){
                    while(cur % 2 != 1){
                        try{
                            Lock1.wait();
                        }
                        catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                    if(cur <= 10) System.out.println(Thread.currentThread().getName() + " : " + cur);
                    ++cur;
                    Lock1.notify();
                }
            }
        }
    }

    static class PrintSecond implements Runnable {
        @Override
        public void run() {
            while(cur <= 10){
                synchronized(Lock1){
                    while(cur % 2 != 0){
                        try{
                            Lock1.wait();
                        }
                        catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                    if(cur <= 10) System.out.println(Thread.currentThread().getName() + " : " + cur);
                    ++cur;
                    Lock1.notify();
                }
            }
        }
    }
}
```

```Java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

class Playground {
    static Lock lock = new ReentrantLock();
    static Condition c1 = lock.newCondition();
    static Condition c2 = lock.newCondition();
    static int cur = 1;
    static int n = 10;

    public static void main(String[ ] args) {
        PrintFirst first = new PrintFirst();
        Thread t1 = new Thread(first);
        PrintSecond second = new PrintSecond();
        Thread t2 = new Thread(second);

        t2.start();
        t1.start();
    }

    static class PrintFirst implements Runnable {
        @Override
        public void run() {
            while(cur <= 10){
                lock.lock();
                while(cur % 2 != 1){
                    try{
                        c1.await();
                    }
                    catch(Exception e){
                        System.out.println("e3");
                    }
                }
                if(cur <= 10) System.out.println(Thread.currentThread().getName() + " : " + cur);
                ++cur;
                c2.signal();
                lock.unlock();
            }
        }
    }

    static class PrintSecond implements Runnable {
        @Override
        public void run() {
            while(cur <= 10){
                lock.lock();
                while(cur % 2 != 0){
                    try{
                        c2.await();
                    }
                    catch(Exception e){
                        System.out.println("e3");
                    }
                }
                if(cur <= 10) System.out.println(Thread.currentThread().getName() + " : " + cur);
                ++cur;
                c1.signal();
                lock.unlock();
            }
        }
    }
}
```



## 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)

```Java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

class Playground {
    static Lock lock = new ReentrantLock();
    static Condition c1 = lock.newCondition();
    static Condition c2 = lock.newCondition();
    static int cur = 1;
    static int n = 30;

    public static void main(String[ ] args) {
        PrintFirst first = new PrintFirst();
        Thread t1 = new Thread(first);
        PrintSecond second = new PrintSecond();
        Thread t2 = new Thread(second);
        PrintThird third = new PrintThird();
        Thread t3 = new Thread(third);

        t2.start();
        t3.start();
        t1.start();
    }

    static class PrintFirst implements Runnable {
        @Override
        public void run() {
            lock.lock();
            while(cur <= 10){
                System.out.println(Thread.currentThread().getName() + " : " + cur);
                ++cur;
            }
            c1.signal();
            lock.unlock();
        }
    }

    static class PrintSecond implements Runnable {
        @Override
        public void run() {
            lock.lock();
            while(cur < 10 || cur > 20){
                try{
                    c1.await();
                }
                catch(Exception e){
                    System.out.println("e2");
                }
            }
            while(cur <= 20){
                System.out.println(Thread.currentThread().getName() + " : " + cur);
                ++cur;
            }
            c2.signal();
            lock.unlock();
        }
    }

    static class PrintThird implements Runnable {
        @Override
        public void run() {
            lock.lock();
            while(cur < 20){
                try{
                    c2.await();
                }
                catch(Exception e){
                    System.out.println("e3");
                }
            }
            while(cur <= 30){
                System.out.println(Thread.currentThread().getName() + " : " + cur);
                ++cur;
            }
            lock.unlock();
        }
    }
}


```
