package com.icecream;

import com.icecream.IceCream;

public class ChocolateIceCream implements IceCream {

	private final String ingredient;
	private String toppings;

	public ChocolateIceCream() {
		ingredient = "heavy whipping cream, sweetened condensed milk, unsweetened cocoa powder and vanilla extract";
	}

	@Override
	public void prepare() {
		System.out.println("Chocolate Ice Cream is prepared with following ingredient: " + ingredient
				+ (this.toppings != null && !this.toppings.isEmpty() ? (" and with toppings " + this.toppings)
						: " and without toppings"));

	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

}
