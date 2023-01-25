package com.chuwa.learn.pattern.factory.before;

public class CoffeeStore {

    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，没有您所点的咖啡");
        }
        coffee.addmilk();
        coffee.addsugar();

        return coffee;
    }

}
