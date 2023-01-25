package org.example.factory.abstractFactory;

public class CoffeeStore {
    public static void main(String[] args) {
        DessertFactory dessertFactory = new AmericanDessertFactory();
        dessertFactory.orderCoffee();
        dessertFactory.orderDessert();
    }
}
