1.  Explain volatile variables in java? (we also use it in Singleton)

        Volatile variables have the visibility features of synchronized but not the atomicity features. The values of the volatile variable will never be cached and all writes and reads will be done to and from the main memory.
2.  how to create a new thread(Please also consider Thread Pool case)?

        ref: https://jenkov.com/tutorials/java-concurrency/creating-and-starting-threads.html and slides 23
        The first way to specify what code a thread is to run, is to create a subclass of Thread and override the run() method. The run() method is what is executed by the thread after you call start(). Here is an example of creating a Java Thread subclass:
        ```
        public class MyThread extends Thread {

                public void run(){
                        System.out.println("MyThread running");
                }
        }
        ```
        To create and start the above thread you can do like this:
        ```
        MyThread myThread = new MyThread();
        myTread.start();
        ```

        when we consider thread poll:
        ```
        // 创建固定⼤⼩的线程池:
        ExecutorService executor = Executors.newFixedThreadPool(4);
        // 提交任务:
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
        executor.submit(task4);
        executor.submit(task5);
        ```
3.  Difference between Runnable and Callable

        runnable does not return things(void method), but you should return value/object when using callable
4.  what is the diff between t.start() and t.run()?

        When a program calls the start() method, a new thread is created and then the run() method is executed.
        But if we directly call the run() method then no new thread will be created and run() method will be executed as a normal method call on the current calling thread itself and no multi-threading will take place.
5.  Which way of creating threads is better: Thread class or Runnable interface?

        It is preferred to implement a Runnable interface instead of extending Thread class. As implementing Runnable makes your code loosely coupled as the code of thread is different from the class that assign job to the thread. It requires less memory and also allows a class to inherit any other class.
6.  what is the thread status?

        A thread is considered to be in the blocked state when it is suspended, sleeping, or waiting for some time in order to satisfy some condition.
7. difference between wait() and sleep() method

        The major difference is that wait() releases the lock while sleep() doesn't release any lock while waiting. wait() is used for inter-thread communication while sleep() is used to introduce a pause on execution, generally.
8.  What is deadlock?

        Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.
9.  how do threads communicate with each other?

        All the threads in the same program share the same memory space. If an object is accessible to various threads then these threads share access to that object's data member and thus communicate each other. The second way for threads to communicate is by using thread control methods.
10. what is join() method?

        Join method in Java allows one thread to wait until another thread completes its execution. In simpler words, it means it waits for the other thread to die. It has a void type and throws InterruptedException.
11. what is yield() method?

        The yield() method is used in Java to hint the task scheduler to move the currently executing task to the Ready state and move another task or thread to the running state. 
12. Explain thread pool

        Java Thread pool represents a group of worker threads that are waiting for the job and reused many times. In the case of a thread pool, a group of fixed-size threads is created. A thread from the thread pool is pulled out and assigned a job by the service provider.
13. What is Executor Framework in Java, its different types and how to create these executors?

        Java executor framework (java.util.concurrent.Executor), released with the JDK 5 is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads. 
        The java.util.concurrent.Executors provide factory methods that are being used to create ThreadPools of worker threads. Thread pools overcome this issue by keeping the threads alive and reusing the threads. Any excess tasks flowing in that the threads in the pool can handle are held in a Queue. 
        --SingleThreadExecutor
        --FixedThreadPool(n)+
        --CachedThreadPool
        --ScheduledExecutor
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService fixedPool = Executors.newFixedThreadPool(2);
        ExecutorService executorService = Executors.newCachedThreadPool();
        ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);

14. Difference between shutdown() and shutdownNow() methods of executor

        Two different methods are provided for shutting down an ExecutorService. 
        The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

15. What is Atomic classes? when do we use it?

        The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable. The method works the same as read and writes on volatile variables.

16. What is the cocurrent collections?

        The concurrent collection APIs, apart from the Java Collection API, are a set of collections APIs that are designed and optimized specifically for synchronized multithreaded access. They are grouped under the java. util. concurrent package
17.  what kind of locks you know?
        ```
        synchronized, ReentrantLock, ReadWriteLock, StampedLock
        ```
18. What is the difference between class lock and object lock?

        Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread. Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.
        Class level lock: Every class in Java has a unique lock which is nothing but a class level lock. If a thread wants to execute a static synchronized method, then the thread requires a class level lock. Once a thread got the class level lock, then it is allowed to execute any static synchronized method of that class. Once method execution completes automatically thread releases the lock. Let’s look at the below program for better understanding:

        Object-level lock: Every object in java has a unique lock. Whenever we are using a synchronized keyword, then only the lock concept will come into the picture. If a thread wants to execute then synchronized method on the given object. First, it has to get a lock-in that object. Once the thread got the lock then it is allowed to execute any synchronized method on that object. Once method execution completes automatically thread releases the lock. Acquiring and release lock internally is taken care of by JVM and the programmer is not responsible for these activities. Let’s have a look at the below program to understand the object level lock:
19. What is future and completableFuture?

        Future transferes single value using synchronous interface. CompletableFuture transferes single value using both synchronous and asynchronous interfaces.
        The main advantage of using CompletableFuture over Future is we can do the operations without blocking the thread to wait for a result. Remember: There is no support for Callable when using CompletableFutrure. Only two methods available runAsync and supplyAsync.
20. what is ThreadLocal?

        The ThreadLocal class in Java allows programmers to create variables that are accessible only to the thread that created them. This is useful for creating thread-safe code, as it ensures that each thread has its own copy of a variable and can not interfere with other threads.
21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)

        Please see codes in Coding/coding6/t08_multithreading
22. Read following two interview questions and pick some important questions to this home work.

        Please see codes in Coding/coding6/exercise/printNumber1 and multithreading/OddEventPrinter