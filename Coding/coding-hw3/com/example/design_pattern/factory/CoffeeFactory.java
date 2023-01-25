package com.example.design_pattern.factory;

public class CoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if (type == "American") {
            coffee = new AmericanCoffee();
        } else if (type == "lattte") {
            coffee = new AmericanCoffee();
        }
        return coffee;
    }
}
