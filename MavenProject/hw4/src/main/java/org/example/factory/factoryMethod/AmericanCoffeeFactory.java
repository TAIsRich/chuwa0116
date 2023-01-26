package org.example.factory.factoryMethod;

public class AmericanCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
