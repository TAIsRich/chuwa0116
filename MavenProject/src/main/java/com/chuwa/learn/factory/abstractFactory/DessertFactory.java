package com.chuwa.learn.factory.abstractFactory;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 18:50
 */
public interface DessertFactory {
    //生产咖啡
    Coffee createCoffee();

    //生产甜品
    Dessert createDessert();
}