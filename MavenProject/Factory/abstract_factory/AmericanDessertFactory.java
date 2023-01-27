package com.itheima.pattern.factory.abstract_factory;

public class AmericanDessertFactory implements DessertFactory {

    public AmericanCoffee createCoffee(){
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }

}
