**1.Explain volatile variables in java? (we also use it in Singleton)c**
+ volatile 使得修改值⽴即更新到主程序
+ make the update immediately notify the main process

**2.how to create a new thread(Please also consider Thread Pool case)?**

There are three methods to create:
+ extend Threads class
+ implement runnable
+ implement callable

**3.Difference between Runnable and Callable**
+ Callable have return value but runnable return void

**4.what is the diff between t.start() and t.run()?**
+ t.start() will create a new thread and then run
+ t.run() will run in current thread

**5. Which way of creating threads is better: Thread class or Runnable interface?**
+ Runnable interface because we can use lambda to simplify the code.

**6.  what is the thread status?**
+ new 
+ runnable: ready and running
+ blocked
+ waiting
+ timed_waiting
+ terminated

**7. difference between wait() and sleep() method**
+ wait() : the current thread to wait and go to sleep until some other threads call the notify () or notifyAll() method for the object’s monitor (lock)
+ sleep() : is a static method that pauses or stops the execution of the current thread for some specified period.

**8. What is deadlock?**
+ two thread need same resources, each thread take part of resource and wait for each other give them the rest resource. So this is a deadlock.

**9.how do threads communicate with each other?**
+ Threads can communicate using three methods like, wait(), notify(), and notifyAll().

**10. what is join() method?**
+ threadA.join() means stop current thread and wait until threadA finished.

**11. what is yield() method**
+ move the currently executing task to the Ready state and move another task or thread to the running state.

**12.Explain thread pool**
+ A Thread pool is simply a collection of worker threads at the start-up that 
can be used to execute tasks and put back in the pool when completed.
  
**13.What is Executor Framework in Java, its different types and how to create these
executors?**
+ The Executor Framework contains a bunch of components that are used to efficiently manage multiple threads. 
ExecutorService and the class ThreadPoolExecutor.
```java
    ExecutorService es = Executors.newFixedThreadPool(4);
```

**14.Difference between shutdown() and shutdownNow() methods of executor**
+ The shutdown() method will allow previously submitted tasks to execute before terminating,
while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

**15. What is Atomic classes? when do we use it?**
+ It is thread safety parameter type.
+  AtomicBoolean：以原⼦更新的⽅式更新boolean； AtomicInteger：以原⼦更新的⽅式更新Integer; AtomicLong：以原⼦更新的⽅式更新Long；
   
**16. What is the cocurrent collections?**
+ It is thread safe collection
```
    INTERFACE          NON-THREAD-SAFE              THREAD-SAFE
    List               ArrayList                    CopyOnWriteArrayList
    Map                HashMap                      ConcurrentHashMap
    Set                HashSet / TreeSet            CopyOnWriteArraySet
    Queue              ArrayDeque / LinkedList      ArrayBlockingQueue / LinkedBlockingQueue
    Deque              ArrayDeque / LinkedList      LinkedBlockingDeque
```

**17. what kind of locks you know?**
+ ReentrantLock
+ ReadWriteLock
+ StampedLock

**18. What is the difference between class lock and object lock?**
+ Class Lock: In java, each and every class has a unique lock usually referred to as a class level lock. 
These locks are achieved using the keyword ‘static synchronized’ and can be used to make static data thread-safe. 
+ Object Lock: In java, each and every object has a unique lock usually referred to as an object-level lock. 
These locks are achieved using the keyword ‘synchronized’ and can be used to protect non-static data.

**19. What is future and completableFuture?**
+ future can help us get the result of thread to check by isdone() or get()
+ CompletableFuture can get exception and stop if the thread falid and no need to wait.

**20.what is ThreadLocal?**
+ These variables are only allowed to be read and written by the same thread. 

**21. Type the code by your self and try to understand it. (package
com.chuwa.tutorial.t08_multithreading)**
+ Coding in coding/multithrading

**23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print
    2,4,6,8,10.**
1. One solution use synchronized and wait notify
+ In multithreading/scr/waitnotify/OddEvenPrinter
2. One solution use ReentrantLock and await, signal
+ In multithreading/scr/waitnotify/ReentranlockOddEvenPrinter

**24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread
output 21-22. threads run sequence is random.**
+ coding in coding/multithreading/scr/PrintNumber


