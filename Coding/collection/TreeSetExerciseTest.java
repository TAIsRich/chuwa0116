package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
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
        TreeSet<String> set= new TreeSet<>();
        set.add("china");
        set.addAll(Arrays.asList(new String[]{"us", "japan"}));
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.contains("china"));
        set.remove("us");
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
