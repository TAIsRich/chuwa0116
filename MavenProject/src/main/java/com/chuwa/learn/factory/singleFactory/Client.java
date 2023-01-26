package com.chuwa.learn.factory.singleFactory;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 18:58
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}