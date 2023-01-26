package oop.factory.abstractFactory;

public class AmericanFactory implements AbstractFactory{
    @Override
    public Coffee createCoffee() {
        Coffee coffee =  new American();
        System.out.println("Making: " + coffee.getName());

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

    @Override
    public Dessert createDessert() {
        MatchaMousse matchaMousse = new MatchaMousse();
        matchaMousse.show();
        return matchaMousse;
    }
}
