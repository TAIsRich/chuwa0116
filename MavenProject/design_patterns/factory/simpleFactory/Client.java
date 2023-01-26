package oop.factory.simpleFactory;

public class Client {
    public static void main(String[] args) {
        CoffeeHouse coffeeHouse = new CoffeeHouse();
        coffeeHouse.orderCoffee("American");
        coffeeHouse.orderCoffee("Latte");
        coffeeHouse.orderCoffee("Espresso");
    }
}
