package com.chuwa.factory.abstractfactory;

public class Test {
	public static void main(String[] args) {
		FoodFactory factory = new AmericanFoodFactory();
		FoodFactory factory1 = new LatteFoodFactory();
		System.out.println(factory.getCoffee());
		System.out.println(factory.getDessert());
		System.out.println(factory1.getCoffee());
		System.out.println(factory1.getDessert());
	}
}
