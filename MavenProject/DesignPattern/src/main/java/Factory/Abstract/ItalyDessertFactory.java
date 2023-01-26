package Factory.Abstract;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/24/23
 */
public class ItalyDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffe();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
