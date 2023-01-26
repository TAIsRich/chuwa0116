package Factory.Abstract;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/24/23
 */
public abstract class Coffee {

    public abstract String getName();

    public void addSugar() {
        System.out.println("add sugar");
    }

    public void addMilk() {
        System.out.println("add milk");
    }
}
