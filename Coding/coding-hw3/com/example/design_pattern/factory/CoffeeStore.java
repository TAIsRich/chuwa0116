package com.example.design_pattern.factory;

public class CoffeeStore {

    public void orderCoffee(String type) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(type);
        System.out.println(coffee.name());
    }
}
