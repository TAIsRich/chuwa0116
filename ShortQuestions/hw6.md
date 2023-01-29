## Explain volatile variables in java? (we also use it in Singleton)

A volatile keyword is used to modify the value of a variable by different threads. 
It is also used to make classes thread-safe. 
Marking a variable as volatile basically tells all threads to do read and write operations on main memory only.

## how to create a new thread(Please also consider Thread Pool case)?
`Extends Thread Class`
```java
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("start new thread using extends thread");
    }
}

Thread t = new MyThread(); // JVM没有创建thread 9 
t.start(); // 此时JVM才创建新的thread
```

`Implements Runnale`
```java
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Start new thread using Runnable");
    }
}

Thread t2 = new Thread(new MyRunnable());
```

`Implements Callable`
```java
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "Start new thread using Callable";
    }
}
```

`Thread Pool`
```java
// 创建固定大小的线程池:
ExecutorService executor = Executors.newFixedThreadPool(4); 
// 提交任务:
executor.submit(task1);
executor.submit(task2);
executor.submit(task3);
executor.submit(task4);
executor.submit(task5);
```

```java
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main() {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++){
            es.submit(new Task("" + i));
            // 不用thread pool的话，怎么创建和执行一个thread. 
            // Thread t0 = new Thread(new Task(" " + i)); 
            // t.start();
        }
        es.shutdown();
    }
}

class Task implements Runnable{
    private final String name;
    public Task(String name){
        this.name = name;
    }
    
    @Override
    public void run(){
        System.out.println("start tasks " + name);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
    }
        System.out.println("end task" + name);
    }
}
```

## Difference between Runnable and Callable

- Runnable has no return
- Callable has return

## what is the diff between t.start() and t.run()?

- t.start() starts a new thread to execute the task
- t.run() execute the task in the current thread

## Which way of creating threads is better: Thread class or Runnable interface?
Runnable interface.

We can use new Thread(lambda), since in Runnable, only have one interface run()

## what is the thread status?

- 初始(NEW):新创建了一个线程对象，但还没有调用start()方法。 
- 运行(RUNNABLE):Java线程中将就绪(ready)和运行中(running)两种状态 笼统的称为“运行”。线程对象创建后，其他线程(比如main线程)调用了该对象的 start()方法。该状态的线程位于可运行线程池中，等待被线程调度选中，获取CPU 的使用权，此时处于就绪状态(ready)。就绪状态的线程在获得CPU时间片后变 为运行中状态(running)。
- 阻塞(BLOCKED):表示线程阻塞于锁。 
- 等待(WAITING):进入该状态的线程需要等待其他线程做出一些特定动作(通知 或中断)。 
- 超时等待(TIMED_WAITING):该状态不同于WAITING，它可以在指定的时间后 自行返回。
- 终止(TERMINATED):表示该线程已经执行完毕.

![](https://segmentfault.com/img/remote/1460000023194699)

## difference between wait() and sleep() method

A `wait` can be "woken up" by another thread calling `notify` on the monitor which is being waited on whereas a `sleep` cannot. 
Also, a `wait` (and `notify`) must happen in a block `synchronized` on the monitor object whereas `sleep` does not:

## What is deadlock?

Interviewer: what is deadlock?

Me: I'll tell you if you give offer.

## how do threads communicate with each other?

`wait()`
This method causes the current thread to release the lock. This is done until a specific amount of time has passed or another thread calls the notify() or notifyAll() method for this object.

`notify()`
This method wakes a single thread out of multiple threads on the current object’s monitor. The choice of thread is arbitrary.

`notifyAll()`
This method wakes up all the threads that are on the current object’s monitor.

## what is join() method?

Join method in Java allows one thread to wait until another thread completes its execution. 
In simpler words, it means it waits for the other thread to die. 
It has a void type and throws InterruptedException.

## what is yield() method

The yield() method is used in Java to hint the task scheduler to move the currently executing task to the Ready state and move another task or thread to the running state.

## Explain thread pool

Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.

In the case of a thread pool, a group of fixed-size threads is created. 
A thread from the thread pool is pulled out and assigned a job by the service provider. 
After completion of the job, the thread is contained in the thread pool again.

## What is Executor Framework in Java, its different types and how to create these executors?

Java executor framework (java. util. concurrent. Executor), released with the JDK 5 is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads.

- FixedThreadPool
- CachedThreadPool
- SingleThreadExecutor

```java
ExecutorService esFixed = Executors.newFixedThreadPool(4);
ExecutorService esCached = Executors.CachedThreadPool();
ExecutorService esSingle = Executors.SingleThreadPool();
```

## Difference between shutdown() and shutdownNow() methods of executor

Two different methods are provided for shutting down an ExecutorService. 
The shutdown() method will allow previously submitted tasks to execute before terminating, 
while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

## What is Atomic classes? when do we use it?

The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. 
It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable. 
The method works the same as read and writes on volatile variables.

## What is the concurrent collections?

Tread-safe version collections

| Interface | Non-Thread-Safe       | Thread-Safe                            |
|-----------|-----------------------|----------------------------------------|
| List      | ArrayList             | CopyOnWriteArrayList                   |
| Map       | HashMap               | ConcurrentHashMap                      |
| Set       | HashSet/TreeSet       | CopyOnWriteArraySet                    |
| Queue     | ArrayDeque/LinkedList | ArrayBlockingQueue/LinkedBlockingQueue |
| Deque     | ArrayDeque/LinkedList | LinkedBlockingDeque                    |

## what kind of locks you know?

- ReentrantLock
- ReadWriteLock
- StampedLock

## [What is the difference between class lock and object lock?](https://www.geeksforgeeks.org/object-level-class-level-lock-java/)

- **Object-level lock:** Every object in java has a unique lock. Whenever we are using a synchronized keyword, 
then only the lock concept will come into the picture. 
If a thread wants to execute then synchronized method on the given object. 
First, it has to get a lock-in that object. Once the thread got the lock then it is allowed to execute any synchronized method on that object. 
Once method execution completes automatically thread releases the lock. 
Acquiring and release lock internally is taken care of by JVM and the programmer is not responsible for these activities. 
Let’s have a look at the below program to understand the object level lock:

```java
class Geek implements Runnable {
    public void run() { Lock(); }
    public void Lock()
    {
        System.out.println(
            Thread.currentThread().getName());
        synchronized (this)
        {
            System.out.println(
                "in block "
                + Thread.currentThread().getName());
            System.out.println(
                "in block "
                + Thread.currentThread().getName()
                + " end");
        }
    }
 
    public static void main(String[] args)
    {
        Geek g = new Geek();
        Thread t1 = new Thread(g);
        Thread t2 = new Thread(g);
        Geek g1 = new Geek();
        Thread t3 = new Thread(g1);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
```
**Output**
```
t1
t3
t2
in block t3
in block t1
in block t3 end
in block t1 end
in block t2
in block t2 end
```

- Class level lock: Every class in Java has a unique lock which is nothing but a class level lock. 
If a thread wants to execute a static synchronized method, 
then the thread requires a class level lock. Once a thread got the class level lock, 
then it is allowed to execute any static synchronized method of that class. 
Once method execution completes automatically thread releases the lock. 
Let’s look at the below program for better understanding:

```java
class Geek implements Runnable {
    public void run() { Lock(); }
 
    public void Lock()
    {
        System.out.println(
            Thread.currentThread().getName());
        synchronized (Geek.class)
        {
            System.out.println(
                "in block "
                + Thread.currentThread().getName());
            System.out.println(
                "in block "
                + Thread.currentThread().getName()
                + " end");
        }
    }
 
    public static void main(String[] args)
    {
        Geek g1 = new Geek();
        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(g1);
        Geek g2 = new Geek();
        Thread t3 = new Thread(g2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
```

``` 
t1
t2
t3
in block t1
in block t1 end
in block t3
in block t3 end
in block t2
in block t2 end
```

## What is future and completableFuture?

A Future is used as a reference to the result of an asynchronous computation. 
It provides an `isDone()` method to check whether the computation is done or not, and a `get()` method to retrieve the result of the computation when it is done.

Limitation of future:

1. It cannot be manually completed
2. You cannot perform further action on a Future’s result without blocking
3. Multiple Futures cannot be chained together
4. You can not combine multiple Futures together
5. No Exception Handling

An enhanced version of future, which provides method to overcome future's limitations.

## what is ThreadLocal?

The TheadLocal construct allows us to store data that will be accessible only by a specific thread.

## Read those interview questions and pick some important questions to this homework.

## write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
1. One solution use synchronized and wait notify
2. One solution use ReentrantLock and await, signal

```java
public class OddEvenPrinter{
    private static final Object monitor = new Object();
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
    
    static class PrintRunnable implements Runnable{
        @Override
        private void run(){
            synchronized (monitor){
                while (value <= 10){
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    monitor.notify();
                    try{
                        if (value < 11){
                            monitor.wait();
                        }
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
```

```java
public class OddEventPrinterReentrantLock {
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable1 runnable = new PrintRunnable1();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable1 implements Runnable{
        private final ReentrantLock lock = new ReentrantLock();
        private final Condition condition = lock.newCondition();

        @Override
        public void run() {
            lock.lock();
            try{
                while (value <= 10){
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    condition.signal();
                    try{
                        condition.await();
                    } catch (InterruptedException e){
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

## create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)

```java
public class OddEventPrinterReentrantLock {
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable2 runnable = new PrintRunnable2();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable2 implements Runnable{
        private final ReentrantLock lock = new ReentrantLock();
        private final Condition condition = lock.newCondition();

        @Override
        public void run() {
            lock.lock();
            try{
                while (value <= 30){
                    for (int i = 0; i < 10; i++){
                        System.out.println(Thread.currentThread().getName() + ": " + value++);
                    }
                    condition.signal();
                    try{
                        if (value < 31) condition.await();
                    } catch (InterruptedException e){
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

```
Thread-1: 1
Thread-1: 2
Thread-1: 3
Thread-1: 4
Thread-1: 5
Thread-1: 6
Thread-1: 7
Thread-1: 8
Thread-1: 9
Thread-1: 10
Thread-0: 11
Thread-0: 12
Thread-0: 13
Thread-0: 14
Thread-0: 15
Thread-0: 16
Thread-0: 17
Thread-0: 18
Thread-0: 19
Thread-0: 20
Thread-2: 21
Thread-2: 22
Thread-2: 23
Thread-2: 24
Thread-2: 25
Thread-2: 26
Thread-2: 27
Thread-2: 28
Thread-2: 29
Thread-2: 30

Process finished with exit code 0
```