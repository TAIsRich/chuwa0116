package Factory.AbstractF;

public class AmericanDessertFactory implements DessertFactory {
  @Override
  public Coffee createCoffee() {
    return new AmericanoCoffee();
  }

  @Override
  public Dessert createDessert() {
    return new MatchaMousse();
  }
}
