# HW6
### 1. Explain volatile variables in java? (we also use it in Singleton)
```
The Java volatile keyword is intended to address variable visibility problems. By declaring the counter variable volatile all writes to the counter variable will be written back to main memory immediately. Also, all reads of the counter variable will be read directly from main memory.
```

### 2. how to create a new thread(Please also consider Thread Pool case)?
```
extend the `Thread` class
implement the `Runnale` class and use it to initialize the `Thread` class using `new Thread(myRunnableObject)`
implement the `Callable` class
submit a task to the thread pool
```

### 3. Difference between Runnable and Callable
```
Callable has a return value, while Runnable has no return
```

### 4. what is the diff between t.start() and t.run()?
```
t.start() creates a new thread and the run() method is executed on the newly created thread.
t.run(): no new thread is created and the run() method is executed on the calling thread itself.
```

### 5. Which way of creating threads is better: Thread class or Runnable interface?
```
It is preferred to implement a Runnable interface instead of extending Thread class. As implementing Runnable makes your code loosely coupled as the code of thread is different from the class that assign job to the thread. It requires less memory and also allows a class to inherit any other class.
```

### 6. what is the thread status?
```
NEW - a thread object is created, but is not started yet.
RUNNABLE - includes ready and running states
BLOCKED - thread being blocked due the lock
WAITING - waits for others threads to send signals such as notify or interrupt
TIMED_WAITING - returns after a period of time
TERMINATED - current tread finished executing
```

### 7. difference between wait() and sleep() method
```
The major difference is that wait() releases the lock while sleep() doesn't release any lock while waiting. wait() is used for inter-thread communication while sleep() is used to introduce a pause on execution.
```

### 8. What is deadlock?
```
Deadlock in java is a programming situation where two or more threads are blocked forever. Java deadlock situation arises with at least two threads and two or more resources.
```

### 9. how do threads communicate with each other?
```
Under the context of synchronization, they use wait() and notify() to communication with each other;
Uder the context of ReentrantLock, they use condition.await(), condition.signal and condition.signalAll() to communication with each other
```

### 10. what is join() method?
```
A Join() is a synchronization method that blocks the calling thread until the thread whose Join method is called has completed. Use this method to ensure that a thread has been terminated. The caller will block indefinitely if the thread does not terminate
```

### 11. what is yield() method
```
A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority.
```

### 12. Explain thread pool
```
A thread pool is a collection of worker threads that efficiently execute asynchronous callbacks on behalf of the application. The thread pool is primarily used to reduce the number of application threads and provide management of the worker threads.
```

### 13. What is Executor Framework in Java, its different types and how to create these executors?
```
The Executor Framework that contains a bunch of components is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads.

SingleThreadExecutor - ExecutorService executor = Executors.newSingleThreadExecutor();
CachedThreadPool - ExecutorService executorService = Executors.newCachedThreadPool();
FixedThreadPool(n)+ - ExecutorService fixedPool = Executors.newFixedThreadPool(2);
ScheduledExecutor - ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);
```

### 14. Difference between shutdown() and shutdownNow() methods of executor
```
The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.
```

### 15. What is Atomic classes? when do we use it?
```
The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It also supports atomic operations.
The atomic variable allows us to perform an atomic operation on a variable. Atomic variables minimize synchronization and help avoid memory consistency errors.
```

### 16. What is the concurrent collections?
```
It's a thread-safe version of the collection implementation
```

### 17. what kind of locks you know?
```
ReentrantLock
ReadWriteLock
StampedLock
```

### 18. What is the difference between class lock and object lock?
```
Class lock: it can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.
Object lock: it can be used when you want non-static method or non-static block of the code should be accessed by only one thread.
```

### 19. What is future and completableFuture?
```
Future: a class that can get return result from the asynchronous tasks we just submitted
CompletableFuture: it can get exception and stop if the thread falid and no need to wait
```

### 20. what is ThreadLocal?
```
The ThreadLocal class in Java allows programmers to create variables that are accessible only to the thread that created them. This is useful for creating thread-safe code, as it ensures that each thread has its own copy of a variable and can not interfere with other threads
```

### 21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)
Please check Coding folder

### 22. Read those interview questions and pick some important questions to this home work.

### 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)

### 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)















