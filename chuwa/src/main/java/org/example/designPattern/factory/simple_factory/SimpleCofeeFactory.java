package org.example.designPattern.factory.simple_factory;

public class SimpleCofeeFactory {

    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，没有您所点的咖啡");
        }

        return coffee;
    }
}
