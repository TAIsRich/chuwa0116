# Chuwa 1.16 HW6
## Explain volatile variables in java? 
- Volatile means that the varialbe changes at runtime and that the compiler should not cache its value for any reason. 
- Volatile means that this variable can be modified by other threads any time, and every time the thread tries to change the variable, it will read or fetch the most recent value of this variable.

## How to create a new thread(Please also consider Thread Pool case)?


## Difference between Runnable and Callable
- The Runnable interface is a functional interface and has a single run() method that doesn't accept any parameters or return any values.
- The Callable interface is a generic interface containing a single call() method that returns a generic value V.

## what is the diff between t.start() and t.run()?
- t.start(): a new thread will be created and the run() method will be executed.
- t.run(): no new thread will be created, run() will be called on the current thread.

## Which way of creating threads is better: Thread class or Runnable interface?
- Runnable interface. It provides more flexibility to the class since Java only allows class to inherit from only one class, but allows class to implement multiple interfaces. It also requires less memory.

## what is the thread status?
- 初始(NEW):新创建了一个线程对象，但还没有调用start()方法。 
- 运行(RUNNABLE):Java线程中将就绪(ready)和运行中(running)两种状态 笼统的称为“运行”。线程对象创建后，其他线程(比如main线程)调用了该对象的 start()方法。该状态的线程位于可运行线程池中，等待被线程调度选中，获取CPU 的使用权，此时处于就绪状态(ready)。就绪状态的线程在获得CPU时间片后变 为运行中状态(running)。
- 阻塞(BLOCKED):表示线程阻塞于锁。 等待(WAITING):进入该状态的线程需要等待其他线程做出一些特定动作(通知 或中断)。 超时等待(TIMED_WAITING):该状态不同于WAITING，它可以在指定的时间后 自行返回。
- 终止(TERMINATED):表示该线程已经执行完毕。

## Difference between wait() and sleep() method
- wait() releases the lock while sleep() does not. wait() is for inter-thread communication but sleep() is for pause during execution.
  
## What is deadlock?
- Mutliple threads are blocked forever. Normally happened when multiple threads having data racing and have to wait for each other.

## how do threads communicate with each other?
- wait(), notify(), notifyAll()

## what is join() method?
- join(): When the join() method is invoked, the current thread stops its execution and the thread goes into the wait state. The current thread remains in the wait state until the thread on which the join() method is invoked has achieved its dead state. If interruption of the thread occurs, then it throws the InterruptedException.
  
## what is yield() method?
- A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority. If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution.

## Explain thread pool
- Java Thread pool represents a group of worker threads that are waiting for the job and reused many times. In the case of a thread pool, a group of fixed-size threads is created. A thread from the thread pool is pulled out and assigned a job by the service provider.
  
## What is Executor Framework in Java, its different types and how to create these executors?
- The Executor Framework contains a bunch of components that are used to efficiently manage multiple threads, such as SingleThreadExecutor,  FixedPoolExecutor, CachedThreadExecutor, and ScheduledExecutor.
- To use them, we can just use new ThreadpoollExecutorName() with different parameters.

## Difference between shutdown() and shutdownNow() methods of executor
- The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

## What is Atomic classes? when do we use it?
- The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable. The method works the same as read and writes on volatile variables.
- We use it for thread safe integer counter, for example.
```
public class AtomicDemo {
    private static AtomicInteger atomicInteger = new AtomicInteger(1);

    public static void main(String[]args){
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.get());
    }
}
```

## What is the cocurrent collections?
- java.util.concurrent package is to enable developers write better concurrent Java applications. This concurrent package includes some additions to the Java Collections Framework. These are called as Java Concurrent Collections.
- For example, ConcurrentHashMap, PriorityBlockingQueue, LinkedBlockingQueue, and ArrayBlockingQueue. These are thread-safe. 
  
## what kind of locks you know?
- ReentrantLock, ReadWriteLock, StampedLock

## What is the difference between class lock and object lock?
- Object-level lock: Every object in java has a unique lock. Whenever we are using a synchronized keyword, then only the lock concept will come into the picture. If a thread wants to execute then synchronized method on the given object.
- Class level lock: Every class in Java has a unique lock which is nothing but a class level lock. If a thread wants to execute a static synchronized method, then the thread requires a class level lock. Once a thread got the class level lock, then it is allowed to execute any static synchronized method of that class.

## What is future and completableFuture?
- Future is used as a reference to the result of an asynchronous computation. It will contain results for operations not finished yet.
-  CompleteFuture class can provide the functionality to chain multiple dependent tasks that run asynchronously, so we can create a chain of tasks where the next task is triggered when the result of the current task is available.

## what is ThreadLocal?
- The ThreadLocal class in Java allows programmers to create variables that are accessible only to the thread that created them. This is useful for creating thread-safe code, as it ensures that each thread has its own copy of a variable and can not interfere with other threads.

## 