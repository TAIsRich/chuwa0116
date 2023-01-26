package com.chuwa.factory.abstractfactory;

import com.chuwa.factory.AmericanCoffee;
import com.chuwa.factory.AmericanDessert;
import com.chuwa.factory.Coffee;
import com.chuwa.factory.Dessert;

public class AmericanFoodFactory extends FoodFactory{
	@Override
	public Coffee getCoffee() {
		return new AmericanCoffee();
	}

	@Override
	public Dessert getDessert() {
		return new AmericanDessert();
	}
}
