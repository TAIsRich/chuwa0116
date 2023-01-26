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
        // Creating a TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements to the TreeSet
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);

        // Adding a collection to the TreeSet
        set.addAll(java.util.Arrays.asList(5, 6, 7));

        // Checking if an element is present in the set
        boolean contains = set.contains(2); // true

        // Retrieving the first and last element
        int first = set.first(); // 1
        int last = set.last(); // 7

        // Retrieving a subSet from the TreeSet
        TreeSet<Integer> subSet = (TreeSet<Integer>) set.subSet(2, 5); // [2, 3, 4]

        // Retrieving the headSet and tailSet
        TreeSet<Integer> headSet = (TreeSet<Integer>) set.headSet(5); // [1, 2, 3, 4]
        TreeSet<Integer> tailSet = (TreeSet<Integer>) set.tailSet(3); // [3, 4, 5, 6, 7]

        // Removing an element from the set
        set.remove(3); // [1, 2, 4, 5, 6, 7]

        // Checking the size of the set
        int size = set.size(); // 5

        // Checking if the set is empty
        boolean isEmpty = set.isEmpty(); // false
    }
}
