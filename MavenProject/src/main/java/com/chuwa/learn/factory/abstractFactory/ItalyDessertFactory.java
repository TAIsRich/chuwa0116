package com.chuwa.learn.factory.abstractFactory;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 18:51
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}