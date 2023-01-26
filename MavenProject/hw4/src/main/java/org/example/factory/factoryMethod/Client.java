package org.example.factory.factoryMethod;

public class Client {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
       CoffeeStore coffeeStore = new CoffeeStore(coffeeFactory);
       Coffee coffee = coffeeStore.orderCoffee();
       System.out.println(coffee.getClass());
    }
}
