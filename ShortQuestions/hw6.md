## Explain volatile variables in java? (we also use it in Singleton)

In Java, a variable declared as volatile is guaranteed to be visible across all threads. When a variable is declared as volatile, the JVM and hardware are instructed to not apply any optimizations on this variable. It means that every read or write operation on a volatile variable will be applied directly on the main memory and not in any CPU cache. This ensures that all threads see the most up-to-date value of the volatile variable. It is typically used in situations where multiple threads may be accessing and modifying the same variable concurrently.

## how to create a new thread(Please also consider Thread Pool case)?

Extending the Thread class，Implementing the Runnable interface and Using the Executor framework(Thread Pool)

## Difference between Runnable and Callable

Callable has return value. Runnable does not have return value.

## what is the diff between t.start() and t.run()?

t.Start() will start a new thread while t.run() will not start ta new thread. 

## Which way of creating threads is better: Thread class or Runnable interface?

If you create a thread using the Runnable interface, you can reuse the same Runnable instance to create multiple threads. On the other hand, if you create a thread using the Thread class, you need to create a new instance of the Thread class for each thread you want to create.

## what is the thread status?

New: a thread has been created

Runnable: Able to run

Blocked: waiting for resources to be released

waiting: waiting for other thread to perform it's action

Terminated: a thread has been excuted

## difference between wait() and sleep() method

The wait() method can only be called from within a synchronized context, and it releases the lock on the object while the thread is waiting. On the other hand, the sleep() method does not require a synchronized context, and it does not release any locks.

A thread that is sleeping can be interrupted by another thread by calling the interrupt() method on the sleeping thread. A thread that is waiting, however, can only be notified to stop waiting by another thread calling notify() or notifyAll() on the object it is waiting on.

purpose: sleep() method is used for pausing the execution for a specific period of time and it's mostly used for time-based operations, whereas wait() method is used to release the lock on the object and wait for the notification from other threads. It's mostly used in multi-threading and synchronization.

## What is deadlock?

Two or more threads are waiting for each other and last forever.

## How do threads communicate with each other?

Shared variables, wait() and notify() and Executor Framework.

## what is join() method?

The join() method in Java is a method of the Thread class that allows one thread to wait for the completion of another thread. When a thread calls the join() method on another thread, the calling thread will block until the other thread completes its execution.

## what is yield() method

The yield() method in Java is a method of the Thread class that is used to temporarily pause the execution of the current thread and allow other threads of the same priority to execute. When a thread calls the yield() method, it voluntarily gives up its timeslice to other threads of the same priority that are ready to run. The thread can then be resumed by the scheduler at a later time.

## Explain thread pool

A thread pool is a collection of worker threads that are used to execute multiple tasks concurrently. It manages the creation, execution and termination of threads, and helps to improve the performance of applications by reducing the overhead of creating new threads for each task.

## What is Executor Framework in Java, its different types and how to create these  executors?

Executor Framework in Java is a framework for standardizing invocation of tasks, including the scheduling and execution of tasks. It provides the Executor, ExecutorService, and ScheduledExecutorService interfaces. Different types of executors include newCachedThreadPool, newFixedThreadPool, and newSingleThreadExecutor. To create these executors, use the Executors factory class.

## Difference between shutdown() and shutdownNow() methods of executor

The shutdown() method of Executor initiates a graceful shutdown, allowing currently executing tasks to complete, but not accepting new tasks. The shutdownNow() method attempts to stop all actively executing tasks and returns a list of tasks that were submitted but never started.

## What is Atomic classes? when do we use it?

Atomic classes are classes in Java that provide atomic operations, meaning they are executed in a single, uninterruptible operation. Examples include AtomicInteger, AtomicLong, and AtomicBoolean. They are used in multithreading to ensure that operations on shared variables are performed atomically and without interference from other threads.

## What is the cocurrent collections? 

Concurrent collections are collections in Java that are designed to be used in a concurrent environment, such as in a multithreaded application. Examples include ConcurrentHashMap, ConcurrentLinkedQueue, and CopyOnWriteArrayList. They provide thread-safe access to their elements and are optimized for concurrent access.

## what kind of locks you know? 

Different types of locks include:

- Reentrant locks: locks that can be acquired multiple times by the same thread
- Read-write locks: locks that allow multiple readers to acquire the lock simultaneously, but only one writer
- Stamped locks: locks that provide a more fine-grained control over read and write operations

## What is the difference between class lock and object lock?

A class lock is a lock that is associated with a class, while an object lock is a lock that is associated with an object. A class lock is acquired by a thread when it is trying to access a static method or variable, while an object lock is acquired when a thread is trying to access an instance method or variable.

##  What is future and completableFuture?

Future and CompletableFuture are classes in Java that represent the result of an asynchronous computation. A Future represents the result of a computation that may not have completed yet, while a CompletableFuture extends Future and provides additional methods for composing and combining asynchronous computations.

## what is ThreadLocal?

ThreadLocal is a class in Java that provides thread-local variables. These are variables that are specific to the current thread and are not shared between threads. They can be used to store thread-specific data, such as a transaction or security context.