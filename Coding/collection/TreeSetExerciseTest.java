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
        Set<Integer> set= new TreeSet<>();
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(4);
        printSet(set);
        set.addAll(set);
        printSet(set);
        System.out.println(((TreeSet<Integer>) set).first());
        System.out.println(((TreeSet<Integer>) set).last());
        Set<Integer> set2 = ((TreeSet<Integer>) set).subSet(0,1);
        printSet(set2);
        printSet(((TreeSet<Integer>) set).headSet(2));
        printSet(((TreeSet<Integer>) set).tailSet(1));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }

    static void printSet(Set<Integer> set) {
        for (Integer integer : set) {
            System.out.print(integer);
        }
        System.out.println("");
    }
}
