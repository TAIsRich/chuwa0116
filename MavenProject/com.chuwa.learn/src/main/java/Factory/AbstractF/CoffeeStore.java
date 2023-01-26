package Factory.AbstractF;

public class CoffeeStore {
  private DessertFactory f;

  public void setF(DessertFactory f) {
    this.f = f;
  }

  public Coffee orderCoffee() {
    Coffee coffee = f.createCoffee();
    coffee.addMilk();
    coffee.addSugar();
    return coffee;
  }
}
