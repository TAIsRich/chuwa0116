package com.chuwa.factory.abstractfactory;

import com.chuwa.factory.Coffee;
import com.chuwa.factory.Dessert;
import com.chuwa.factory.LatteCoffee;
import com.chuwa.factory.LatteDessert;

public class LatteFoodFactory extends FoodFactory{

	@Override
	public Coffee getCoffee() {
		return new LatteCoffee();
	}

	@Override
	public Dessert getDessert() {
		return new LatteDessert();
	}
}
