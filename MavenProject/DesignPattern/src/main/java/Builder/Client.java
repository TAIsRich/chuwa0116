package Builder;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/25/23
 */
public class Client {
    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }

    public static void main(String[] args) {
        showBike(new MobikeBuilder());
        showBike(new OfoBuilder());
    }
}
