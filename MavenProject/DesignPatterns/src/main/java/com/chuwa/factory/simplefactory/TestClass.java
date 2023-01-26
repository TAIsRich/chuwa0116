package com.chuwa.factory.simplefactory;

public class TestClass {
	public static void main(String[] args) {
		SimpleFoodFactory simpleFoodFactory = new SimpleFoodFactory();
		System.out.println(simpleFoodFactory.getCoffee("American"));
		System.out.println(simpleFoodFactory.getDessert("American"));
		System.out.println(simpleFoodFactory.getCoffee("Latte"));
		System.out.println(simpleFoodFactory.getDessert("Latte"));
	}
}
