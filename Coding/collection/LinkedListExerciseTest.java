package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

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
        LinkedList<String> list = new LinkedList<String>();
        LinkedList<String> list1 = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.addLast("f");
        list.addFirst("g");
        list.add(0,"aa");
        list1.add("bb");
        list.addAll(list1);
        list.addAll(0,list1);
        String first=list.getFirst();
        String last=list.getLast();
        System.out.println(first);
        System.out.println(last);
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
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.addLast("f");
        list.addFirst("g");
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        list.remove("e");
        list.removeLastOccurrence("a");
        Collections.sort(list, Comparator.naturalOrder());

    }
}
