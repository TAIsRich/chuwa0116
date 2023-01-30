##1. Explain volatile variables in java? (we also use it in Singleton)
####Answer:
    A volatile variable is basically a keyword that is used to ensure and address the visibility of changes to 
    variables in multithreaded programming. This keyword cannot be used with classes and methods, instead can be 
    uaed with variables. It is simply used to achieve thread-safety. If you mark any varible as volatile, then all
    the threads can read its value directly from the main memory rather than CPY cache, so that each thread can get
    an updated value of the variable.Volatile is a lightweighted synchronization mechanism procided by Java, which 
    does not cause thread context switching and scheduling. The purposes of votile are ensurting memory visibility of
    variables and preventing instruction reordering. However, using volatile does not guarantee atomicity.


##2. how to create a new thread(Please also consider Thread Pool case)?
####Answer:
    1)creating by extending the Thread class
    2)creating by implementing Runnable interface
    3)creating by implementing Callable interface
    4)creating by Thread Pool, which can be FixedThreadPool, CachedThreadPool, SingleThreadPool, and etc..

##3. Difference between Runnable and Callable
####Answer:
    1)Runnable does not return any result and therefore, cannot throw a checked exception,
        while Callable returns a result and therefore, can throw an exception.
    2)Runnable cannot be passed to invokeAll method, while Callable can.
    3)Runanable belongs to Java.lang, while Callable belongs tp java.util.concurrent.
    4)Runnable uses the run() method to define a task, while Callable uses call() method to
    define a taks.
    5)To use the Runnable interface, one needs to override the run() method, while one needs
    to override the call() method to use Callable interface.

##4. what is the diff between t.start() and t.run()?
####Answer:
    1)t.start(): the start() method is used to start or begin the execution of a newly created thread. When the 
    start() method is called, a new thread is created and this newly created thread executes the task this is kept 
    in the run() method. One can call the start() method only once.
    2)t.run(): the run() method is used to start or begin the execution of the same thread, When the run() method is 
    called, no new thread is created as in the case of the start() method. This method is executed by the current thread.
    One can call the run() method multiple times.
    t.start() starts a new thread to execute the task
    t.run() execute the task in the current thread. 

##5. Which way of creating threads is better: Thread class or Runnable interface?
####Answer:
    1)Creating threads via Runnable interface is better.
    2)Provided that you simply override the run() method and not the other methods of the Thread class, implementing the 
    Runnable interface is better. Because you do not intend to modify or enhance the basic capabilities of a class, you should 
    not create subclasses of it. And the way Runnable implemented, which realizes threads and resources relatively separated, makes 
    the program more robust.
    3)When dealing with mmulti-thread programming, using Runanble interface can avoid the limitations due to Java single inheritance,
    realize the separation of business execution logic and data resources, and manage thread lifecycle by using in conjunction
    with thread pools.

##6. what is the thread status?
####Answer:
    The thread status includes the following:
    1)NEW: A new thread object has been created, but the start() method has not yet been called
    2)RUNNABLE: in Java threads, the states 'ready' and 'running' are loosely referred as 'running'. After 
    the thread object is created, another thread, such as the main thread calls the object's start() method.
    The thread in this state is in the runable thread pool, waiting to be selected by the thread scheduler to 
    accuire the use of the CPU. At this time, the thread is in the ready state. Threads in the ready state become
    running when the CPU time slice is obtained.
    3)BLOCKED: indicates that the thread is blocked from a lock/
    4)WAITING: A thread in this state is waiting for some specific action(notification or interrupt) to be taken by other threads.
    5)TIMED_WAITING: Unlike WAITING, this state can return on its own after the specified time.
    6)TERMINATED: indicates that the thread has finished executing.

##7. difference between wait() and sleep() method
####Answer:
    1)wait(): it is non-static method that causes the current thread to wait and go to sleep until some other threads call 
    the notify() or notifyAll() method for the object's monitor(lock). It simply releases the lock and is mostly used for 
    inner-thread commmunication. It is defined in the object class, and should only be called from a synchronized context.
    2)sleep(): it is a static method that pauses or stops the execution of the current thread for some specified period. It
    does not release the lock while waiting and is mostly used to introduce pause on execution. It is defined in thread class,
    and no need to call from a synchronized context.


##8. What is deadlock?
####Answer:
    DeadLock, is a situation where multiple threads are blocked forever. It generally occurs when multiple threads hold 
    locks on different resources and are waiting for other resources to complete their task. 


##9. how do threads communicate with each other?
####Answer:
    Threads can communicate using three methods i.e., wait(), notify(), and notifyAll().


##10. what is join() method?
####Answer:
    join() method is generally used to pause the execution of a current thread unless and until the specified thread on which
    join is called is dead or completed. To stop a thread from running until another thread gets ended, this method can be used.
    It joins the start of a thread execution to the end of anther thread's execution. It is considered the final method of 
    a thread class.


##11. what is yield() method
####Answer:
    yield() is a method of the Thread Class. It drops the time slice of the current thread CPU, and puts the running thread 
    back into a ready state, and re-computers for CPU schduling rights. It might get by current thread again, or get by
    another thread.


##12. Explain thread pool
####Answer:
    A thread pool is simply a collection of pre-initialized or worker threads at the start-up that can be used to  execute 
    tasks and put back in the pool when completed. It is referred to as pool threads in which a group of fixed-size
    threads is created. By reducing the number of application threads and managing their lifecycle, one can mitigate the 
    issue of performance using a thread pool. Using threads, performance can be enhanced and better system stability can occur.
    To create the thread pools, java.util.concurrent.Executors class usually provides factory methods.


##13. What is Executor Framework in Java, its different types and how to create these executors?
####Answer:
    1）The executor framework mainly consists of tasks, their execution, and the evaluation of asynchronous results. Tasks 
    include the interces that the executed task needs to implement: Runnable interfaces or Callable interfaces.
    Task execution includes Executor, the core interface of the task execution mechanism, and ExecutorService interfave, 
    which inherits from Executor. There are two key Executor framework class implements the ExecutorService interface(
    ThreadPoolExecutor and ScheduledThreadPoolExecutor). And asnchronous calculation results include the interface Future
    and class FutureTask that implements the Future interface. 
    2）Because ExecutorService is an interface, several common implementation classes provided by the Java standard library
    are:
    FixedThreadPool: A thread pool with a fixed number of thread.
    CachedThreadPool: Thread pool that dynamically adjusts the number of threads based on the task.
    SingleThreadExecutor: Thread pool for single thread execution only.


##14. Difference between shutdown() and shutdownNow() methods of executor
####Answer:
    1)shutdown(): Gently shutdown the thread pool, which means wait until all the tasks that have been added to the thread
    pool are completed.
    2)shutdownNow(): Immediately shutdown to stop the tasks in progress and return the unexecuted tasks in the queue.
    The shutdown method is safe but not very responsive, while the shutdownNow is repsonsive but not secure enough.


##15. What is Atomic classes? when do we use it?
####Answer:

##16. What is the concurrent collections?
####Answer:
    For all kinds of collections, we deal with non-threadsafe collections on a daily basis. And Java provides a corresponding 
    thread-safe collection for immediate use as the following:
    1)interface: List, Thread-safe: CopyOnWriteArrayList;
    2)interface: Map, Thread-safe: ConcurrentHashMap;
    3)interface: Set, Thread-safe: CopyOnWritedArraySet;
    4)interface: Queue, Thread-safe: ArrayBlockingQueue/LinkedBlockingQueue;
    5)interface: Deque, Thread-safe: LikedBlockingDeque.


##17. what kind of locks you know?
####Answer:
    1)ReentrantLock: ReentrantLock is a lock implemented in Java code. We must acquire the lock firstly, and then release it 
    properly in finally. And as the name implies, ReentrantLock is a reentrant lock, which likes the keyword 'synchronized',
    the same lock can be acquired multiple times by a thread.
    2)ReadWriteLock: The read and write blocks are seperate. It is a pessimistic, which means every time only one thread is allowed to write(other threads can 
    neither write nor read). And when there is no thread writing, multiple threads are allowed to read at the same time, which
    improves performance. Hence, ReadWriteLock is suitable for scenarios where you read more and write less.
    3)StampedLock: It adds an optimistic lock mechanism that allows writing while reading. However it may cause data inconsistency,
    so we need to write the code handle it. The traditional steps are obtain an optimistic read lock -> check whether other write 
    locks occur after the optimistic read lock -> obtain a pessimistic read lock -> release the pessimistic read lock.


##18. What is the difference between class lock and object lock?
####Answer:
    1)Class Lock: In Java, each and every class has a unique lock usually referred to as a class level lock. These locks are 
    achieved using the keyword 'static synchronized' and can be used to make static data thread-safe. It is generally used 
    when one wants to prevent multiple threads from enterting a stnchronized block.
    2)Object Lock: In Java, each and every object has a unique lock usually referred to as an object-level lock. These locks
    are achieved using the keyword 'synchronized' and can be used to protect non-static data. It is generally used when one wants
    to synchronzie a non-static method or block so that onlt the thread will be able to execute the code block on a given 
    instane of the class.

##19. What is future and completableFuture?
####Answer:
    1)future: The Callable has a return value. The ExecutorService.submit() method returs a Future type, an instance of which
    represents an object that can fetch results in the Future. When we submit a Callable task, we get a Future object at the 
    same time, and then we call the get() method of the Future obejct at some point in the main thread to get the result of 
    the asynchronous execution. When we call get(), we get the result directly if the asynchronous task has already completed.
    If the asynchronous task has not completed, get() blocks and does not return the result until the task has completed.
    2)completableFuture: It makes some improvement for the Future by passing in callback objects. The callback method of the 
    callback object is automatically called when the asynchronous task completes or an exception occurs. CompletableFuture can 
    specify an asynchronous processing steps as following:
    thenAccept(): processes normal results
    execptional(): handles exceptional results
    thenApplyAsync(): used to serialize another CompletableFuture
    anyOf() and allOf(): used to parallelize multiple CompletableFutures. 

##20. what is ThreadLocal?
####Answer:
    ThreadLocal is an automated mechanism for thread-local storage which prevents tasks from colliding on shared resources through
    thread isolation, and this can creates a different store for each different thread that uses the same
    variable. ThreadLocal is a class that creates a separate copy of a varaible for each thread in multiple threads. When a
    ThreadLocal is used to maintain variables, it creates a separate copy of each variable for each thread. ThreadLocal represents
    the thread's "local variable" and ensures that each ThreadLocal variable is independent, which can avoid data inconsistency
    caused by multithreaded operations on shared variables. Also, ThreadLocal suits for preserving
    context in a thread's processing flow(avoiding passing the same parameter across all methods). To use ThreadLocal, we 
    use try...finally structure, and clear in finally.
    


##21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)
####Answer:
    The answers are in module1/src/main/java/MultiThread

##22. Read those interview questions and pick some important questions to this homework
####Answer:
    1)Why wait(), notify(), notifyAll() methods are present in Object class?
    We know that every object has a monitor that allows the thread to hold a lock on the object. But the thread class does
    not contain any monitors. Thread usually waits for the object's monitor(lock) by calling the wait() method on an object, 
    and notify other threads that are waiting for the same lock using notify() or notifyAll() method. Therefore, these three 
    methods are called on objects only and allow all threads to communicate with each that are created on that object.
    
    2)What do yo mean by garbage collection?
    Garbage collection is basically a process of managing memory automatically. It uses several GC agolrithms among which the 
    popular one includes Mark and Sweep. The process includes three phases i.e., marking, deletion, and compaction/copying.
    In simple words, a garbage collector finds objects that are no longer required by the program and then delete or remove
    these unused objects to free up the memory space.
    
    3)Can two threads execute two methods(static and non-static concurrently)?
    Yes, it is possible. If both the trheads acquire locks on different objects, then they can execute concurrently without 
    any problem.

    4)What is the lock interface? Why is it better to use a lock interface rather than a synchronized black?
    Lock interface was introduced in Java 1.5 and is generally used as a synchronization mechanism to provide important operations
    for blocking. Advantages of using Lock interface over Synchronization block:
    1.Methods of Lock interface, for examplem, Lock() and Unlock() can be called in different methods. It is the main advantage 
    of a lock interface over a synchronized block because the synchronized block is fully contained in a single method.
    2.Lock interface is more flexible and makes sure that the longest waiting trhead gets a fair chance for execution, unlike 
    the sunchronization block.

    5)What is synchronized method and sunchronized block? Which one should be preferred?
    Synchronized Method: In this method, the thread acquires a lock on the object when they enter the synchronzied method and 
    releases the lock eitehr normally or by throwing an exception when they leave the method, No otehr thread can use the whole
    method unless and until the current trhead finishes its execution and release the lock. It can be used when one wants to 
    lock on the entire fuctionality of a particular method.

    Synchronized Block: In this method, the trhead acquires a lcok on the object between parentheses after the synchronized keyword,
    and releases the lock when they leave the block. No other thread can acquire a lock on the locked object unless and until 
    the synchronized block exists. It can be used when one wants to keep other parts of the programs accessible to other threads.
    
    Synchronized blocks should be preferred more as it boosts the performance of a particular prgram, It only locks a certain
    part of the program(critical section) rather than the entire method and therefore leads to less contention.

##23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
##a. One solution use synchronized and wait notify b. One solution use ReentrantLock and await, signal
####Answer:
    in the module1/src/main/java/MultiThread/SolutionFor23 

##24.create 3 threads, one thread output 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)
####Answer:
    in the module1/src/main/java/MultiThread/SolutionFor24