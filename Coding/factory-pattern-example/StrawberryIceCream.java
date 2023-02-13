package com.icecream;

import com.icecream.IceCream;

public class StrawberryIceCream implements IceCream {

	private final String ingredient;
	private String toppings;

	public StrawberryIceCream() {
		ingredient = "milk, cream, chopped strawberries and sugar";
	}

	@Override
	public void prepare() {
		System.out.println("Strawberry Ice Cream is prepared with following ingredient: " + ingredient
				+ (this.toppings != null && !this.toppings.isEmpty() ? (" and with toppings " + this.toppings)
						: " and without toppings"));
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

}
