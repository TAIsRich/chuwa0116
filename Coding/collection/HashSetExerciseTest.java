package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class HashSetExerciseTest {
    /**
     * e.g.
     * Set<Integer> set= new HashSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * get()
     * contains()
     *
     * remove(Object o)
     * clear()
     *
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");
        System.out.println(sites);

        ArrayList<String> collect = new ArrayList<String>();
        collect.add("A");
        collect.add("Computer");
        collect.add("Portal");

        sites.addAll(collect);
        System.out.println(sites);

        System.out.println(sites.contains("Computer"));
        sites.remove("Computer");
        System.out.println(sites);
        sites.clear();
        System.out.println(sites);

        System.out.println(sites.isEmpty());
    }
}
