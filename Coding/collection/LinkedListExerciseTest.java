package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
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
        LinkedList<String> ls = new LinkedList<>();
        LinkedList<String>ans = new LinkedList<>();
        ls.addFirst("A");
//        ls.remove(0);
        System.out.println(ls);
        ls.addFirst("A");
        ls.addLast("c");
        ls.remove("A");
        System.out.println(ls.getFirst());
        System.out.println(ls.getLast());

        ls.add("A");
        ls.add("B");
        ans.add("B");
        ls.removeAll(ans);
        ls.clear();
        System.out.println(ls);
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
        LinkedList<String> ls = new LinkedList<>();
        LinkedList<String>ans = new LinkedList<>();
        ls.addFirst("A");
//        ls.remove(0);
        System.out.println(ls);
        ls.addFirst("A");
        ls.addLast("c");
        ls.removeFirst();
        ls.addLast("c");
        ls.addLast("B");
        ls.removeLast();
        System.out.println(ls);
        ls.removeLastOccurrence("c");
        System.out.println(ls);
    }
}
