1. Explain volatile variables in java? (we also use it in Singleton)  
   The volatile modifier is used to let the JVM know that a thread accessing the variable must always merge its own private copy of the variable with the master copy in the memory. Accessing a volatile variable synchronizes all the cached copied of the variables in the main memory.
2. how to create a new thread(Please also consider Thread Pool case)?
   create a thread is to declare a class
3. Difference between Runnable and Callable  
   Runnable instances can be run by Thread class as well as ExecutorService but Callable instances can only be executed via ExecutorService.
4. what is the diff between t.start() and t.run()?  
   start creates a new thread while the run doesn't create any thread and simply executes in the current thread like a normal method call.
5. Which way of creating threads is better: Thread class or Runnable interface?
   Runnable interface
6. what is the thread status?
It means the satus of thread now. A thread can be in only one state at a given point in time.
7. difference between wait() and sleep() method  
   wait() releases the lock while sleep() doesn't release any lock while waiting. wait() is used for inter-thread communication while sleep() is used to introduce a pause on execution.
8. What is deadlock?  
   A deadlock is a situation in which two computer programs sharing the same resource are effectively preventing each other from accessing the resource, resulting in both programs ceasing to function.
9. how do threads communicate with each other?  
   All the threads in the same program share the same memory space. If an object is accessible to various threads then these threads share access to that object's data member and thus communicate each other. The second way for threads to communicate is by using thread control methods.
10. what is join() method?  
    The join() method creates and returns a new string by concatenating all of the elements in an array (or an array-like object), separated by commas or a specified separator string.
11. what is yield() method  
    The yield() method is used in Java to hint the task scheduler to move the currently executing task to the Ready state and move another task or thread to the running state.
12. Explain thread pool  
    a thread pool is a software design pattern for achieving concurrency of execution in a computer program. a thread pool maintains multiple threads waiting for tasks to be allocated for concurrent execution by the supervising program.
13. What is Executor Framework in Java, its different types and how to create these
    executors?  
    Java executor framework is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads. The Executors provide factory methods that are being used to create ThreadPools of worker threads.
    * SingleThreadExecutor: A single thread pool can be obtained by calling the static newSingleThreadExecutor() method of the Executors class. It is used to execute tasks sequentially.
    * FixedThreadPool(n): It is a thread pool of a fixed number of threads. The tasks submitted to the executor are executed by the n threads and if there is more task they are stored on a LinkedBlockingQueue. It uses Blocking Queue.
    * CachedThreadPool: Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available. Calls to execute will reuse previously constructed threads if available. If no existing thread is available, a new thread will be created and added to the pool. It uses a SynchronousQueue queue.
    * ScheduledExecutor: Scheduled executors are based on the interface ScheduledExecutorService which extends the ExecutorService interface. This executor is used when we have a task that needs to be run at regular intervals or if we wish to delay a certain task.
14. Difference between shutdown() and shutdownNow() methods of executor  
    The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.
15. What is Atomic classes? when do we use it?  
    The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable. The method works the same as read and writes on volatile variables.
16. What is the cocurrent collections?  
    Concurrent Collections (known as CnC) is a programming model for software frameworks to expose parallelism in applications. The Concurrent Collections conception originated from tagged stream processing development with HP TStreams.
17. what kind of locks you know?  
    ReadWriteLock, ReentrantLock, Condition, StampedLock
18. What is the difference between class lock and object lock?
    * Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread. 
    * Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.
19. What is future and completableFuture?  
    A Future is used as a reference to the result of an asynchronous computation. It provides an isDone() method to check whether the computation is done or not, and a get() method to retrieve the result of the computation when it is done.  
    CompletableFuture is an extension to Java’s Future API which was introduced in Java 5. CompletableFuture is used for asynchronous programming in Java. Asynchronous programming is a means of writing non-blocking code by running a task on a separate thread than the main application thread and notifying the main thread about its progress, completion or failure.
20. what is ThreadLocal?  
    ThreadLocal provides an easy-to-use API to confine some values to each thread. This is a reasonable way of achieving thread-safety in Java.
21. Type the code by your self and try to understand it. (package
    com.chuwa.tutorial.t08_multithreading)
22. Read those interview questions and pick some important questions to this home
    work.
23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print
    2,4,6,8,10. (solution is in
    com.chuwa.tutorial.t08_multithreading.c05_waitNotify.Solution23)
    No. 1 / 3
    a. One solution use synchronized and wait notify
    b. One solution use ReentrantLock and await, signal
24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread
    output 21-22. threads run sequence is random. (solution is in
    com.chuwa.exercise.t08_multithreading.PrintNumber1)
    
Solution of 23 and 24 are in coding file.