package java8.default_interface_method;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/27/23
 */
public class Client {
    public static void main(String[] args) {
        DIMLImpl diml = new DIMLImpl();
        System.out.println("Override: " + diml.add(1, 2));
        System.out.println("Default: " + diml.substract(1, 2));
        System.out.println("Static: " + DIML.blogName());
    }
}
