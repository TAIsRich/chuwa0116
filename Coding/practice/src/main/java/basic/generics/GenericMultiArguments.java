package basic.generics;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/26/23
 */
public class GenericMultiArguments {
    public static <T, S, U> void print(T x, S y, U z) {
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
        System.out.println("z is: " + z);
    }

    public static void main(String[] args) {
        GenericMultiArguments.print(888, "Rich", 'c');
    }
}
