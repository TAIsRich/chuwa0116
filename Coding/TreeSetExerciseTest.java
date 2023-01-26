package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
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
        TreeSet<Character> treeSet = new TreeSet<>();
        treeSet.add('a');
        treeSet.add('z');
        treeSet.add('w');
        System.out.println(treeSet.toString());
        List<Character> list = Arrays.asList('a', 'r', 'q', 'o');
        treeSet.addAll(list);
        System.out.println(treeSet.toString());
        System.out.println(treeSet.contains('a'));
        System.out.println(treeSet.contains('b'));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        SortedSet<Character> subset = treeSet.subSet('a', 'w');
        System.out.println(subset.toString());
        SortedSet<Character> headset = treeSet.headSet('q');
        System.out.println(headset.toString());
        SortedSet<Character> tailset = treeSet.tailSet('b');
        System.out.println(tailset.toString());
    }
}
