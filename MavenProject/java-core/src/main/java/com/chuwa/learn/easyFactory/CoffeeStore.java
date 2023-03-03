public class CoffeeStore{
    public Coffee OrderCoffee(String type){
        SimpleCoffeeFactory factory=new SimpleCoffeeFactor();
        Coffee coffee=factory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}