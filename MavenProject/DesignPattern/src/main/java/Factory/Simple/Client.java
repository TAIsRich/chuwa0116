package Factory.Simple;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/24/23
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("Latte");
        System.out.println(coffee.getName());
    }
}
