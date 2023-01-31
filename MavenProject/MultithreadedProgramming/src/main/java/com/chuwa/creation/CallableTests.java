package com.chuwa.creation;

import java.util.concurrent.Callable;

public class CallableTests {
	public static void main(String[] args) {
		final int n = 10;
		Callable<Integer> sumTask = new Callable<Integer>() {
			@Override
			public Integer call() {
				int sum = 0;
				for (int i = 1; i <= n; i++) {
					sum += i;
				}
				return sum;
			}
		};
		try {
			Integer call = sumTask.call();
			System.out.println(call);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
