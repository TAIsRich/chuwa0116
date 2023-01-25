package org.example.pattern.factory.static_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type){

        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        /**
        coffee.addMilk();
        coffee.addsugar();

        return coffee;
         **/
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
