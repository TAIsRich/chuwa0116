package oop.factory.simpleFactory;

public class CoffeeFactory {
    public Coffee makeCoffee(String name) {
        Coffee coffee;

        if (name.equalsIgnoreCase("American")){
            coffee = new American();
        } else if (name.equalsIgnoreCase("Latte")) {
            coffee = new Latte();
        } else {
            throw new RuntimeException("no the coffee you ordered");
        }

        return coffee;
    }
}
