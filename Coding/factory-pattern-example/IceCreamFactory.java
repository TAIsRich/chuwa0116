package com.icecream;

public class IceCreamFactory {

	public static IceCream getInstance(String type) {

		switch (type) {

		case "1":
			return new VanillaIceCream();
		case "2":
			return new StrawberryIceCream();
		case "3":
			return new ChocolateIceCream();

		}
		return null;
	}
}
