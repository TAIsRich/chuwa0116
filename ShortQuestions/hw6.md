#### 1.  Explain volatile variables in java? (we also use it in Singleton)
Volatile variables make sure the values of the variable are not cached, and reads and writes will be in main memory.

#### 2.  how to create a new thread(Please also consider Thread Pool case)?
Using runnable interface.
Using the thread class.

#### 3.  Difference between Runnable and Callable
Runnable doesn't throw exceptions, whereas callable throws exceptions.
Runnable doesn't accept parameters or return values, whereas callable does.

#### 4.  what is the diff between t.start() and t.run()?
t.start() creates a new thread and put the task into it.
t.run() put the task in current thread.

#### 5.  Which way of creating threads is better: Thread class or Runnable interface?
Runnable is better when you want to extend other classes. Thread is better when you don't need to extend other class.

#### 6.  what is the thread status?
New, runnable, blocked, waiting, timed_waiting, terminated.

#### 7. difference between wait() and sleep() method
Wait() releases the lock by notifyAll() but sleep() doesn't release the lock while waiting.

#### 8.  What is deadlock?
It's a situation where two or more threads are blocked forever.

#### 9.  how do threads communicate with each other?
Through commonly shared data.
Thread control method.
Wait(), notify(), notifyAll().

#### 10. what is join() method?
This method creates and returns a string by concatenating all the elements in an array and separates them by commas.

#### 11. what is yield() method
Notify the scheduler to move current task to ready state and another task to running state.

#### 12. Explain thread pool
It's a software design pattern for achieving concureency of execution in a computer program.

#### 13. What is Executor Framework in Java, its different types and how to create these 
executors?
It's a class that helps execute classes concurently.
FixedThreadPool: ExecutorService pool = Executors.newFixedThreadPool(n);
SingleThreadExecutor: ExecutorService executor = Executors.newSingleThreadExecutor();
CachedThreadPool: ExecutorService executor = Executors.newCachedThreadPool();
ScheduledThreadPool: ExecutorService executor = new SingleScheduledThreadPool();

#### 14. Difference between shutdown() and shutdownNow() methods of executor
Shutdown() will allow the previous tasks to execute before terminate, but shutdownnow() will terminate all the tasks.

#### 15. What is Atomic classes? when do we use it?
Atomic classes provide a lock-free and thread-safe envirnment or programming on a single variable.
They are used when you update a single variable in thread-safe environment.

#### 16. What is the cocurrent collections?
It's a programming model for providing parallelism in applications. It includes BlokingQueue, ConcurrentMap, and ConcurrentNavigableMap.

#### 17.  what kind of locks you know?
ReentrantLock, ReentrantReadWriteLock, StampedLock.

#### 18. What is the difference between class lock and object lock?
Class level locks can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.
Object level locks can be used when non-static method or non-static block of the code to be accessed by only one thread. 

#### 19. What is future and completableFuture?
Future transferes single value using synchronous interface. CompletableFuture transferes single value using both synchronous and asynchronous interfaces.

#### 20. what is ThreadLocal?
ThreadLocal allows programmers to create variables that are accessible only to the thread that created them.

#### 21. Type the code by your self and try to understand it. (package 
com.chuwa.tutorial.t08_multithreading)


#### 22. Read those interview questions and pick some important questions to this home 
work.


#### 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 
2,4,6,8,10. (solution is in 
com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)

a. One solution use synchronized and wait notify
b. One solution use ReentrantLock and await, signal

#### 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread 
output 21-22. threads run sequence is random. (solution is in 
com.chuwa.exercise.t08_multithreading.PrintNumber1)
