##   Explain volatile variables in java? (we also use it in Singleton)  
if a variable is volatile, it means when it changes, it will notify other threads right away.
## how to create a new thread(Please also consider Thread Pool case)?  
* extend Threads
* implement Runnable
* implement Callable
* Using thread pool
## Difference between Runnable and Callable  
Callable can return value
## what is the diff between t.start() and t.run()?  
* run will excute in the same thread
* start will create a new thread and run it in this new thread
## Which way of creating threads is better: Thread class or Runnable interface? 
* Runnable is better. Runnable interface will use less memory and besides, we can extend other classes
## what is the thread status?
- New
- Runnable
- Blocked
- Waitting
- Timed Waiting
- Terminated
## difference between wait() and sleep() method
| wait | sleep |
| wait is used for inter-thread commnuication | sleep is used to introduce a pause on execution
## What is deadlock?
two or more threads are blocked due to different threads want resources already hold by other threads.
## How do threads communicate with each other?
All the threads in the same program share the same memory space. If an object is accessible to various threads then these threads share access to that object's data member and thus communicate each other.
## What is join() method?
wait for thread execution complete
## What is yeild() method?
A yield() method is a static method of Thread class and it can **stop the currently executing thread** and will give a chance to other waiting threads of the same priority.
## Explain thread pool.
It will have a worse performance if we often create new Threads. Using thread pool, we can recycle the finished Thread thus it will have a better performance.
## What is Executor Framework in Java, its different types and how to create these executors?
The Executor Framework contains a bunch of components that are used to efficiently manage multiple threads
## Difference between shutdown() and shutdownNow() methods of executor
## What is Atomic classes? when do we use it?
Atomic class provid a thread-safe environment to deal with variables.
## What is the cocurrent collections?
## what kind of locks you know?
- ReentrantLock
- ReadWriteLock
- StampedLock
## What is the difference between class lock and object lock
- Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread. 
- Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.
## What is future and completableFuture?
- Simply put, the Future class represents a future result of an asynchronous computation. This result will eventually appear in the Future after the processing is complete.
- CompletableFuture is a feature for asynchronous programming using Java. Unlike procedural programming, asynchronous programming is about writing a non-blocking code by running all the tasks on separate threads instead of the main application thread and keep notifying the main thread about the progress, completion status, or if the task fails.
## What is threadLocal ?
Java ThreadLocal is used to create thread local variables. We know that all threads of an Object share it’s variables, so the variable is not thread safe. We can use synchronization for thread safety but if we want to avoid synchronization, we can use ThreadLocal variables.
