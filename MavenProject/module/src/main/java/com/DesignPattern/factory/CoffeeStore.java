package com.DesignPattern.factory;

public class CoffeeStore{
    public Coffee orderCoffee(String type){
        Coffee coffee=null;
        if("american".equals(type))
            coffee=new AmericanCoffee();
        else if("latte".equal(type))
            coffee=new LatteCoffee();
        else
            throw new RuntimeException();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}