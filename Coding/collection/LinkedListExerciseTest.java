package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author b1go
 * @date 6/12/22 4:45 PM
 */
public class LinkedListExerciseTest {

    /**
     * e.g.
     * List<Integer> list = new LinkedList<Integer>();
     * Inserting:
     * add(E e) or addLast(E e)
     * addFirst(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addAll(int index, Collection c)
     *
     * Retrieving:
     * getFirst()
     * getLast()
     * get(int index)
     *
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        ((LinkedList<Integer>) list).addFirst(0);
        list.add(1, 3);
        for (Integer integer : list) {
            System.out.print(integer);
        }
        System.out.println("");
        System.out.println(((LinkedList<Integer>) list).getFirst());
        System.out.println(((LinkedList<Integer>) list).getLast());
        System.out.println(list.get(1));
    }

    /**
     * removeFirst()
     * removeLast()
     * remove(int index)
     * remove(Object o)
     * removeLastOccurrence()
     *
     * sort()
     */

    @Test
    public void learn_Remove_Sort() {
        List<Integer> list = new LinkedList<>();
        list.add(8);
        list.add(2);
        list.add(1);
        list.add(4);
        list.remove(1);
        for (Integer integer : list) {
            System.out.print(integer);
        }
        System.out.println("");
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer);
        }
    }
}
