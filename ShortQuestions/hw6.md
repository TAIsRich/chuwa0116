### 1. Explain volatile variables in java
* Volatile keyword is used to modify the value of a variable by different threads. It is also used to make classes thread safe. It means that multiple threads can use a method and instance of the classes at the same time without any problem.

### 2. How to create a new thread
* Extend Thread class
* Implement Runnable
* Implement Callable
* Creating ThreadPool and submit task

### 3. Difference between Runnable and Callable
* Runnable has no return value while callable has return vavlues

### 4. What is the difference between t.start() and t.run()
* t.start starts a new thread to run execute the task
* t.run executes the task in the current thread

### 5. Which way of creating threads is better: Thread class or Runnable interface?
Runnable interface is better since we will be benefiting from inheriting

### 6. What is Thread status
* Thread status is the various states that a Java thread can be in at any point during its life and which method calls cause a transition to another state.

### 7.Difference between wait() and sleep() method
* wait() releases the lock while sleep() does not

### 8. What is deadlock?
* Deadlock is a situation where a set of processes are blocked because each process is holding a resource and waiting for another resource acquired by some other process. 

### 9. how do threads communicate with each other?
* wait()
* notify()
* notifyAll()

### 10. What is join() method?
* Pauses main thread until the thread joined finishes

### 11. What is yield() method?
* It hints the task scheduler to move the currently executing task to the Ready state and move another task or thread to the running state

### 12. Explain thread pool
*
Java Thread pool represents a group of worker threads that are waiting for the job and reused many times

### 13. What is Executor Framework in Java, its different types and how to create these executors?
* Executor used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads
* FixedThreadPool,CachedThreadPool, SingleThreadExecutor

### 14. Difference between shutdown() and shutdownNow() methods of executor
* The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

### 15. What is Atomic classes? when do we use it?
* The atomic classes provide a lock-free and thread-safe environment or programming on a single variable
* Good for Counters, Accumulator

### 16. What is the concurrent collections?
* Concurrent collections, achieve thread-safety by dividing their data into segments

### 17. What kind of locks do you know?
* ReentrantLock
* ReadWriteLock
* StampedLock

### 18. What is the difference between class lock and object lock
* Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread. 
* Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.

### 19. What is future and completableFuture
* A Future represents the result of an asynchronous computation
* CompletableFuture is used for asynchronous programming in Java without blocking the code running.

### 20. What is ThreadLocal?
* The ThreadLocal class in Java allows programmers to create variables that are accessible only to the thread that created them.

### 22. Read interview questions, pick some important questions

* Basic Thread Handdling
```
t.join()
t.setDaemon(true)
Thread.sleep(1000)
t.interrupt()
```

* Executro Framework
The Executor requires implementing classes to define a method execute(Runnable runnable) which takes in an object of interface Runnable.