package com.chuwa.basic_thread_handling;

public class JoinTests {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread1 is now running!");
		});
		thread1.start();
		thread1.join();
		System.out.println("Main Ends");
	}
}
