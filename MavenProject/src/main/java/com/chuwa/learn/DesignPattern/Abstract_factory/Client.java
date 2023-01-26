package DesignPattern.Abstract_factory;

import DesignPattern.Abstract_factory.Coffee;

public class Client {
    public static void main(String[] args) {
        //创建的是意大利风味甜品工厂对象
        //ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory = new AmericanDessertFactory();
        //获取拿铁咖啡和提拉米苏甜品
        Coffee coffee1 = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee1.getName());
        dessert.show();
    }
}