package com.itheima.pattern.factory.abstract_factory;

public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();
}