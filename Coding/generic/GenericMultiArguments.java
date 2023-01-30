package Coding.generic;

public class GenericMultiArguments {
    public static void main(String[] args) {
        method(1,"fdsf", 23.33);
    }
    public static <T1, T2, T3>void method(T1 x, T2 y, T3 z){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
