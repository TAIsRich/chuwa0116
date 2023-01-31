# HW6

### 1 Explain volatile variables in java? (we also use it in Singleton)

`volatile` tells the compiler that the value of a variable must never be cached as its value may change outside of the scope of the program itself. Using `volatile` is yet another way (like synchronized, atomic wrapper) of making class thread-safe.

### 2 How to create a new thread(Please also consider Thread Pool case)?

+ Extends Thread Class
+ Implements Runnable
+ Implements Callable

### 3 Difference between Runnable and Callable

+ `Runnable` has no return; `Callable` has return.
+ `Runnable` does not have the `throws` clause specified, we don't have a way to propagate further checked exceptions; `Callable`‘s `call()` method contains the `throws Exception` clause, so we can easily propagate checked exceptions further:

### 4 What is the diff between t.start() and t.run()?

Main difference is that when program calls `start()` method a new Thread is created and code inside `run()` method is executed in new Thread while if you call `run()` method directly no new Thread is created and code inside `run()` will execute on current Thread.

### 5 Which way of creating threads is better: Thread class or Runnable interface?

Implementing `Runnable` is always the preferred choice, see the reasons below:

- As you know, Java does not allow multiple inheritance through classes, so if you are creating threads by extending `Thread` class then you will not be able to extend any other class.

- When we are working with multithreading, we are not looking to overwrite any existing functionality of `Thread` class, we just want to execute the code with multiple threads, so in that way also, `Runnable` is a good choice.

- One more reason to choose `Runnable` is that, most people don’t work with just Raw Threads, they use the `Executor` framework that is provided from Java 5, that separates the task from its execution and we can execute `Runnables` using `execute(Runnable Task)` method of `Executor` interface .

### 6 What is the thread status?

+ New
+ Runnable
+ Blocked
+ Waiting
+ Timed_waiting
+ Terminated

### 7 difference between wait() and sleep() method

- The fundamental difference is that `wait()` is non static method of `Object` and `sleep()` is a static method of `Thread`.
- The major difference is that `wait()` releases the lock while `sleep()` doesn’t release any lock while waiting.
- `wait()` is used for inter-thread communication while `sleep()` is used to introduce a pause on execution, generally.
- `wait()` should be called from inside synchronise or else we get an `IllegalMonitorStateException`, while `sleep()` can be called anywhere.
- To start a thread again from `wait()`, you have to call `notify()` or `notifyAll()` indefinitely. As for `sleep(),` the thread gets started definitely after a specified time interval.

### 8 What is deadlock?

Deadlock is a situation where a set of processes are blocked because each process is holding a resource and waiting for another resource acquired by some other process. 

### 9  How do threads communicate with each other?

Inter-thread communication involves the communication of threads with each other. The three methods that are used to implement inter-thread communication in Java.

+ `wait()`: This method causes the current thread to release the lock. This is done until a specific amount of time has passed or another thread calls the `notify()` or `notifyAll()` method for this object.
+ `notify()`: This method wakes a single thread out of multiple threads on the current object’s monitor. The choice of thread is arbitrary.
+ `notifyAll()`: This method wakes up all the threads that are on the current object’s monitor.

### 10 What is join() method?

When the `join()` method is invoked, the current thread stops its execution and the thread goes into the wait state. The current thread remains in the wait state until the thread on which the `join()` method is invoked has achieved its dead state. If interruption of the thread occurs, then it throws the InterruptedException.

### 11 What is yield() method

A `yield()` method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority. If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution.

### 12 Explain thread pool

A thread pool reuses previously created threads to execute current tasks and offers a solution to the problem of thread cycle overhead and resource thrashing. Since the thread is already existing when the request arrives, the delay introduced by thread creation is eliminated, making the application more responsive.

### 13 What is Executor Framework in Java, its different types and how to create these executors?

Java executor framework released with the JDK 5 is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads.

Some types of Java Executors are listed below:

+ SingleThreadExecutor: `ExecutorService executor = Executors.newSingleThreadExecutor();`
+ FixedThreadPool(n): `ExecutorService fixedPool = Executors.newFixedThreadPool(2);`
+ CachedThreadPool: `ExecutorService executorService = Executors.newCachedThreadPool();`
+ ScheduledExecutor: `ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);`

### 14 Difference between shutdown() and shutdownNow() methods of executor

- `shutdown()` will just tell the executor service that it can't accept new tasks, but the already submitted tasks continue to run
- `shutdownNow()` will do the same AND will try to cancel the already submitted tasks by interrupting the relevant threads. Note that if your tasks ignore the interruption, `shutdownNow` will behave exactly the same way as `shutdown`.

### 15 What is Atomic classes? when do we use it?

The most commonly used atomic variable classes in Java are AtomicInteger, AtomicLong, AtomicBoolean and AtomicReference]. These classes represent an *int*, *long*, *boolean,* and object reference respectively which can be atomically updated.

### 16 What is the cocurrent collections?

Concurrent collections in java are designed and optimized specifically for synchronized multithreaded access. These are the thread safe collections, and these are existing in java.util.concurrent package.

| INTERFACE | NON-THREAD-SAFE         | THREAD-SAFE                              |
| --------- | ----------------------- | ---------------------------------------- |
| Lits      | ArrayList               | CopyOnWriteArrayList                     |
| Map       | HashMap                 | ConcurrentHashMap                        |
| Set       | HashSet / TreeSet       | CopyOnWriteArraySet                      |
| Queue     | ArrayDeque / LinkedList | ArrayBlockingQueue / LinkedBlockingQueue |
| Duque     | ArrayDeque / LinkedList | LinkedBlockingDeque                      |

### 17 What kind of locks you know?

`ReentrantLock`, `ReentrantReadWriteLock`, `StampedLock`

### 18 What is the difference between class lock and object lock?

+ Object-level lock: Every object in java has a unique lock. Whenever we are using a synchronized keyword, then only the lock concept will come into the picture. If a thread wants to execute then synchronized method on the given object. First, it has to get a lock-in that object. Once the thread got the lock then it is allowed to execute any synchronized method on that object. Once method execution completes automatically thread releases the lock. Acquiring and release lock internally is taken care of by JVM and the programmer is not responsible for these activities. 
+ Class level lock: Every class in Java has a unique lock which is nothing but a class level lock. If a thread wants to execute a static synchronized method, then the thread requires a class level lock. Once a thread got the class level lock, then it is allowed to execute any static synchronized method of that class. Once method execution completes automatically thread releases the lock. 

### 19 What is future and completableFuture?

+ Manual Completion

  Talking about manual completition , `Future` provides an `isDone(`) method to check whether the computation is done or not, and a `get()` method to retrieve the result of the computation when it is done. But if there comes a scenario where you need to complete it manually, `Future` does not provide any means to do so.

  But in Java 8’s `CompletableFuture`, `CompletableFuture.complete(`) method helps us to manually complete a Future.

+ Attaching a callable method

  While using `Future`, we do not get notified when it is complete neither does it provides us a callable method which will automatically be called when the result is available but `CompletableFuture` provides us with a lot of callable methods which can be used as per our use case. 

### 20 What is ThreadLocal?

The `TheadLocal` construct allows us to store data that will be accessible only by a specific thread.

### 21 Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)

Shown in Coding/coding4.

### 22 Read those interview questions and pick some important questions to this homework.

> Question 75: Once a thread has been started can it be started again 
>
> Answer: No. A thread can be started only once in its lifetime. If you try to start a thread which has already been started, an IllegalThreadStateException is thrown, which is a runtime exception. A thread in runnable state or a dead thread cannot be restarted.
>
> 

### 23 write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. 
+ One solution use synchronized and wait notify 
+ One solution use ReentrantLock and await, signal

### 24 create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random
Shown in Coding/coding4.