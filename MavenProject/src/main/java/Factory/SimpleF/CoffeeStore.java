package Factory.SimpleF;

public class CoffeeStore {

    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

        Coffee coffee = factory.createCoffee(type);

        coffee.addmilk();
        coffee.addsugar();

        return coffee;
    }
}
