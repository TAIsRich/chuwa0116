package com.chuwa.singleton.lazy;

public class Singleton {
	private Singleton(){

	}
	private static volatile Singleton singleton;
	public static Singleton getInstance(){
		if(null == singleton){
			synchronized (Singleton.class){
				if(null == singleton)singleton = new Singleton();
			}
		}
		return singleton;
	}

	public static void main(String[] args) throws Exception{
		Thread[] threads = new Thread[10000];
		for(int i=0;i<10000;++i){
			threads[i] = new Thread(()->{
				System.out.println(Singleton.getInstance().hashCode());
			});
			threads[i].start();
		}
		for(int i=0; i< 10000;++i){
			threads[i].join();
		}
	}
}
