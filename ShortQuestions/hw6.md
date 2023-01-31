1.  Explain volatile variables in java? (we also use it in Singleton)
    * The use of `volatile` will make the current class or variable thread-safe, and 
    that variable can be used by multiple thread at the same time without any problem.
2.  how to create a new thread(Please also consider Thread Pool case)?
    1. By extending the `Thread` class
    2. By implementing the `Runnale` class and use it to initialize the `Thread`
        class using `new Thread(myRunnableObject)`
    3. By implementing the `Callable` class
    4. By submitting a task to the thread pool
3.  Difference between Runnable and Callable
    * Runnable: has return
    * Callable: has no return
4.  what is the diff between t.start() and t.run()?
    * `t.start()` will put current task into a new thread
    * `t.run()` will put current task into current thread without creating a new one
5.  Which way of creating threads is better: Thread class or Runnable interface?
   * Runnable is more preferred, because if we have multiple threads doing different
     jobs, then extending the thread class will make the current thread class have no
    other class to extend.
   * Using Runnable interface is more flexible than extending the thread class.
6.  what is the thread status?
   * NEW - a thread object is created, but is not started yet.
   * RUNNABLE - includes `ready` and `running` states
   * BLOCKED - thread being blocked due the lock
   * WAITING - waits for others threads to send signals such as `notify` or `interrupt`
   * TIMED_WAITING - returns after a period of time
   * TERMINATED - current tread finished executing
7.  difference between wait() and sleep() method
   * `wait()` - releases the lock until it hears bac from `notify()` or `notifyAll()`
     sent by other threads
   * `sleep()`- make current thread or program pause for a set time in milliseconds
8.  What is deadlock?
   * Multiple thread waiting for each other to release the ownership of the lock
9.  how do threads communicate with each other?
   * Under the context of synchronization, they use `wait()` and `notify()` to 
     communication with each other
   * Uder the context of ReentrantLock, they use `condition.await()`, `condition.signal`
        and `condition.signalAll()`
10. what is join() method?
    * called by thread object inside `main` function, and `main` process will wait 
      for that thread to finish
11. what is yield() method
    * called by Thread class which give other waiting threads the same priority to 
      execute
12. Explain thread pool
    * is a collection that execute asynchronous thread callbacks, and is used to
      reduce the number of new threads being created and manage current threads efficiently
13. What is Executor Framework in Java, its different types and how to create these
    executors?
    * Used to run multiple runnable tasks without creating new threads and reusing
     the already created ones
    * Below are the types of executors
      1. SingleThreadExecutor - `ExecutorService executor = Executors.newSingleThreadExecutor();`
      2. FixedThreadPool(n)+ - `ExecutorService fixedPool = Executors.newFixedThreadPool(2);`
      3. CachedThreadPool - `ExecutorService executorService = Executors.newCachedThreadPool();`
      4. ScheduledExecutor - `ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);`
14. Difference between shutdown() and shutdownNow() methods of executor
    * `shutdown()` - notify executor service to not accept new task
    * `shutdonwNow()` - same as `shutdown()` plus try to cancel the already submitted tasks
15. What is Atomic classes? when do we use it?
    * It's a class that realize thread safety without using locks
    * Suitable for calculator and incrementor
16. What is the concurrent collections?
    * It a thread-safe version of the collection implementation
17. What kind of locks you know?
    * ReentrantLock
    * ReadWriteLock
    * StampedLock
18. What is the difference between class lock and object lock?
    * Object Lock: Used to lock non-static method or non-static block of the code
    * Class Lock: Used to protect synchronized static method from being accessed
        by multiple threads
19. What is future and completableFuture?
    * Future - a class that can get return result from the asynchronous tasks we just
      submitted
    * CompletableFuture - when you call `Future::get`, and main thread will be blocked
      and wait for the return result. Therefore, `CompletableFuture` provides a way
      to automatically execute the **callback** methods from the callback object,
        we can define corresponding actions to take in advance on task success of failed.
20. what is ThreadLocal?
    * A class to pass local variables inside a single thread, and make the shared 
        state reachable by different processes within the thead
21. Type the code by your self and try to understand it. (package
    com.chuwa.tutorial.t08_multithreading)
22. Read those interview questions and pick some important questions to this home
    work.
23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print
        2,4,6,8,10. (solution is in
        com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
    1. One solution use synchronized and wait notify
       1. See codes in c05_waitNotify.OddEventPrinter
    2. One solution use ReentrantLock and await, signal
        1. See codes in c05_waitNotify.OddEventPrinter1
24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread
    output 21-22. threads run sequence is random. (solution is in
    com.chuwa.exercise.t08_multithreading.PrintNumber1)
    1. See codes in multithreading.PrintNumber1
