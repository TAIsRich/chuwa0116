package designPattern.abstractFactory;

public class ItalianDessertFactory implements DessertFactory{

    public Coffee createCoffee() {
        return new Latte();
    }

    public Dessert createDessert() {
        return new Tiramisu();
    }
}
