### Explain volatile variables in java?

In Java, a volatile variable is a type of variable that is used to indicate that its value may be concurrently modified by multiple threads. When a thread reads a volatile variable, it always reads the current value from main memory, rather than from a local cache. This ensures that all threads see the same value for the variable, even if one thread has written to it recently. Volatile variables are typically used for variables that are shared between threads, such as flags or counters, to prevent unexpected behavior caused by caching.

### How to create a new thread?

There are two main ways to create a new thread in Java:

Extending the `Thread` class: You can create a new thread by creating a new class that extends the `Thread` class, and then override the `run()` method to define the code that should be executed in the new thread. To start the new thread, you can create an instance of the class and call its `start()` method.

```java
class MyThread extends Thread {
    public void run() {
        // code to be executed in the new thread
    }
}

MyThread myThread = new MyThread();
myThread.start();
```



Implementing the `Runnable` interface: You can also create a new thread by creating a class that implements the `Runnable` interface and defines a `run()` method. To start the new thread, you can create an instance of the class and pass it to the constructor of the `Thread` class, then call the `start()` method.

```java
class MyRunnable implements Runnable {
    public void run() {
        // code to be executed in the new thread
    }
}

MyRunnable myRunnable = new MyRunnable();
Thread thread = new Thread(myRunnable);
thread.start();
```

Note that the second way is more useful when you want to extend some other class other than Thread.

### How to create a new thread using Thread Pool?

A thread pool is a group of pre-initialized, idle threads that can be used to execute tasks. In Java, you can use the `Executor` framework to create and manage a thread pool.

To create a thread pool using the `Executor` framework, you can use the `Executors` class to create an `Executor` object. The `Executors` class provides several methods for creating different types of thread pools, such as `newFixedThreadPool(int nThreads)`, which creates a thread pool with a fixed number of threads, or `newCachedThreadPool()`, which creates a thread pool that can dynamically adjust the number of threads based on the number of tasks.

Here is an example of how to create a thread pool with a fixed number of threads and submit a task to it:

```java
Executor executor = Executors.newFixedThreadPool(5);
executor.execute(new Runnable() {
    public void run() {
        // code to be executed in the new thread
    }
});
```

You can also use the `submit()` method to submit a task and get the Future object, which can be used to check the status of the task, wait for its completion or cancel it.

```java
Executor executor = Executors.newFixedThreadPool(5);
Future future = executor.submit(new Runnable() {
    public void run() {
        // code to be executed in the new thread
    }
});
```

It's important to note that once you are done using the thread pool, you should shut it down by calling the `shutdown()` method, otherwise it will keep running indefinitely. Also, you can call `shutdownNow()` method to stop all running and non-running tasks abruptly.

### What's the difference between Runnable and Callable?

In Java, `Runnable` is an interface with a single method `void run()`, which is meant to contain the code that will be executed by a `Thread`. `Callable` is also an interface with a single method `V call() throws Exception`, which is similar to `run()` but also allows a value to be returned and can throw a checked exception.

The main difference between `Runnable` and `Callable` is that a `Runnable` does not return a value and cannot throw a checked exception, while `Callable` can return a value and can throw checked exceptions.

Another difference is that `Runnable` objects can be executed by passing them to the `Thread` constructor or by using the `Thread.run()` method while `Callable` objects are typically executed using `ExecutorService.submit()` or `CompletionService.submit()` which returns a `Future` object and can be used to check the status of the task or retrieve the result of the task when it completes.

### What are differences between start() and run()?

The main difference between these two methods is that `start()` creates a new thread and causes the Java Virtual Machine (JVM) to start executing the thread, while `run()` simply causes the current thread to start executing the code in the `run()` method.

Here are some other key differences between these two methods:

- `start()` is used to start a new thread, while `run()` is used to run the code in the current thread.
- `start()` will create a new thread and execute the `run()` method in that thread, while `run()` will simply execute the code in the current thread.
- `start()` is a non-blocking method, which means that it returns immediately after the new thread has been started, while `run()` is a blocking method, which means that it does not return until the code in the `run()` method has finished executing.

Overall, the `start()` method is the preferred way to create and start a new thread, while the `run()` method is used to specify the code that should be executed in the thread.

### Which way of creating threads is better: Thread class or Runnable interface?

Generally, implementing the Runnable interface is recommended. There are several reasons:

- After extending the Thread class, we can't extend any other class.
- When extending the Thread class, we're not overriding any of its methods. Instead, we are overriding the run() method of Runnable (which the Thread class implements). This is a clear violation of IS-A Thread principle.
- Creating an implementation of Runnable and passing it to the Thread class utilizes aggregation/composition and not inheritance – which is more flexible.
- Since Java 8, Runnables can be represented as lambda expressions.

### What is the thread status?

The thread life cycle in Java refers to the different states that a thread can be in during its execution. In Java, a thread can be in one of the following five states:

1. **New**: This is the initial state of a thread, where the thread has been created but has not yet started.
2. **Runnable**: This is the state of a thread that is ready to run, but may be waiting for its turn to be executed by the Java Virtual Machine (JVM).
3. **Running**: This is the state of a thread that is currently being executed by the JVM.
4. **Blocked**: This is the state of a thread that is waiting for a certain condition to be met, such as acquiring a lock or waiting for input from another thread.
5. **Terminated**: This is the final state of a thread, where the thread has completed its execution or been terminated by the JVM.

### What are the differences between sleep() and wait()?

In Java, the `sleep()` method is a static method of the `Thread` class that causes the currently executing thread to sleep (temporarily cease execution) for a specified period of time. The `wait()` method, on the other hand, is an instance method of the `Object` class and is used to cause the current thread to wait until it is notified or interrupted, either by another thread or by an external event.

One key difference between the two methods is that calling `sleep()` does not release the lock on the object that the current thread holds, whereas calling `wait()` does release the lock. This means that when a thread calls `sleep()`, it continues to hold the lock and no other thread can access the object, but when a thread calls `wait()`, it releases the lock and other threads can access the object.

Another difference between the two methods is that `sleep()` is a static method, while `wait()` is an instance method. This means that to use the `sleep()` method, you can call it directly on the `Thread` class, whereas to use the `wait()` method, you need to call it on an instance of the `Object` class.

In summary, the `sleep()` method is used to cause the current thread to sleep for a specified period of time, while the `wait()` method is used to cause the current thread to wait until it is notified or interrupted. The main differences between the two methods are that `sleep()` does not release the lock on the object that the current thread holds, while `wait()` does release the lock; and that `sleep()` is a static method, while `wait()` is an instance method.

### What is Deadlock?

A deadlock is a situation where two or more threads are blocked (stopped from executing) because each thread is waiting for the other to release a resource that it needs. In this situation, the threads are unable to make any further progress and will remain blocked indefinitely.

### How do threads communicate with each other?

Threads can communicate with each other in several ways in Java, some of the most common methods include:

1. Shared Variables: Threads can share variables, such as a global variable or an object's field. They can read and write to the same variables, but it is important to use synchronization to ensure that the variables are accessed in a thread-safe manner.
2. Wait and Notify: Threads can use the `wait()` and `notify()` methods of the `Object` class to coordinate their activities. The thread that is waiting will be blocked until another thread calls `notify()` or `notifyAll()` on the same object.
3. BlockingQueue: Threads can use a `BlockingQueue` to communicate. This is a thread-safe queue that blocks when a thread tries to dequeue from an empty queue or enqueue to a full queue.
4. Interrupt: Threads can use the `interrupt()` method to interrupt another thread. A thread that is interrupted will throw an `InterruptedException` when it is blocked in certain methods such as `sleep()` or `wait()`.
5. Executor Framework: Threads can also communicate through the Executor Framework which provides a higher-level abstraction over thread management and coordination. The framework provides classes like `Executor`, `ExecutorService`, `CompletionService`, `Future` and `Callable` that allows you to start, stop and manage threads, and also provides a way to return the result of the execution of a thread and also to cancel a running thread.

All of these methods have their own advantages and disadvantages, and the right method to use depends on the specific requirements of the application.

### What is join() method?

In Java, the `join()` method is used to wait for a thread to complete its execution. This means that if you call the `join()` method on a thread, the current thread will block and wait for the thread on which `join()` was called to finish executing before continuing.

The `join()` method can be useful in situations where you need to ensure that a certain thread has completed its execution before continuing with the rest of your code. For example, you might use `join()` to wait for a thread that performs a long-running or critical task to complete before continuing with the rest of your program.

Additionally, the `join()` method has two variations: `join(long millis)` and `join(long millis, int nanos)`, which allow you to specify a maximum amount of time to wait for the thread to complete its execution. If the thread does not complete within the specified time, the `join()` method will return and the current thread will continue executing.

### What is yield() method?

The `yield()` method is a static method in the `Thread` class that causes the currently executing thread to temporarily pause execution and allow other threads with the same or higher priority to execute. It does not guarantee that other threads will start executing, it is simply a hint to the scheduler that the current thread is willing to yield its current time slice.

The `yield()` method can be useful when there are multiple threads of the same or similar priority that are competing for the same resources. By calling `yield()`, a thread can temporarily give up its time slice to allow other threads to execute, which can lead to more fair scheduling and better performance.

However, it's important to note that the `yield()` method is not a synchronization mechanism, it does not guarantee that other threads will start executing, it is merely a suggestion to the scheduler. Also, the `yield()` method does not change the thread's priority or interrupt status.

### Explain thread pool.

In Java, a thread pool is a collection of pre-initialized threads that are ready to perform tasks. These threads are managed by a ThreadPoolExecutor, which can be used to execute submitted tasks. The advantage of using a thread pool is that it can help reduce the overhead of creating and destroying threads, as well as provide better control over the number of concurrent threads in a system. Thread pools can also make it easier to manage and reuse threads, and can help prevent issues such as thread starvation.

### What is Executor Framework in Java? What are the different types and how to create these executors?

The Executor Framework in Java is a framework for standardizing invocation, scheduling, and execution of asynchronous tasks in Java. It was added in Java 5 as part of the java.util.concurrent package. The Executor framework provides a way to decouple task submission from the mechanics of how each task will be run, including details of thread use, scheduling, etc.

There are several types of executors provided in the framework:

- ThreadPoolExecutor: A thread pool that can schedule commands to run after a given delay, or to execute periodically.
- ScheduledThreadPoolExecutor: An extension of ThreadPoolExecutor that can schedule commands to run after a given delay, or to execute periodically.
- SingleThreadExecutor: An Executor that uses a single worker thread operating off an unbounded queue, replacing the normally privileged Thread.

To create an executor, you can use the Executors factory class, which provides several methods for creating different types of executors:

- Executors.newCachedThreadPool(): Creates a thread pool that can dynamically reuse threads
- Executors.newFixedThreadPool(int nThreads): Creates a thread pool with a fixed number of threads.
- Executors.newSingleThreadExecutor(): Creates an executor that uses a single worker thread.
- Executors.newScheduledThreadPool(int corePoolSize): Creates a scheduled thread pool with a fixed number of threads.

Alternatively, you can create an executor directly by instantiating one of the executor classes (ThreadPoolExecutor, ScheduledThreadPoolExecutor, or SingleThreadExecutor) and providing it with the necessary configuration.

### What's the difference between shutdown() and shutdownNow() methods of executor in Java?

The `shutdown()` method initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted. The `shutdownNow()` method attempts to stop all actively executing tasks and skips any waiting tasks. It returns a list of tasks that were awaiting execution.

### What is Atomic classes? When do we use it?

Atomic classes in Java are a set of classes in the java.util.concurrent.atomic package that provide atomic operations. They are used to perform operations on a single variable in a thread-safe manner, without the need for explicit synchronization. These classes are typically used in multi-threaded environments to ensure that operations on shared variables are atomic, which means that they are executed in their entirety without interruption from other threads. Examples of atomic classes include AtomicInteger, AtomicLong, and AtomicReference.

### What are the cocurrent collections?

In Java, the concurrent collections are a set of collections that are designed to be used in multi-threaded environments. These collections provide thread-safe alternatives to their non-concurrent counterparts. Some examples of concurrent collections in Java include:

- ConcurrentHashMap: A hash table supporting full concurrency of retrievals and high expected concurrency for updates.
- CopyOnWriteArrayList: A thread-safe variant of ArrayList in which all mutative operations (add, set, and so on) are implemented by making a fresh copy of the underlying array.
- ConcurrentLinkedQueue: An unbounded thread-safe queue based on linked nodes.
- ConcurrentSkipListMap: A scalable concurrent NavigableMap implementation.
- ConcurrentSkipListSet: A scalable concurrent NavigableSet implementation.

### What kind of locks do you know?

In Java, there are several types of locks that can be used for synchronization and thread safety:

- `java.util.concurrent.locks.Lock`: This is a general-purpose lock interface that can be used for exclusive or shared access to a resource. It provides a more flexible and powerful alternative to the built-in synchronization in Java.
- `java.util.concurrent.locks.ReentrantLock`: This is a specific implementation of the Lock interface that supports reentrant (nested) locking. This means that a thread can acquire the same lock multiple times, and it will only be unlocked when the same thread releases it the same number of times.
- `java.util.concurrent.Semaphore`: This class is used to control access to a shared resource by multiple threads. It is similar to a lock, but it allows for more than one thread to acquire the resource at the same time.
- `java.util.concurrent.ReadWriteLock`: This is a type of lock that allows multiple threads to read a resource simultaneously, but only one thread to write to it at a time.
- `java.util.concurrent.StampedLock`: This is a more advanced version of the read-write lock, which offers more fine-grained control over reading and writing operations and also provides some additional features like optimistic locking.

### What is the difference between class lock and object lock?

- Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread.
- Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime. It should always be used to make static data thread safe. 

### What is Future and CompletableFuture?

`Future` and `CompletableFuture` are classes in the Java concurrency package that allow you to perform tasks asynchronously and retrieve the results at a later time.

A `Future` represents the result of an asynchronous computation. It provides methods to check if the computation is complete, wait for its completion, and retrieve the result of the computation. The computation can be a time-consuming task such as I/O operation or a long-running computation.

`CompletableFuture` is an implementation of `Future` that provides additional functionality for handling the results of asynchronous computations. It allows you to attach callbacks to be executed when the computation is complete, combine multiple asynchronous computations, and handle errors and exceptions.

A `CompletableFuture` can be thought of as a promise that a value will be available at some point in the future. Once the underlying computation completes, the `CompletableFuture` object is completed with a value, which can be retrieved using the `get()` method.

`CompletableFuture` also has several methods to handle the result asynchronously, like `thenApply`, `thenAccept`, `thenRun`, `handle`, `whenComplete`, `exceptionally`, etc. It also provides static methods like `supplyAsync`, `runAsync`, `allOf`, `anyOf` to create and combine async tasks.

Both `Future` and `CompletableFuture` can be used to write concurrent and asynchronous code in a more readable and manageable way.

### What is ThreadLocal?

In Java, `ThreadLocal` is a class that is used to store values that are specific to a single thread. It allows you to create variables that can only be accessed by the thread that created them, and not by any other thread. This can be useful for situations where you want to maintain thread-specific state, such as a user's session information in a web application.

### OddEventPrinter

```java
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
                    System.out.println(Thread.currentThread().getName()
                    + ": " + value);
                    value += 1;
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

### PrintNumber

```java
public class PrintNumber {

    private static final AtomicInteger val = new AtomicInteger(1);
    private static final Semaphore semaphore = new Semaphore(1);

    private static void printNumber() {
        try {
            semaphore.acquire(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i += 1) {
            System.out.println(Thread.currentThread().getName()
            + ": " + val.getAndIncrement());
        }
        semaphore.release(1);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(PrintNumber::printNumber);
        Thread t2 = new Thread(PrintNumber::printNumber);
        Thread t3 = new Thread(PrintNumber::printNumber);

        t2.start();
        t1.start();
        t3.start();
    }
}

```

