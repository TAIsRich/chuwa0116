public class GenericClassTest {
  public static void main(String[] args) {
    GenericClass<Integer> obj1 = new GenericClass<>(1);
    System.out.println(obj1.getObj());

    GenericClass<Double> obj2 = new GenericClass<>(1.0);
    System.out.println(obj2.getObj());

    GenericClass<String> obj3 = new GenericClass<>("1");
    System.out.println(obj3.getObj());
  }
}
