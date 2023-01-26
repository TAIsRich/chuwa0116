package com.chuwa.test.collection;

import org.junit.Test;

import java.util.Arrays;
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
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1); // = list.addLast
        list.addFirst(0);
        list.stream().forEach(e -> System.out.println(e));
        list.clear();
        list.addAll(Arrays.asList(1,2,3,4));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2));
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
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addAll(Arrays.asList(10, 5, 7, 6, 12,32,22,12));
        list.removeFirst();
        list.removeLast();
        list.removeLastOccurrence(4);
        list.stream().forEach(System.out::println);
        // reverse a list
        Collections.reverse(list);
        list.stream().forEach(System.out::println);
    }
}