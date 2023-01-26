package org.example.factory.abstractFactory;

public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Dessert orderDessert() {
        return new MatchaMouse();
    }

    @Override
    public Coffee orderCoffee() {
        return new AmericanCoffee();
    }
}
