package com.chuwa.exercise.collection;

import org.junit.Test;

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
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(5);
        set2.add(6);
        set.addAll(set2);

        boolean contain = set.contains(4);

        int first = set.first();
        int last = set.last();

        Set<Integer> subSet = set.subSet(2, 3);
        Set<Integer> headSet = set.headSet(3);
        Set<Integer> tailSet = set.tailSet(2);

        set.remove(2);
        int size = set.size();
        boolean empty = size.isEmpty();
    }
}
