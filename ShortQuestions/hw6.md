# HW6

## 1. Explain volatile variables in java? (we also use it in Singleton)

volatile means that the variable changes at runtime and that the compiler should not cache its value for any reason.

the volatile modifier guarantees that any thread that reads a field will see the most recently written value.

## 2. how to create a new thread(Please also consider Thread Pool case)?
without thread pool

`Thread t0 = new Thread(Runnable r);`

`t.start()`

with thread pool

`ExecutorService es = FixedThreadPool / CachedThreadPool / SingleThreadExecutor`

`es.submit(Runnable r)`

## 3. Difference between Runnable and Callable
Runnable cannot return and cannot throw exceptions

Callable can return and can throw an exception

## 4. what is the diff between t.start() and t.run()?
`t.start()` starts a new thread to execute the task (run())

`t.run()` excute the task in the current thread.

## 5. Which way of creating threads is better: Thread class or Runnable interface?
Runnable interface because it is a functional interface so you can use lambda.

## 6. what is the thread status?
blocked / running / waiting / terminated  

## 7. difference between wait() and sleep() method
wait() releases the lock while sleep() doesn't release any lock while waiting

## 8. What is deadlock?
A deadlock is a situation in which two computer programs sharing the same resource are effectively preventing each other from accessing the resource, resulting in both programs ceasing to function.

## 9. how do threads communicate with each other?
wait(), notify(), and notifyAll();

## 10. what is join() method?
Main thread call t.join(), Main thread will stop and wait for thread t complets its task, Main thread will continue after t finished its task

## 11. what is yield() method
The yield() method is used in Java to hint the task scheduler to move the currently executing task to the Ready state and move another task or thread to the running state. The task scheduler is free to ignore the hint.

## 12. Explain thread pool
A thread pool reuses previously created threads to execute current tasks and offers a solution to the problem of thread cycle overhead and resource thrashing.

## 13. What is Executor Framework in Java, its different types and how to create these executors?
The Executor Framework contains a bunch of components that are used to efficiently manage multiple threads. It was released with the JDK 5 which is used to run the Runnable objects without creating new threads every time and also mostly re-using the already created threads.
There are mainly 4 types of Executors available. They are namely:SingleThreadExecutor, FixedThreadPool , CachedThreadPool , ScheduledExecutor

## 14. Difference between shutdown() and shutdownNow() methods of executor
shutdown() will just tell the executor service that it can't accept new tasks, but the already submitted tasks continue to run

shutdownNow() will do the same AND will try to cancel the already submitted tasks by interrupting the relevant threads. Note that if your tasks ignore the interruption, shutdownNow will behave exactly the same way as shutdown.

## 15. What is Atomic classes? when do we use it?
The atomic classes provide a lock-free and thread-safe environment or programming on a single variable.
It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable. The method works the same as read and writes on volatile variables.

## 16. What is the concurrent collections?
Concurrent collections is a programming model for software frameworks to expose parallelism in applications.

## 17. what kind of locks you know?
ReentrantLock / ReadWriteLock / StampedLock

## 18. What is the difference between class lock and object lock?
Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread.

Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime. It should always be used to make static data thread safe.

## 19. What is future and completableFuture?
The submitter of the operation can use the Future object to check whether the operation isDone(), or wait for it to finish using the blocking get() method.

Using CompletableFutures, you can do something with the result of the operation without actually blocking a thread to wait for the result.

## 20. what is ThreadLocal?
The TheadLocal construct allows us to store data that will be accessible only by a specific thread.
ThreadLocal is a Java class that can be used to define variables accessible solely by the thread that created them.

## 21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)
Refer Code section

## 22. Read those interview questions and pick some important questions to this homework.

## 23.
refer Coding/hw6

## 24
refer Coding/hw6
## 

