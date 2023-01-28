package com.chuwa.test.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GenericExerciseTest {
    public class GenericClass<T> {
        T obj;
        public void setObj(T obj) {
            this.obj = obj;
        }
        public T getObj() {
            return this.obj;
        }
    }
    public class GenericMethod {
        public static <T extends Comparable<T>>  T getMax(List<T> list) {
            return list.stream().max(T::compareTo).orElse(null);
        }
    }
    @Test
    public void test1(){
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setObj("jinda");
        System.out.println(genericClass.getObj());
    }
    @Test
    public void test2() {
        List<Integer> l = new ArrayList<>(Arrays.asList(3,2,4,5,1,6));
        System.out.println(GenericMethod.getMax(l));
    }
    @Test
    public void test3() {
        List<Integer> l = null;
        System.out.println(l.get(0));
    }
}
