### Question 1: Explain volatile variables in java? (we also use it in Singleton
```
volatile is everytime one a thread change a variable, other thread can see the change immediately
```

### Question 2: how to create a new thread(Please also consider Thread Pool case)?
```
// method 1: overwrite the run method of thread
public Thread t = new MyThread();
t.start();
class MyThread extends Thread {
    @Override
    public void run() {
    }
}

// method 2: pass a runnable instance
Thread t = new Thread(new MyRunnable());
t.start();

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start)
    }
}


// method 3: using lambda
Thread t = new Thread(() -> {
    int a = 1;
});
t.start();
```


### Question 3: Difference between Runnable and Callable
```
callable is an interface that can be implemented to return a value. Runnable can not.
callablee is a generic interface.
```

### Question 4: what is the diff between t.start() and t.run()
```
t.start() will start the new thread. t.run will not create a new t thread, it will only run the method in the calling thread.
```

### Question 5: Which way of creating threads is better: Thread class or Runnable interface
```
if we are extending thread, we can not inherit other class. so runnable is preferred.
```

### Question 6: Which way of creating threads is better: Thread class or Runnable interface
```
if we are extending thread, we can not inherit other class. so runnable is preferred.
```

### Question 7: what is the thread status?
```
it can be blocked, ready, run, terminated, new, waiting
```

### Question 8:  What is deadlock?
```
two threads waiting for each other to get different locks that held by both of them
```

### Question 9:  how do threads communicate with each other?
```
use shared variable. 
```

### Question 10:  what is join() method??
```
wait for the called thread to be finished, and the calling thread then finish its remaning code.
```

### Question 11:  what is yield() method?
```
yield will give the cpu resources to other threads, but the current thread can also try to take the given resources
```

### Question 12:  Explain thread pool?
```
it represents a worker threads (fixed size) wait and do the jobs.
```

### Question 13:  What is Executor Framework in Java, its different types and how to create these
### executors??
```
newFixedThreadPool(int s): The method creates a thread pool of the fixed size s.
newCachedThreadPool(): The method creates a new thread pool that creates the new threads when needed but will still use the previously created thread whenever they are available to use.
newSingleThreadExecutor(): The method creates a new thread.
```

### Question 14:  Difference between shutdown() and shutdownNow() methods of executor?
```
shutdown() allows previously submitted task to finish before terminated
shutdownnow() will terminate right away
```

### Question 15:  What is Atomic classes? when do we use it?
```
atomic have subclasses that do not require lock. 
```

### Question 16:  What is the cocurrent collections?
```
it is a thread-safe collection of java
```

### Question 17:  Wwhat kind of locks you know?
```
syncrhonized, reantranlock, read and write lock
```

### Question 18:  What is the difference between class lock and object lock?
```
if a thread want to execuate a static synchronized method, it will ned class lock.
```

### Question 19:  What is future and completableFuture?
```
future is a type that specifies the returned type of a thread after executing a task.
completefuture can pass callback, we can pass callback to future, we can use thenaccept and exceptionally to process work and not working scenarios
```

### Question 20:  what is ThreadLocal?
```
user can create local thread variables to ensure thread-safe
```