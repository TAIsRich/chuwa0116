package com.chuwa.creation;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
	@Override
	public String call() throws Exception {
		Thread.sleep(3000);
		return "Using callable to start";
	}
}
