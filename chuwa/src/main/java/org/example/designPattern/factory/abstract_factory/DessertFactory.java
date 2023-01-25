package org.example.designPattern.factory.abstract_factory;

public interface DessertFactory {
    //生产咖啡
    Coffee createCoffee();

    //生产甜品
    Dessert createDessert();
}
