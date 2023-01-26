package oop.factory.simpleFactory;

public class CoffeeHouse {
    public Coffee orderCoffee(String name) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.makeCoffee(name);
        System.out.println("Making: " + coffee.getName());

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
