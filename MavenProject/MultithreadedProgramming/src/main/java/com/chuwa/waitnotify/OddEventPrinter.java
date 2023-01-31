package com.chuwa.waitnotify;

public class OddEventPrinter {
	private static final Object monitor = new Object();
	private static int value = 1;

	public static void main(String[] args) {
		PrintRunnable runnable = new PrintRunnable();
		new Thread(runnable).start();
		new Thread(runnable).start();
	}
   // The two threads will execute alternatively
	static class PrintRunnable implements Runnable {
		@Override
		public void run() {
			synchronized (monitor) {
				while (value <= 10) {
					System.out.println(Thread.currentThread().getName() + " prints the number: " + value++);
					monitor.notify();
					try {
						if (value < 11) {
							monitor.wait();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
