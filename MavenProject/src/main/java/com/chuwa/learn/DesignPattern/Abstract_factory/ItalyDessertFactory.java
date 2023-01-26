package DesignPattern.Abstract_factory;

public class ItalyDessertFactory implements DessertFactory {

    public LatteCoffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Trimisu();
    }
}
