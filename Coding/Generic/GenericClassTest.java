public class GenericaClassTest{
    public static void main(String []args){
        GenericClass<Integer>obj1=new GenericaClass<>(5);
        System.out.println(obj1.getObj());

        GenericClass<Double>obj1=new GenericaClass<>(15.777755);
        System.out.println(obj1.getObj());

        GenericClass<String>obj1=new GenericaClass<>("Yayy! That's my first Generic Class.");
        System.out.println(obj1.getObj());

    }
}