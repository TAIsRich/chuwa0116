package java8.default_interface_method;

/**
 * @author Zhipeng Yin
 * @date 2023-01-27 18:19
 */
public class Client {
    public static void main(String[] args) {
        DIMImpl dim = new DIMImpl();
        System.out.println("Override method: " + dim.add(1, 2));
        System.out.println("default method: " + dim.substract(1, 2));
        System.out.println("static method: " + DIML.blogName()); //直接类名
    }
}
