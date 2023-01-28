package com.chuwa.default_interface_method;

public interface MathInterface {
	String str = "Chuwa America";
	default void displayStr(){
		System.out.println(str);
	}
	int add(int num1,int num2);
}
