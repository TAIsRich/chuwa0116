public class CoffeStore {

    public Coffee orderCoffee(String type){
        CoffeeFactory factory = new CoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        coffee.addMilk();
        coffee.addsugar();

        return  coffee;

    }
}
