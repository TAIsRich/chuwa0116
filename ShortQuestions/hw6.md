
1. Explain volatile variables in java? (we also use it in Singleton)\
volatile is a keyword we can apply to a field to ensure that when one thread writes a value to that field, the value written is "immediately available" to any thread that subsequently reads it (visibility feature).
2. how to create a new thread(Please also consider Thread Pool case)?\
   * implementing Runnable interface and implement run() method
   * extends Thread class and override run() method
   * implement Callable interface and implement call() method. Use FutureTask object to wrap the callable object. Assign the FutureTask object to a target thread. Then start the thread.
   * Using thread pool.
3. Difference between Runnable and Callable?\
   * Runnable instances can be run by Thread class as well as ExecutorService but Callable instances can only be executed via ExecutorService
   * Creating thread using callable can return value.
4. what is the diff between t.start() and t.run()?
   * t.start() : create a new thread 
   * t.run(): execute code inside run() method in a thread
5. Which way of creating threads is better: Thread class or Runnable interface?\
Runnable interface is preferred. Implementing Runnable makes your code loosely coupled as the code of thread is different from the class that assign job to the thread. It requires less memory and also allows a class to inherit any other class.
6. what is the thread status?
   * New
   * Runnable
   * Blocked
   * Waiting 
   * Timed Waiting 
   * Terminated
7. difference between wait() and sleep() method\
   wait() releases the lock while sleep() doesn't release any lock while waiting
8. What is deadlock?\
   Deadlock in Java is a condition where two or more threads are blocked forever, waiting for each other.
9. how do threads communicate with each other?\
Using wait(), notify(), notifyAll() methods.
10. what is join() method?\
    When we invoke the join() method on a thread, the calling thread goes into a waiting state. It remains in a waiting state until the referenced thread terminates.
11. what is yield() method?\
    It can stop the currently executing thread and will give a chance to other waiting threads of the same priority.
12. Explain thread pool\
    * Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.
13. What is Executor Framework in Java, its different types and how to create these executors?
    * An object that executes submitted Runnable tasks.
    * SingleThreadExecutor: Executors.newSingleThreadExecutor()
    * FixedThreadPool: Executors.newFixedThreadPool(n);
    * CachedThreadPool: Executors.newCachedThreadPool();
    * ScheduledExecutor: Executors.newScheduledThreadPool(n);
14. Difference between shutdown() and shutdownNow() methods of executor?\
    The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.
15. What is Atomic classes? when do we use it?
    * The atomic classes provide a lock-free and thread-safe environment or programming on a single variable.
    * When a variable can be accessed by multi threads, we can use Atomic variables.
16. What is the concurrent collections?\
    Concurrent Collections is a programming model for software frameworks to expose parallelism in applications.
    * thread-safe list: CopyOnWriteArrayList
    * thread-safe HashMap: ConcurrentHashMap
    * thread-safe HashSet: CopyOnWriteArraySet
    * thread-safe queue: ArrayBlockingQueue / LinkedBlockingQueue
    * thread-safe ArrayDeque/LinkedList: LinkedBlockingDeque
17. what kind of locks you know?
    * ReentrantLock
    * Condition
    * ReadWriteLock
    * StampedLock
18. What is the difference between class lock and object lock?
    * object lock: can be used inside non-static method or non-static block.
    * class lock: can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.
19. What is future and completableFuture?
    * Future: A Future represents the result of an asynchronous computation. We can us isDone() to check if the computation is complete. Get() method will wait until the computation is complete then retrieve the result.
    * CompletableFuture: is an extension of Future, providing the functionality to chain multiple dependent tasks, complete computation, and handle exception. 
20. what is ThreadLocal?\
    The ThreadLocal class in Java allows programmers to create variables that are accessible only to the thread that created them.
21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)
22. Read those interview questions and pick some important questions to this homework.
    * What’s the difference between notify() and notifyAll()?\
      notify(): It sends a notification and wakes up only a single thread.\
      notifyAll(): wakes multiple threads that are waiting on the object’s monitor.
    * Can you start a thread twice?\
      No, it's not at all possible to restart a thread once a thread gets started and completes its execution.
    * Explain thread priority.\
      Thread priority simply means that threads with the highest priority will get a chance for execution prior to low-priority threads. One can specify the priority but it's not necessary that the highest priority thread will get executed before the lower-priority thread. Thread scheduler assigns processor to thread on the basis of thread priority. The range of priority changes between 1-10 from lowest priority to highest priority.

23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in
    com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
* One solution use synchronized and wait notify
* One solution use ReentrantLock and await, signal
    Code is in codingQuestions/hw6
24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in
    com.chuwa.exercise.t08_multithreading.PrintNumber1)\
    Code is in codingQuestions/hw6
