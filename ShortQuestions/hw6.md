## 3. Difference between Runnable and Callable
| Runnable     | Callable |
| ----------- | ----------- |
| It cannot return the result of computation.| It can return the result of the parallel processing of a task.|
| It cannot throw a checked Exception.  | It cannot throw a checked Exception.  |
| In a runnable interface, one needs to override the run() method in Java. | In order to use Callable, you need to override the call()|

## 4. What is the diff between t.start() and t.run()?
| start()    | run() |
| ----------- | ----------- |
| Creates a new thread and the run() method is executed on the newly created thread.| No new thread is created and the run() method is executed on the calling thread itself. |
| No new thread is created and the run() method is executed on the calling thread itself.  | Multiple invocation is possible|
| Defined in java.lang.Thread class. |Defined in java.lang.Runnable interface and must be overridden in the implementing class.|

## 5. Which way of creating threads is better: Thread class or Runnable interface?
## 6. what is the thread status?
A thread is a path of execution in a program that goes through the following states of a thread. The five states are as follows:

- New
- Runnable
- Blocked
- Waiting
- Timed Waiting
- Terminated

![jO2Pw.jpeg](https://i.328888.xyz/2023/01/28/jO2Pw.jpeg)

## 7. difference between wait() and sleep() method
| wait()   | sleep()|
| ----------- | ----------- |
| Wait() method belongs to Object class. | Sleep() method belongs to Thread class.|
| Wait() is not a static method. | Sleep() is a static method|
| Wait() method releases lock during Synchronization. | Sleep() method does not release the lock on object during Synchronization. |
| Wait() should be called only from Synchronized context. | There is no need to call sleep() from Synchronized context.|


## 8. What is deadlock?
Deadlock in java is a programming situation where two or more threads are blocked forever. Java deadlock situation arises with at least two threads and two or more resources.

> Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object lock that is acquired by first thread. Since, both threads are waiting for each other to release the lock, the condition is called deadlock.

## 9. How do threads communicate with each other?
Thread communicate via shared memory.

All the threads in the same program share the same memory space. If an object is accessible to various threads then these threads share access to that object's data member and thus communicate each other. 

## 10. What is join() method?
Join method in Java allows one thread to wait until another thread completes its execution. In simpler words, it means it waits for the other thread to die.

When we invoke the join() method on a thread, the calling thread goes into a waiting state. It remains in a waiting state until the referenced thread terminates.


## 11. What is yeild() method?
A yield() method is a static method of Thread class and it can **stop the currently executing thread** and will give a chance to other waiting threads of the same priority. 

## 12. Explain thread pool.
Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.

In the case of a thread pool, a group of fixed-size threads is created. A thread from the thread pool is pulled out and assigned a job by the service provider. After completion of the job, the thread is contained in the thread pool again.

## 13. What is Executor Framework in Java, its different types and how to create these executors?


## 14. Difference between shutdown() and shutdownNow() methods of executor
- shutdown() will just tell the executor service that it can't accept new tasks, but the already submitted tasks continue to run

- shutdownNow() will do the same AND will **try to cancel** the already submitted tasks by interrupting the relevant threads. Note that if your tasks ignore the interruption, shutdownNow will behave exactly the same way as shutdown.

## 15. What is Atomic classes? when do we use it?
The atomic classes provide a **lock-free** and **thread-safe environment or programming** on a single variable

## 16. What is the cocurrent collections?
Concurrent collections in java are designed and optimized specifically for synchronized multithreaded access. These are the **thread safe collections**, and these are existing in **java.util.concurrent package**.

## 17. what kind of locks you know?

## 18. What is the difference between class lock and object lock
| Class Level Lock    | Object Level Lock |
| ----------- | ----------- |
| It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime| It can be used when you want non-static method or non-static block of the code should be accessed by only one thread|
| It should always be used to make static data thread safe.  | It should always be used to make non-static data thread safe.  |
| Multiple objects of class may exist but there is always one class’s class lock available | Every object the class may have their own lock|