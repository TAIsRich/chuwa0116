package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Set;
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
     * subSet(E fromElement, E toElement): This method will return elements ranging from fromElement to toElement. fromElement is inclusive and toElement is exclusive.
     * headSet(E toElement): This method will return elements of TreeSet which are less than the specified element.
     * tailSet(E fromElement): This method will return elements of TreeSet which are greater than or equal to the specified element.
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
        TreeSet<Integer> set= new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set.contains(1));

        System.out.println(set.subSet(1, 3)); //[from, to)
        System.out.println(set.tailSet(3)); // elements >= obj
        System.out.println(set.headSet(3)); // elements < obj
    }
}
