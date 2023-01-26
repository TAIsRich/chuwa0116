public class ItalyDessertFactory implements DessertFactory{
    public Coffee createCoffee(){
        return new LatteCoffee();
    }
    public Dessert createDesert(){
        return new Trimisu();
    }
}