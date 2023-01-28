package generic;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<Integer> intClass = new GenericClass<>(1);
        System.out.println(intClass.getObject());

        GenericClass<Double> doubleClass = new GenericClass<>(12.43444);
        System.out.println(doubleClass.getObject());

        GenericClass<String> stringClass = new GenericClass<>("This generic class that uses a string");
        System.out.println(stringClass.getObject());
    }
}
