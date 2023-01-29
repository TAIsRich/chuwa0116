package com.OddEven;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEventPrinter {
    private static final Object monitor=new Object();

    private static int value=1;

    public static void main(String [] args){
        PrintRunnable1 runnable=new PrintRunnable1();
        new Thread(runnable).start();
        new Thread(runnable).start();


        PrintRunnable2 runnable2=new PrintRunnable2();
        new Thread(runnable2).start();
        new Thread(runnable2).start();
    }




    static public class PrintRunnable1 implements Runnable{
        @Override
        public void run(){
            synchronized(monitor){
                while(value<=10){
                    System.out.println(Thread.currentThread().getName()+": "+value++);

                    monitor.notify();
                    try{
                        if(value<11)
                            monitor.wait();
                    } catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static public class PrintRunnable2 implements Runnable{
        private final Lock lock=new ReentrantLock();
        private final Condition condition=lock.newCondition();
        @Override
        public void run(){
            lock.lock();

            try{
                while(value<=10){
                    System.out.println(Thread.currentThread().getName()+": "+value++);
                    condition.signal();
                    try{
                        condition.await();
                    } catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            } finally{
                lock.unlock();
            }
        }
    }
    
}




