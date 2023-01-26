package org.example.pattern.factory.static_factory;

public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("对不起你所点的咖啡没有");
        }
        return coffee;
    }
}
