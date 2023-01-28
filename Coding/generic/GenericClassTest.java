public class GenericClassTest {
    
    public static void main(String[] args) throws Exception {
        GenericClass<Integer>ls1 = new GenericClass<Integer>(5);
        System.out.println(ls1.getobj());

        GenericClass<Double>ls2 = new GenericClass<Double>(15.7777555);
        System.out.println(ls2.getobj());

        GenericClass<String>ls3 = new GenericClass<String>("TEST");
        System.out.println(ls3.getobj());
    }
}
