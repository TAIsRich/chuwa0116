package com.chuwa.learn.factory.abstractFactory;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 18:47
 */
public class AmericanDessertFactory implements DessertFactory{

    public AmericanCoffee createCoffee(){
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }

}
