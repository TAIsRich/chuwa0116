package com.chuwa.learn.factory.abstractFactory;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 18:48
 */
public class Client{
    public static void main(String[] args){
        //  ItalyDessertFactory factory=new ItalyDessertFactory();
        AmericanDessertFactory factory=new AmericanDessertFactory();
        Coffee coffee=factory.createCoffee();
        Dessert dessert=factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
