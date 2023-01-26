package com.chuwa.exercise.collection;

import org.junit.Test;

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
        set.addAll(Arrays.asList(1, 2, 3, 4));
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
