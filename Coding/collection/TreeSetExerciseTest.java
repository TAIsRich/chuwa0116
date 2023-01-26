package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.TreeSet;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class TreeSetExerciseTest {
    /**
     * e.g.
     * Set<Integer> set= new TreeSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * contains(Object o)
     *
     * first()
     * last()
     * subSet(E fromElement, E toElement)
     * headSet(E toElement)
     * tailSet(E fromElement)
     *
     * remove(Object o)
     *
     * size()
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        TreeSet<String> al=new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        TreeSet<String> al1 = new TreeSet<String>();
        al1.addAll(al);
        System.out.println(al1);
        al.contains("ii");
        System.out.println(al.first());
        System.out.println(al.last());
        System.out.println("subSet: " + al.subSet("Ravi", "Vijay"));
//        System.out.println("subSet: " + al.subSet(0, 2));
        System.out.println(al.headSet("Ravi"));
        System.out.println(al.tailSet("Ajay"));
        al.size();
        al.remove("Ajay");
        al.isEmpty();
    }
}
