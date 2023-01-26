public class AmericanDessertFactory implements DessertFactory {

    public AmericanCoffee createCoffee(){
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }

}
