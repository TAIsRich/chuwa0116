package com.chuwa.default_interface_method;

public class MathInterfaceTests {
	public static void main(String[] args) {
		MathInterface mathInterface = new MathInterfaceImpl();
		System.out.println(mathInterface.add(3, 5));
		mathInterface.displayStr();
	}
}
