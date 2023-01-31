####Explain volatile variables in java? (we also use it in Singleton)     
Volatile is a keyword in Java, that can be applied only to variables. You cannot apply volatile keyword to classes and methods. Applying volatile to a shared variable that is accessed in a multi-threaded environment ensures that threads will read this variable from the main memory instead of their own local cache.    

####how to create a new thread(Please also consider Thread Pool case)?   
1. By Extending Thread class -- Thread.java:   
```   
package com.multithreading.demo

class Task extends Thread {
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + " is running");
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++){
			Task task = new Task();
			task.setName("Thread " + i);
			task.start();
		}
	}
}
```
Here a Task class extends Thread class and overrides the run() method which contains the business logic, then we make an object of this Task and call the start() method, which starts the thread execution. start() method internally calls run() method.     

2. By implementing Runnable interface -- ThreadTest.java:   
``` 
package com.multithreading.demo;

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}
}

public class ThreadTest {
	public static void main(String[] args){
		for(int i = 1; i <= 5; i++){
			Thread task = new Thread(new Task());
			task.setName("Thread " + i);
			task.start();
		}
	}
}
```
If you see the outputs of this and previous program, you will see that they are different, because any thread can get a chance to execute its run() method, when the CPU resources are available.   

####Difference between Runnable and Callable?     
Runnable tasks can be execuated by using Thread class or ExecutorService interface whereas Callable tasks can be executed by using ExecutorService interface only   
Return type of Runnable's run() method is void whereas Callable's call() method returns Future object    
Runnable's run() method does not throw checked exceptions whereas Callable's call() method can throw checked exceptions   

####what is the diff between t.start() and t.run()?     
When a program callls the start() method, a new thread is created and then the run() method is executed. But if we directly call the run() method then no new thread will be created and run() method will be executed as a normal method call on the current calling thread itself and no multi-threading will take place.   
start() creates a new thread and the run() method is executed on the newly created thread whereas no new thread is created and the run() method is executed on the calling thread itself.    
start() can't be invoked more than onr time otherwise throws java.lang.IllegalStateException, whereas multiple invocation is possible for run().      
start() is defined in java.lang.Thread class, whereas run() is defined in java.lang.Runnable interface and must be overridden in the implementing class.       
####Which way of creating threads is better: Thread class or Runnable interface?     
Implementing Runnable is always the preferred choice. As you known, Java does not allow multiple inheritance through classes, so if you are creating threads by extending Thread class then you will not be able to extend any other class.    
When we are working with multi-threading, we are not looking to overwrite any existing functionality of Thread class, we just want to execute the code with multiple threads, so in that way also, Runnable is a good choice.   
One more reason to choose Runnable is that, most people don't work with just Raw Threads, they use the Executor framework that is provided from Java 5, that separates the task from its execution and we can execute Runnables using execute method of Executor interface.     

####what is the thread status?    
A thread state can be in one of the following states:    
1. New: A thread that has not yet started is in this state.   
2. RUNNABLE: A thread executing in the Java virtual machine is in this state.     
3. BLOCKED: A thread that is blocked waiting for a monitior lock is in this state.    
4. WAITING: A thread that is waiting for another thread to perform a particular action is in this state.    
5. TIMED_WAITING: A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.   
6. TERMINATED: A thread that has exited is in this state.   

####Difference between wait() and sleep() method?     
The differences are:    
1. wait() method can only be called from a synchronized context while sleep() method can be called without sychronized context.   
2. wait() method releases the lock on the object while waiting but sleep() method does not release the lock it holds while waiting, it means if the thread is currently in a synchronized block/method then no other thread can enter this block/method.   
3. wait() method is used for inter-thread communication while sleep() method is used to introduce a pause on execution.    
4. waiting thread can be waked by calling notify() or notifyAll(), while sleeping thread will wake up when the specified sleep time is over or the sleeping thread gets interrupted.    
5. wait() method is non-static, it gets called on an object on which synchronization block is locked while sleep() is a static method, we call this method like Thread.sleep(), that means it always affects the currently executing thread.   
6. wait() is normally called when a condition is fulfilled like if the buffer size of queue is full then producer thread will wait, whereas sleep() method can be called without a condition.   


####What is deadlock?    
A deadlock is a situation where each of the computer process waits for a resource which is being assigned to some another process. In this situation, none of the process gets executed since the resource it needs, is held by some other process which is also waiting for some other resource to be released.    

####how do threads communicate with each other?       
All the threads in the same program share the same memory space. If an object is accessible to various threads then these threads share access share access to that object's data member and thus communicate each other. The second way for threads to communicate is by using thread control methods.    

####what is join() method?    
join() method causes the current thread to pause execution until the thread which has called join() method is dead.    

####what is yield() method?    
yield() method pauses the currently executing thread temporarily for giving a chance to the remaining waiting threads of the same priority to execute. If there is no waiting thread or all the waiting threads have a lower priority then the same thread will continue its execution.   

####Explain thread pool     
In computer programming, a thread pool is a software design pattern for achieving concurrency of execution in a computer program. Often also called a replicated workers or worker-crew model, a thread pool maintains multiple thread waiting tasks to be allocated for concurrent execution by the supervising program.    

####What is Executor Framework in Java, its different types and how to create these executors?    
Executor Framework is an abstraction to managing multiple threads by yourself. So, it decouples the execution of a task and the actual task itself. Now, we just have to focus on the task that means, only implement the Runnables and submit them to executor. Then these runnables will be managed  by the executor framework. It is available from Java 1.5 onwards.   

Also, we don't have to create new threads every time. With executor framework, we use Thread pools. Thinke of Thread Pool as a user-defined number of threads which are called worker threads, these are kept alive and reused. The tasks that are submitted to the executor will be executed by these worker threads. If there are more tasks than the threads in the pool, they can be added in a Queue ans as soon as one of threads is finished with a task, it can pick the next one from this Queue or else, it will be added back in the pool waiting for a task to be assigned.   

So, it saves the overhead of creating a new thread for each task. If you are thinking about what is the problem with creating a new thread every time we want to execute a task, then you should know that creating a thread is an expensive operation. Thread objects use a significant amount of memory, and in a large-scale application, allocating and deallocating many thread objects creates a significant memory management overhead and new threads without any throttling will lead to the creation of large number of threads. These threads will cause wastage of resources.  

There are 2 main interfaces that you must know, one is Executor and the other is ExecutorService.     

Executor interface contains execute(Runnable task) method through which you can execute only Runnables. Also, the return type of execute() method is void, since you are passing a Runnable to it and it does not return any result back.    

ExecutorService interface contains the submit() method which can take both Runnable and Callable, and its return type is Future object. ExecutorService extends the Executor Interface, so it also has the execute() method.    

let’s look at different types of Executors:    

SingleThreadExecutor:    
This executor has only one thread and is used to execute tasks in a sequential manner. If the thread dies due to an exception while executing the task, a new thread is created to replace the old thread and the subsequent tasks are executed in the new thread.    
How to create a SingleThreadExecutor: ExecutorService executor = Executors.newSingleThreadExecutor ();    

FixedThreadPoolExecutor:      
As its name suggests, this is an executor with a fixed number of threads. The tasks submitted to this executor are executed by the specified number of threads and if there are more tasks than the number of threads, then those tasks will be added in a queue (e.g. LinkedBlockingQueue).
How to create a FixedThreadPoolExecutor: ExecutorService executor = Executors.newFixedThreadPool (5);      
Here, we have created a thread pool executor of 5 threads, that means at any given time, 5 tasks can be managed by this executor. If there are more active tasks, they will be added to a queue until one of the 5 threads becomes free.   
CachedThreadPoolExecutor: 
This executor is mainly used when there are many short- lived tasks to be executed. If you compare this with the fixed thread pool, here the number of threads of this executor pool is not bounded. If all the threads are busy executing the assigned tasks and if there is a new task, then a new thread will be created and added to the pool. If a thread remains idle for close to sixty seconds, it is terminated and removed from the cache. Use this one, if you are sure that the tasks will be short- lived, otherwise there will be a lot of threads in the pool which will lead to performance issues. How to create a CachedThreadPoolExecutor: ExecutorService executor = Executors.newCachedThreadPool ();     

ScheduledExecutor:         
Use this executor, when you want to schedule your tasks, like run them at regular intervals or run them after a given delay. There are 2 methods which are used for scheduling tasks: scheduleAtFixedRate and scheduleWithFixedDelay.
How to create ScheduledExecutor: ExecutorService executor = Executors.newScheduledThreadPool (4);
ScheduledExecutorService interface extends the ExecutorService interface.   

####Difference between shutdown() and shutdownNow() methods of executor:    
An executor will not shut down automatically even when there is no task to process. It will stay alive and wait for new work. It will keep the JVM running. When shutdown() method is called on an executor, then the executor will not accept new tasks and it will wait for the currently executing tasks to finish.   
When shutdownNow() is called, it tries to interrupt the running threads and shutdown the executor immediately. However, there is no guarantee that all the running threads will be stopped at the same time.   
One good way to shutdown an executor is to use both of these methods along with awaitTermination(). With this approach, the executor will stop accepting new tasks and waits up to the specified duration for all running tasks to be completed. If the time expires, it will shutdown immediately.    

####What is Atomic classes? when do we use it?   
The The java.util.concurrent.atomic package defines classes that support atomic operations on single variables. All classes have get and set methods that work like reads and writes on volatile variables. That is, a set call has a happens-before relationship with any subsequent get call on the same variable.    

####What is the cocurrent collections?   
The concurrent collection APIs of Java provide a range of classes that are specifically designed to deal with concurrent operations. These classes are alternaives to the Java Collection Framework and provide similar functionality except with the additional support of concurrency.     

####what kind of locks you know?     
ReentrantLock    

####What is the difference between class lock and object lock?      
Object level locks - It can be used when you want non-static method or non-static block of the code should be accessed by only one thread.    
Class level locks - It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime     
####What is future and completableFuture?     
A Future is used as a reference to the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation. CompletableFuture is an extension to Java's Future API.     

####what is ThreadLocal?    
The ThreadLocal class in Java allows programmers to create variables that are accessible only to the thread that created them. This is useful for creating thread-safe code, as it ensures that each thread has its own copy of a variable and can not interfere with other threads.   



















