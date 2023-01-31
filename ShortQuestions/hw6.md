### 1. Explain volatile variables in java? (we also use it in Singleton)
The volatile modifier is used to let the JVM know that a thread accessing the variable must always merge its own private copy of the variable with the master copy in the memory.

Accessing a volatile variable synchronizes all the cached copied of the variables in the main memory. Volatile can only be applied to instance variables, which are of type object or private. A volatile object reference can be null.

### 2. how to create a new thread(Please also consider Thread Pool case)?
* Extends Thread Class
* Implements Runnable
* Implements Callable

### 3. Difference between Runnable and Callable
runnable has no return value, callable has return value. And the Callable interface is a generic interface that can return specified type of result.

### 4. what is the diff between t.start() and t.run()?
* t.start starts a new thread to excute the task（run()）
* t.run() excute the task in the current thread.

### 5. Which way of creating threads is better: Thread class or Runnable interface?

Runnable interface is better.

* By implementing runnable interfale, you’re not really specializing or modifying the thread’s behavior. You’re just giving the thread something to run. That means composition is the better way to go.

* Java only supports single inheritance, so you can only extend one class.

* Instantiating an interface gives a cleaner separation between your code and the implementation of threads.
* Implementing Runnable makes your class more flexible. If you extend Thread then the action you’re doing is always going to be in a thread. However, if you implement Runnable it doesn’t have to be. You can run it in a thread, or pass it to some kind of executor service, or just pass it around as a task within a single threaded application.

### 6. what is the thread status?
NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED

### 7. difference between wait() and sleep() method

1. Call on:
 * wait(): Call on current thread that hold HandObject Object
 * sleep(): Call on Thread execute task get beer (is class method so affect on current running thread)
2. Synchronized:
 * wait(): when synchronized multi thread access same Object (HandObject) (When need communication between more than one thread (thread execute coding, thread execute get beer) access on same object HandObject )
 * sleep(): when waiting condition to continue execute (Waiting beer available)
3. Hold lock:
 * wait(): release the lock for other object have chance to execute (HandObject is free, you can do other job)
 * sleep(): keep lock for at least t times (or until interrupt) (My job still not finish, i'm continue hold lock and waiting some condition to continue)
4. Wake-up condition:
 * wait(): until call notify(), notifyAll() from object
 * sleep(): until at least time expire or call interrupt

### 8. What is deadlock?

Deadlock is a situation where a set of processes are blocked because each process is holding a resource and waiting for another resource acquired by some other process.

### 9. how do threads communicate with each other?

* `wait()`: This method causes the current thread to release the lock. This is done until a specific amount of time has passed or another thread calls the `notify()` or `notifyAll()` method for this object.
* `notify()`: This method wakes a single thread out of multiple threads on the current object’s monitor. The choice of thread is arbitrary.
* `notifyAll()`: This method wakes up all the threads that are on the current object’s monitor.

### 10. what is join() method?

When the join() method is invoked, the current thread stops its execution and the thread goes into the wait state. The current thread remains in the wait state until the thread on which the join() method is invoked has achieved its dead state. If interruption of the thread occurs, then it throws the InterruptedException.

### 11. what is yield() method

A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority. If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution.

### 12. Explain thread pool
Too many threads will bring additional overhead, including the overhead of creating and destroying threads, the overhead of scheduling threads, etc., and also reduces the overall performance of the computer. The thread pool maintains multiple threads, waiting for the supervisor to assign tasks that can be executed concurrently. This approach, on the one hand, avoids the cost of creating and destroying threads when processing tasks, and on the other hand, avoids the excessive scheduling problem caused by the expansion of the number of threads, ensuring the full utilization of the core.

### 13. What is Executor Framework in Java, its different types and how to create these executors?
Java executor framework released with the JDK 5 is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads.

* An object that executes submitted Runnable tasks.
* SingleThreadExecutor: Executors.newSingleThreadExecutor()
* FixedThreadPool: Executors.newFixedThreadPool(n);
* CachedThreadPool: Executors.newCachedThreadPool();
* ScheduledExecutor: Executors.newScheduledThreadPool(n);
    

### 14. Difference between shutdown() and shutdownNow() methods of executor
* shutdown() will just tell the executor service that it can't accept new tasks, but the already submitted tasks continue to run
* shutdownNow() will do the same AND will try to cancel the already submitted tasks by interrupting the relevant threads. Note that if your tasks ignore the interruption, shutdownNow will behave exactly the same way as shutdown.

### 15. What is Atomic classes? when do we use it?
The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable. The method works the same as read and writes on volatile variables.

### 16. What is the cocurrent collections?
Concurrent Collections is a programming model for software frameworks to expose parallelism in applications. 

| INTERFACE | NON-THREAD-SAFE         | THREAD-SAFE                              |
| --------- | ----------------------- | ---------------------------------------- |
| Lits      | ArrayList               | CopyOnWriteArrayList                     |
| Map       | HashMap                 | ConcurrentHashMap                        |
| Set       | HashSet / TreeSet       | CopyOnWriteArraySet                      |
| Queue     | ArrayDeque / LinkedList | ArrayBlockingQueue / LinkedBlockingQueue |
| Duque     | ArrayDeque / LinkedList | LinkedBlockingDeque                      |


### 17. what kind of locks you know?
Synchronized, ReentrantLock, ReadWriteLock
### 18. What is the difference between class lock and object lock?
| Class Lock  | Object Lock |
| ------------- |:-------------:|
| It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime      | It can be used when you want non-static method or non-static block of the code should be accessed by only one thread     |
| It should always be used to make static data thread safe.       | It should always be used to make non-static data thread safe.      |
| Multiple objects of class may exist but there is always one class’s class object lock available      | Every object the class may have their own lock    |


### 19. What is future and completableFuture?
* Future: Future represents the result of an asynchronous computation. We can us isDone() to check if the computation is complete. Get() method will wait until the computation is complete then retrieve the result.
 
* CompletableFuture: is an extension of Future, providing the functionality to chain multiple dependent tasks, complete computation, and handle exception.
    
### 20. what is ThreadLocal?
TheadLocal construct allows us to store data that will be accessible only by a specific thread.
### 22. Read those interview questions and pick some important questions to this homework.
