public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>(5);
        System.out.println(obj1.obj);

        GenericClass<Double> obj2 = new GenericClass<>(15.77777);
        System.out.println(obj2.obj);

        GenericClass<String> obj3 = new GenericClass<>("The Generic");
        System.out.println(obj3.obj);
    }
}
