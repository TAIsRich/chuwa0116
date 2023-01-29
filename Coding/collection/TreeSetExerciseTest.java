package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.*;

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
        TreeSet<Integer> set = new TreeSet<>();
        //add
        set.add(100);
        List<Integer> list = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66));
        set.addAll(list);

        //contains
        System.out.println(set.contains(66));

        System.out.println(set.first());
        System.out.println(set.last());
        Set<Integer> subset1 = set.subSet(22, 55);
        Set<Integer> subset2 = set.headSet(22);
        Set<Integer> subset3 = set.tailSet(22);

        set.remove(33);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
