#### 1.  Explain volatile variables in java? (we also use it in Singleton)
- all writes and reads will be done to and from the main memory.
#### 2.  how to create a new thread(Please also consider Thread Pool case)?
```java
// 从Thread派生一个自定义类，然后覆写run()方法：
// 执行上述代码，注意到start()方法会在内部自动调用实例的run()方法。
public class Main {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start(); // 启动新线程
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("start new thread!");
    }
}
//方法二：创建Thread实例时，传入一个Runnable实例：
public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start(); // 启动新线程
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start new thread!");
    }
}

//方法三：Callable
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "Start new thread using Callable";
    } }
```
#### 3.  Difference between Runnable and Callable
- runnable has no return;
- callable has return;
- - 并且Callable接口是一个泛型接口，可以返回指定类型的结果
#### 4.  what is the diff between t.start() and t.run()?
- t.start() starts a new thread to excute the task(run())
- t.run() excute the task in the current thread.
#### 5.  Which way of creating threads is better: Thread class or Runnable interface?
- Runnable interface
- As implementing Runnable makes code loosely coupled as the code of thread is different from the class that assign job to the thread. 
- It requires less memory and also allows a class to inherit any other class.
#### 6.  what is the thread status?
- New：新创建的线程，尚未执行；
- Runnable：运行中的线程，正在执行run()方法的Java代码；
- Blocked：运行中的线程，因为某些操作被阻塞而挂起；
- Waiting：运行中的线程，因为某些操作在等待中；
- Timed Waiting：运行中的线程，因为执行sleep()方法正在计时等待；
- Terminated：线程已终止，因为run()方法执行完毕。
#### 7. difference between wait() and sleep() method
- wait() releases the lock while sleep() doesn't release any lock while waiting.
#### 8.  What is deadlock?
- A deadlock is a situation in which two computer programs sharing the same resource are effectively preventing each other from accessing the resource, resulting in both programs ceasing to function.
#### ！9.  how do threads communicate with each other?
Inter-thread Communication
#### 10. what is join() method?
- Thread class that permits one thread to wait until the other thread to finish its execution
#### ！ 11. what is yield() method
- The yield() method is used in Java to hint the task scheduler to move the currently executing task to the Ready state and move another task or thread to the running state.
#### 12. Explain thread pool
- thread pool is a software design pattern for achieving concurrency of execution in a computer program.
-  Using threads can simplify the logic of the application and also take advantage of multiple processors, but creating too many threads can cause overall application performance problems due to contention for resources
- A thread pool manages a set of anonymous threads that perform work on request. The threads do not terminate right away. When one of the threads completes a task, the thread becomes idle, ready to be dispatched to another task. The overhead of creating and destroying threads is limited to creating and destroying just the number of active worker threads in the pool. The application can have more tasks than there are worker threads, and this is usually the case. Processor utilization and throughput are improved by reducing contention for resources. The submitted tasks are processed in order, usually faster than could be done by creating a thread per task.
#### 13. What is Executor Framework in Java, its different types and how to create these executors?
- is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads
- FixedThreadPool：线程数固定的线程池；
- CachedThreadPool：线程数根据任务动态调整的线程池；
- SingleThreadExecutor：仅单线程执行的线程池。
#### 14. Difference between shutdown() and shutdownNow() methods of executor
- shutdown(): will allow previously submitted tasks to execute before terminating
- shutdownNow(): prevents waiting tasks from starting and attempts to stop currently executing tasks.
#### ! 15. What is Atomic classes? when do we use it?
- The atomic classes provide a lock-free and thread-safe environment or programming on a single variable.
  atomic包提高原子更新基本类型的工具类，主要有这些： 
  - AtomicBoolean：以原子更新的方式更新boolean；
  - AtomicInteger：以原子更新的方式更新Integer;
  - AtomicLong：以原子更新的方式更新Long；
- 这几个类的用法基本一致，这里以AtomicInteger为例总结常用的方法
  * addAndGet(int delta) ：以原子方式将输入的数值与实例中原本的值相加，并返回最后的结果；
  * incrementAndGet() ：以原子的方式将实例中的原值进行加1操作，并返回最终相加后的结果；
  * getAndSet(int newValue)：将实例中的值更新为新值，并返回旧值；
  * getAndIncrement()：以原子的方式将实例中的原值加1，返回的是自增前的旧值；
#### 16. What is the concurrent collections?
- 使用java.util.concurrent包提供的线程安全的并发集合可以大大简化多线程编程
- 尽量使用Java标准库提供的并发集合，避免自己编写同步代码。
#### 17.  what kind of locks you know?
- ReentrantLock
- ReadWriteLock
- StampedLock
#### 18. What is the difference between class lock and object lock?
- Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread. 
- Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.
#### 19. What is future and completableFuture?
- CompletableFuture，它针对Future做了改进，可以传入回调对象，当异步任务完成或者发生异常时，自动调用回调对象的回调方法。
- CompletableFuture可以指定异步处理流程：
  * thenAccept()处理正常结果；
  * exceptional()处理异常结果；
  * thenApplyAsync()用于串行化另一个CompletableFuture；
  * anyOf()和allOf()用于并行化多个CompletableFuture
#### ！20. what is ThreadLocal?
- ThreadLocal provides an easy-to-use API to confine some values to each thread.
