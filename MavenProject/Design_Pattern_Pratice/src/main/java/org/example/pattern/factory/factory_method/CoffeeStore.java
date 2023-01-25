package org.example.pattern.factory.factory_method;


public class CoffeeStore {

    private CoffeeFactory factory;
    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }


    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addsugar();
        coffee.addMilk();
        return coffee;
    }
}
