public class AmericanDessertFactory implements DessertFactory{
    public Coffee createCoffee(){
        return new AmericanCoffee();
    }

    public Dessert createDessert(){
        return new MatchaMousse();
    }
}