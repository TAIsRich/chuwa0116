package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

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
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        Set<Integer> newSet = new HashSet<>();
        newSet.add(5);
        newSet.add(6);
        newSet.add(7);
        set.addAll(newSet);

        System.out.println("set: " + set);

        System.out.println("contains 3: " + set.contains(3));
        System.out.println("contains 8: " + set.contains(8));

        set.remove(4);
        System.out.println("set after removing 4: " + set);

        set.clear();
        System.out.println("set after clear: " + set);
        System.out.println("set is empty: " + set.isEmpty());
    }
}
