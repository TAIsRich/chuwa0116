package java8.lambda;

/**
 * @author Zhipeng Yin
 * @date 2023-01-27 18:24
 */

@FunctionalInterface
public interface Foo {
    String aMethod(String str); //abstract method

    default String defaultBar(){
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
