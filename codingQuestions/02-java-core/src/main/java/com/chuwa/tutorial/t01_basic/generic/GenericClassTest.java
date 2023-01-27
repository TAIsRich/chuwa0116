package com.chuwa.tutorial.t01_basic.generic;

/**
 * @author b1go
 * @date 7/25/22 12:18 AM
 */
public class GenericClassTest {

    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>(5);
        System.out.println(obj1.getObj());

        GenericClass<Double> obj2 = new GenericClass<>(15.777755);
        System.out.println(obj2.getObj());

        GenericClass<String> obj3 = new GenericClass<>("Yayy! That's my first Generic Class.");
        System.out.println(obj3.getObj());
    }
}
