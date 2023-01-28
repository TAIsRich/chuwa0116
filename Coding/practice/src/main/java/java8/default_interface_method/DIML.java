package java8.default_interface_method;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/27/23
 */
public interface DIML {
    String BLOG = "is Chuwa a";

    int add(int a, int b);

    default int substract(int a, int b) {
        return a - b;
    }

    static String blogName() {
        return BLOG;
    }
}
