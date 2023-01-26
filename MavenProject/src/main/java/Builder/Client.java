package Builder;

public class Client {
    public static void main(String[] args) {
        Director d = new Director(new MobikeBuilder());
        Bike bike = d.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
