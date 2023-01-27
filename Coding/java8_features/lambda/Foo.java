@FunctionalInterface
public interface Foo {
    String aMethod(String s);

    default String defaultBar(){
        String s = "default bar method";
        System.out.println(s);
        return s;
    }

    default String defaultCommon() {
        String s = "default common method from Bar";
        System.out.println(s);
        return s;
    }
}
