package org.example.pattern.factory.before;

public class Client {
    public static void main(String[] args) {
        //1. 创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        //2. 点咖啡
        Coffee coffee = store.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
