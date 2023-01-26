package oop.factory.abstractFactory;

public class ItalianFactory implements AbstractFactory{
    @Override
    public Coffee createCoffee() {
        Coffee coffee =  new Latte();
        System.out.println("Making: " + coffee.getName());

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

    @Override
    public Dessert createDessert() {
        Tiramisu tiramisu = new Tiramisu();
        tiramisu.show();
        return tiramisu;
    }
}
