package Factory.SimpleF;

public class CoffeeStore {
  public Coffee orderCoffee(String type) {
    SimpleCoffeeFactory f = new SimpleCoffeeFactory();
    Coffee coffee = f.createCoffee(type);
    coffee.addMilk();
    coffee.addSugar();
    return coffee;
  }
}
