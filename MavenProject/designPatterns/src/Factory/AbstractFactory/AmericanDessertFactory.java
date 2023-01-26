package Factory.AbstractFactory;


public class AmericanDessertFactory implements DessertFactory{
    public Coffee createCoffee(){
        return new Americano();
    }
    public Dessert createDessert(){
        return new MatchaMousse();
    }
}