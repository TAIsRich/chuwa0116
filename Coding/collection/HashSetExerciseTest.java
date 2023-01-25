package com.chuwa.exercise.collection;

import org.junit.Test;
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
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        HashSet<Integer> set1= new HashSet<>();
        set1.add(6);
        set.addAll(set1);
        System.out.println(set.contains(1));
        set.remove(2);
        set1.clear();
        System.out.println(set1.isEmpty());

    }
}
