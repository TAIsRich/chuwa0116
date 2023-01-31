# Q1

The ```volatile``` keyword offers a lock-free mechanism for synchronizing access to an instance field. If we declare a field as ```volatile```, then the compiler and the virtual machine take into account that the field may be concurrently modified by another thread.

# Q2

# Q3

```Runnable``` has no return, ```Callable``` has return value.

# Q4

```t.start()``` creates a new thread to excute the task, ```t.run()``` excute the task in the current thread.

# Q5

Normally ```Runnable``` interface is a better choice.

# Q6

Thread Status are branch of states that a thread could be in, there are 6 different status in Java:

- NEW
- RUNNABLE
- BLOCKED
- WAITING
- TIMED WAITING
- TERMINATED

# Q7

```wait()``` method releases lock during Synchronization. ```sleep()``` method does not release the lock on object during Synchronization. 

# Q8

Deadlock is a condition where two or more threads are blocked forever, waiting for each other.

# Q9

# Q10

The ```join()``` method allows one thread to wait until another thread completes its execution.

# Q11

The ```yield()``` method of thread class causes the currently executing thread object to temporarily pause and allow other threads to execute.

# Q12

Thread pool represents a group of worker threads that are waiting for the job and reused many times. 

# Q13

The  Executor Framework in Java is used to create thread pool. There are 3 types of executor:

- ```FixedThreadPool```
- ```CachedThreadPool```
- ```SingleThreadExecutor```

# Q14

```shotdown()``` will wait until the last task has been done and then shut the thread pool done, ```shutdownNow()``` will shut the thread pool down immediately.

# Q15

The atomic classes provide a lock-free and thread-safe environment or programming on a single variable.

# Q16

The concurrent collections are branch of thread-safe collections that Java provides for us to use.

# Q17

```ReentrantLock()```, ```ReadWriteLock()``` and ```StampedLock()```.

# Q18

# Q19

# Q20

The ```ThreadLocal``` class is used to create thread local variables which can only be read and written by the same thread.

# Q23

```
public class OddEventPrinter {
//    private static final Object monitor = new Object();
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            lock.lock();
            while(value <= 10) {
                System.out.println(Thread.currentThread().getName() + ": " + value++);
                condition.signalAll();
                try {
                    if(value < 11) {
                        condition.await();
                    }
                } catch (IllegalMonitorStateException e) {
                    System.out.println("IllegalMonitorStateException");
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                    e.printStackTrace();
                }
            }
            lock.unlock();
//            synchronized (monitor) {
//                while (value <= 10) {
//                    System.out.println(Thread.currentThread().getName() + ": " + value++);
//                    monitor.notify();
//                    try {
//                        if (value < 11) {
//                            monitor.wait();
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
        }
    }
}
```

# Q24

```
public class PrintNumber1 {
    private static int n = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printNumber());
        Thread t2 = new Thread(() -> printNumber());
        Thread t3 = new Thread(() -> printNumber());

        t1.start();
        t2.start();
        t3.start();
    }

    private static synchronized void printNumber() {
        int count = 10;
        while (count-- > 0) {
            System.out.println(Thread.currentThread().getName() + ": " + n++);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        PrintNumber1.class.notifyAll();
    }
}
```
