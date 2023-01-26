public class GenericClassTest {
    public static void main(String[] args) {
        // Test for Integer
        GenericClass<Integer> obj1 = new GenericClass<>(100);
        System.out.println(obj1.getObj());

        // Test for Double
        GenericClass<Double> obj2 = new GenericClass<>(66.6);
        System.out.println(obj2.getObj());

        // Test for String
        GenericClass<String> obj3 = new GenericClass<>("Hello world.");
        System.out.println(obj3.getObj());
    }
}
