package Factory.Abstract;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/24/23
 */
public class AmericanDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
