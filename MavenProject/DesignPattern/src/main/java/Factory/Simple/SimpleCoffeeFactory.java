package Factory.Simple;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/24/23
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("Americano".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("Latte".equals(type)) {
            coffee = new LatteCoffe();
        }
        return coffee;
    }
}
