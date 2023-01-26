package oop.factory.abstractFactory;

import javax.crypto.spec.DESedeKeySpec;

public interface AbstractFactory {
    Coffee createCoffee();

    Dessert createDessert();
}
