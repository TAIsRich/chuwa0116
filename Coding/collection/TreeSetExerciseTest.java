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
        TreeSet<String> t1 = new TreeSet<>();
        TreeSet<String> t2 = new TreeSet<>();
        t1.add("A");
        t1.add("B");
        t1.add("C");
        t2.add("D");
        t2.add("E");
        t2.add("F");
        t1.addAll(t2);
        System.out.println(t1.contains("G"));
        System.out.println(t1.first());
        System.out.println(t1.last());
        TreeSet<String> t3 = (TreeSet<String>) t1.subSet("A","C");
        TreeSet<String> t4 = (TreeSet<String>) t1.headSet("C");
        TreeSet<String> t5=(TreeSet<String>) t1.tailSet("A");
        t1.remove("A");
        System.out.println(t1.size());
        System.out.println(t1.isEmpty());
    }

}
