package com.chuwa.exercise.collection;

import org.junit.Test;

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
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.addFirst(0);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
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
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(3);
        ll.add(9);
        ll.add(7);
        ll.add(1);
        int n1 = ll.removeFirst();
        System.out.println(n1);
        int n2 = ll.removeLast();
        System.out.println(n2);
        System.out.println(ll.size());
        ll.sort();
        System.out.println(ll.getFirst());
    }
}
