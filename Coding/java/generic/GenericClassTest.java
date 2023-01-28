package com.chuwa.tutorial.t01_basic.generic;

public class GenericClassTest{
    public static void main(String[] args){
        GenericClass<Integer> obj = new GenericClass<>(5);
        System.out.println(obj.getObj());

        GenericClass<Double> obj2 = new GenericClass<>(15.7755);
        System.out.println(obj2.getObj());

        GenericClass<String> obj3 = new GenericClass<>("First generic class");
        System.out.println(obj3.getObj());
    }
}