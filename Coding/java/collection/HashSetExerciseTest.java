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
        set.add(2);
        set.add(3);

        Set<Integer> set2 = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        set.addAll(set2);

        List<Integer> list = new ArrayList<>(set);
        int first = list.get(0);

        boolean contain = set.contains(1);

        set1.remove(2);
        set1.clear();
        boolean empty = set.isEmpty();

    }
}
