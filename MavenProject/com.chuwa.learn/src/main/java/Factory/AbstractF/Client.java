package Factory.AbstractF;

public class Client {
  public static void main(String[] args) {
    ItalianDessertactory f = new ItalianDessertactory();
    Coffee coffee = f.createCoffee();
    Dessert dessert = f.createDessert();
    System.out.println(coffee.getName());
    dessert.show();
  }
}
