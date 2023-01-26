package Factory.AbstractF;

public class ItalianDessertactory implements DessertFactory {
  @Override
  public Coffee createCoffee() {
    return new LatteCoffee();
  }

  @Override
  public Dessert createDessert() {
    return new Trimisu();
  }
}
