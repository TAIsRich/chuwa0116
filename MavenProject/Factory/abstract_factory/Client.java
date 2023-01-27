package com.itheima.pattern.factory.abstract_factory;
public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();

        AmericanDessertFactory factory2 = new AmericanDessertFactory();
        Coffee coffee2 = factory2.createCoffee();
        Dessert dessert2 = factory2.createDessert();
        System.out.println(coffee2.getName());
        dessert2.show();

    }
}
