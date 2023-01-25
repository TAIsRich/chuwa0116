package FactoryPattern.AbstractFactory;

public interface DessertFactory {
    //create coffee
    Coffee createCoffee();

    //create cake
    Dessert createDessert();
}
