package com.chuwa.waitnotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OddEventPrinterSolutionB {
	private static final Object monitor = new Object();
	private static int value = 1;

	public static void main(String[] args) {
		OddEventPrinter.PrintRunnable runnable = new OddEventPrinter.PrintRunnable();
		new Thread(runnable).start();
		new Thread(runnable).start();
	}
	// The two threads will execute alternatively
	static class PrintRunnable implements Runnable {
		private ReentrantLock reentrantLock = new ReentrantLock();
		private Condition condition = reentrantLock.newCondition();
		@Override
		public void run() {
			reentrantLock.lock();
			try {
				while (value <= 10) {
					System.out.println(Thread.currentThread().getName() + " prints the number: " + value++);
					condition.notify();
					try {
						if (value < 11) {
							condition.await();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}finally {
				reentrantLock.unlock();
			}
		}
	}
}
