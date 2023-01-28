package com.chuwa.factory.simplefactory;

import com.chuwa.factory.*;
import jdk.internal.util.xml.impl.Pair;

public class SimpleFoodFactory {
	public Coffee getCoffee(String type){
		switch (type){
			case "American":
				return new AmericanCoffee();
			case "Latte":
				return new LatteCoffee();
		}
		return null;
	}
	public Dessert getDessert(String type){
		switch (type){
			case "American":
				return new AmericanDessert();
			case "Latte":
				return new LatteDessert();
			Pair
		}
		return null;
	}
}
