package com.chuwa.learn.coffee;

public class CoffeeStore {

    public Coffee orderCoffee(String type){

        simpleCoffeeFactory factory = new simpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

}
