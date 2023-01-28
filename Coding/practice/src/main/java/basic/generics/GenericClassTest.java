package basic.generics;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/26/23
 */
public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>(10);
        System.out.println(obj1.getObj());

        GenericClass<Double> obj2 = new GenericClass<>(8.88);
        System.out.println(obj2.getObj());

        GenericClass<String> obj3 = new GenericClass<>("Rich");
        System.out.println(obj3.getObj());
    }
}
