package com.icecream;

import java.util.Scanner;

public class IceCreamClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter your choice of ice cream");
		System.out.println("1-vanilla, 2- strawberry, 3- chocolate, 4- exit");
		Scanner scanner = new Scanner(System.in);
		String type = scanner.nextLine();
		System.out.println("\n Enter your choice of toppings");
		String topping = scanner.nextLine();

		IceCream iceCream = null;
		while(!type.equalsIgnoreCase("4")) {
			iceCream = IceCreamFactory.getInstance(type);
			iceCream.setToppings(topping);
			iceCream.prepare();
			
			System.out.println("\n Enter your choice of ice cream again");
			type = scanner.nextLine();
			if(!type.equalsIgnoreCase("4") ) {
				System.out.println("\n Enter your choice of toppings again");
				topping = scanner.nextLine();
			}
		}
		System.out.println("\nThank You ");

	}

}
