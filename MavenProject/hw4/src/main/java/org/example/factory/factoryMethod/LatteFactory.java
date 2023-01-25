package org.example.factory.factoryMethod;

public class LatteFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
