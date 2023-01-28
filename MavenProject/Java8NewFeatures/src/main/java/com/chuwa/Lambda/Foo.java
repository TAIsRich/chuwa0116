package com.chuwa.Lambda;
@FunctionalInterface
public interface Foo {
	String aMethod(String str);
	default void printStr(String str){
		System.out.println(str);
	}
	default void welcomeMessage(){
		System.out.println("Welcome to Foo!");
	}
}
