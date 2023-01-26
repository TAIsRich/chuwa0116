package Factory.Abstract;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/24/23
 */
public class Client {
    public static void main(String[] args) {
        AmericanDessertFactory factory = new AmericanDessertFactory();
//        ItalyDessertFactory factory = new ItalyDessertFactory();

        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
