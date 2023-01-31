# HW6 - Hao Jia

### 1. Explain volatile variables in java? (we also use it in Singleton)
In Java, a volatile variable is a type of variable that is accessed by multiple threads and can be modified by any of them. When a thread reads a volatile variable, it gets the most recent value written by any other thread, rather than a cached value that may be out of date. This ensures that all threads see a consistent view of the variable's value.

Volatile variables are often used in situations where multiple threads need to read and write a shared variable, and it is important to ensure that all threads see the most recent value. For example, in a Singleton pattern, a volatile variable can be used to ensure that only one instance of the Singleton is created, even in a multithreaded environment.

It is important to note that volatile variables do not provide any synchronization mechanisms, they only guarantee that a thread reading the volatile variable will see the latest value written to it by any other thread. If you need to perform atomic operations on a shared variable, you should use a synchronized block or method instead.

### 2. how to create a new thread(Please also consider Thread Pool case)?
```java
import java.util.concurrent.*;

public class Main{
    public static void main(String[] args){
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++){
            es.submit(new Task("" + i));
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
        System.out.println("start task " + name);
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("end task" + name);
        }
    }
}

```

### 3. Difference between Runnable and Callable
+ Runnable: It does not return any value and it cannot throw any checked exceptions
+ Callable: It has a return value and it can throw any checked exception

### 4. what is the diff between t.start() and t.run()?
+ t.start() starts a new thread to execute the task (run())
+ t.run() execute the task in the current thread

### 5. Which way of creating threads is better: Thread class or Runnable interface?
If you only need to create a single thread and don't need to reuse the thread, the Thread class is a good choice. If you need to reuse the task with different threads, the Runnable interface is a better choice.

Additionally, using Runnable interface over the Thread class can also help to achieve the better encapsulation and separation of concerns, as the task and the thread are separate entities. This way, you can have multiple threads running the same task, or you can change the task and reuse the thread.

### 6. what is the thread status?

![thread status](/ShortQuestions/assets/Thread_Status.png?raw=true)

### 7. difference between wait() and sleep() method
+ the wait() method releases the monitor on an object and goes into a waiting state, 
+ the sleep() method temporarily pauses the execution of the current thread without releasing any monitors or locks. 

### 8. What is deadlock?
a deadlock occurs when each process is holding a resource and waiting for another process to release its resource. As a result, none of the processes can continue to execute, and the system is said to be in a deadlock state.

### 9. how do threads communicate with each other?
+ syncronized: wait & notify & notifyAll
+ ReentrantLock:  condition.await() & condition.signal() & condition.signalAll()

### 10. what is join() method?
The join() method in Java is a method of the Thread class that allows one thread to wait for the completion of another thread. When a thread calls the join() method on another thread, the calling thread will be blocked until the thread that it has joined completes its execution.

### 11. what is yield() method
The yield() method in Java is a method of the Thread class that temporarily pauses the currently running thread, allowing other threads of the same or higher priority to execute. The paused thread will then be placed at the end of the ready queue for its priority level, and will resume execution when a CPU becomes available.

### 12. Explain thread pool
![thread pool](/ShortQuestions/assets/Thread_Pool.png?raw=true)

### 13. What is Executor Framework in Java, its different types and how to create these executors?
The Executor framework in Java is a set of classes and interfaces provided by the Java standard library that allows you to easily create and manage threads in a more efficient and organized way. The main components of the Executor framework are the Executor interface, the ExecutorService interface, and the ThreadPoolExecutor class.

An Executor is an object that can execute Runnable tasks. An ExecutorService is a subinterface of Executor that provides additional functionality such as the ability to manage a pool of threads, submit tasks for execution, and retrieve the results of completed tasks.

The most common way of creating an ExecutorService is to use one of the factory methods provided by the Executors class. These factory methods provide a convenient way to create different types of ExecutorService objects:

+ newFixedThreadPool(int nThreads): creates a fixed-size thread pool that reuses a pool of worker threads to execute any submitted task.

+ newCachedThreadPool(): creates a thread pool that creates new threads as needed, but will also reuse previously constructed threads when they are available.

+ newSingleThreadExecutor(): creates an executor that uses a single worker thread to execute tasks.

+ newScheduledThreadPool(int corePoolSize) : creates a thread pool that can schedule commands to run after a given delay, or to execute periodically.

### 14. Difference between shutdown() and shutdownNow() methods of executor
The main difference between them is how they handle the tasks that are currently running or waiting to be executed:

+ shutdown(): This method initiates a graceful shutdown of the executor. It stops accepting new tasks, but allows the currently running tasks to complete execution. Any tasks submitted after the shutdown() method is called will be rejected, and the isShutdown() method will return true.

+ shutdownNow(): This method initiates an immediate shutdown of the executor. It attempts to stop all running tasks and skips all waiting tasks. Any tasks submitted after the shutdownNow() method is called will be rejected, and the isShutdown() method will return true.

### 15. What is Atomic classes? when do we use it?
Atomic classes in Java are classes that provide a way to perform atomic operations on a single variable. Atomic operations are those that are guaranteed to be executed in a single step, without the possibility of interference from other threads.

Java provides several built-in atomic classes, such as AtomicInteger, AtomicLong, and AtomicReference, which allow you to perform atomic operations on variables of those types. These classes provide methods such as get(), set(), incrementAndGet(), decrementAndGet() and so on.

### 16. What is the cocurrent collections?
| INTERFACE | NON-THREAD-SAFE       | THREAD-SAFE                            |
|-----------|-----------------------|----------------------------------------|
| List      | ArrayList             | CopyOnWriteArrayList                   |
| Map       | HashMap               | ConcurrentHashMap                      |
| Set       | HashSet/TreeSet       | CopyOnWriteArraySet                    |
| Queue     | ArrayDeque/LinkedList | ArrayBlockingQueue/LinkedBlockingQueue |
| Deque     | ArrayDeque/LinkedList | LinkedBlockingDeque                    |

### 17. what kind of locks you know?
+ reentrantLock
+ ReadWriteLock
+ StampedLock

### 18. What is the difference between class lock and object lock?
The main difference between class lock and object lock is the scope of synchronization. A class lock synchronizes access to class level resources for all objects of that class, while an object lock synchronizes access to object level resources for only one specific object.
+ A class lock is used to synchronize access to class level resources, such as class variables, class methods, and class initializers. When a thread enters a synchronized class method or block, it acquires the class lock, which prevents other threads from entering any other synchronized methods or blocks in the same class until the first thread exits the synchronized block.

+ An object lock, on the other hand, is used to synchronize access to object level resources, such as instance variables and instance methods. When a thread enters a synchronized instance method or block, it acquires the object lock, which prevents other threads from entering any other synchronized methods or blocks in the same object until the first thread exits the synchronized block.

### 19. What is future and completableFuture?
Future and CompletableFuture are classes in Java that provide a way to asynchronously execute tasks and retrieve the results of those tasks at a later time.

+ A Future object represents the result of an asynchronous computation. It can be used to check if the computation is complete, retrieve the result of the computation, and cancel the computation if necessary. It provides methods like isDone(), get(), cancel(boolean), and isCancelled().
+ CompletableFuture is an enhanced version of Future, it provides additional methods to compose, chain, and combine multiple asynchronous tasks. It also provides a way to handle errors and completion actions. CompletableFuture class also extends the Future interface, so it has all the functionalities of Future.

### 20. what is ThreadLocal?
ThreadLocal is a class in Java that allows you to create variables that are only accessible to the current thread. It provides a way to store and retrieve thread-local variables, which are variables that are specific to the current thread, and are not shared among other threads.

### 21. 

### 22. 

### 23. 

### 24. 
