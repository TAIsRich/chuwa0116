package com.chuwa.basic_thread_handling;

import org.junit.Test;

class InterruptTest {

	@Test
	//Will stop, because it could detect if it's interrupted now
	public void testIsInterrupted() throws InterruptedException {
		Thread t = new MyThreadWithIsInterrupted();
		execute(t);
	}

	@Test
	//Will not stop, because it does not detect the interrupt state
	public void testInterruptWhileTrue() throws InterruptedException {
		Thread t = new WhileTrue();
		execute(t);
	}

	@Test
	//Will not stop
	public void testInterruptSleep() throws InterruptedException {
		Thread t = new SleepForever();
		execute(t);
	}

	private void execute(Thread t) throws InterruptedException {
		t.start();
		Thread.sleep(2000);
		t.interrupt();
		t.join();
		System.out.println("end");
	}
}


class MyThreadWithIsInterrupted extends Thread {
	@Override
	public void run() {
		int n = 0;
		while (!isInterrupted()) {
			n++;
			System.out.println(n + " hello!");
		}
	}
}

class WhileTrue extends Thread {
	@Override
	public void run() {
		int n = 0;
		while (true) {
			n++;
			System.out.println(n + " hello!");
		}
	}
}


class SleepForever extends Thread {
	@Override
	public void run() {
		int n = 0;
		try {
			Thread.sleep(5000 * 1000);
		} catch (InterruptedException e) {
			System.out.println("t thread is interrupted");
			e.printStackTrace();
		}
	}
}
