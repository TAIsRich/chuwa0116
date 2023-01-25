package org.example.designPattern.factory.simple_factory;

public class CoffeeStore {

    public Coffee orderCoffee(String type){
        SimpleCofeeFactory factory = new SimpleCofeeFactory();

        Coffee coffee = factory.createCoffee(type);

        coffee.addmilk();
        coffee.addsugar();

        return coffee;
    }

}
