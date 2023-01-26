package oop.factory.abstractFactory;

public class Client {
    public static void main(String[] args) {
        AmericanFactory americanFactory = new AmericanFactory();
        ItalianFactory italianFactory = new ItalianFactory();

        americanFactory.createCoffee();
        americanFactory.createDessert();

        italianFactory.createCoffee();
        italianFactory.createDessert();
    }
}
