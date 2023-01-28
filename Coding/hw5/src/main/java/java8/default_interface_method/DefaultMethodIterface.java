package java8.default_interface_method;

public interface DefaultMethodIterface {
    default public void defaultMethod() {
        System.out.println("This default method in the interface do not need to be overridden");
    }

    public int add (int x, int y);

    public static void staticMethoc() {
        System.out.println("This static method in the interface do not need to be overridden");
    }
}
