package com.chuwa.last_question;

import java.util.concurrent.locks.ReentrantLock;

public class Solution {
	public static void main(String[] args) throws InterruptedException {
    Runnable runnable = new Task();
	Thread[] threads = new Thread[3];
	for(int i=0;i<3;++i)
		threads[i] = new Thread(runnable);
    for(int i=0;i<3;++i){
		threads[i].start();
    }
	for(int i=0;i<3;++i)
		threads[i].join();
	}
	static class Task implements Runnable{
		private ReentrantLock reentrantLock = new ReentrantLock();
        private int currentNumber=1;
		@Override
		public void run() {
        reentrantLock.lock();
		try{
			for(int i=0;i<10;++i){
				if(currentNumber>22)break;
				System.out.println(Thread.currentThread().getName()+" prints the number: "+currentNumber++);}
		}finally {
			reentrantLock.unlock();
		}
		}
	}
}
