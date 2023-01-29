package Coding.generic;

public class GenericMultiArguments {

    public static <T1, T2, T3> void temp(T1 x, T2 y, T3 z) {
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
        System.out.println(" z = " + z);
    }
    public static void main(String[] args) {
        temp(1, "2", 3L);
    }
}