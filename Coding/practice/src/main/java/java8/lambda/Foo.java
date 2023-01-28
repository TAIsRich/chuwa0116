package java8.lambda;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/27/23
 */
@FunctionalInterface
public interface Foo {

    String aMethod(String string);

    default String defaultBar() {
        String s = "default Bar method";
        System.out.println(s);
        return s;
    }

    default String defaultCommon() {
        String s = "defaultCommon from Bar";
        System.out.println(s);
        return s;
    }
}
