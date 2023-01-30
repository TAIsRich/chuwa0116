package Coding.generic;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericsClass<Integer> o1 = new GenericsClass<>(5);
        GenericsClass<String> o2 = new GenericsClass<>("hi");
        GenericsClass<Double> o3 = new GenericsClass<>(14.3432);
        System.out.println(o1.getObj());
        System.out.println(o2.getObj());
        System.out.println(o3.getObj());
    }
}
