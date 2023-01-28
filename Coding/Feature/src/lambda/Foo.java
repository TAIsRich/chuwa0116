package lambda;

@FunctionalInterface
public interface Foo {
    String aMethod(String string);

    default String defaultBar() {
        String s = "defalut Bar method";
        System.out.println(s);
        return s;
    }

    default String defaultCommon() {
        String s = "default common for Bar";
        System.out.println(s);
        return s;
    }
}
