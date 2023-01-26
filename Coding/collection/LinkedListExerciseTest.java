package com.chuwa.exercise.collection;

import org.junit.Test;

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
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        ((LinkedList<Integer>) list).addLast(2);
        ((LinkedList<Integer>) list).addFirst(3);
        list.add(1, 4);
        list.addAll(List.of(5, 6, 7));
        list.addAll(2, List.of(8, 9));

        System.out.println("First element: " + ((LinkedList<Integer>) list).getFirst());
        System.out.println("Last element: " + ((LinkedList<Integer>) list).getLast());
        System.out.println("Element at index 2: " + list.get(2));
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
        LinkedList<Integer> list = new LinkedList<Integer>(List.of(1, 2, 3, 4, 5, 6));

        list.removeFirst();
        list.removeLast();
        list.remove(2);
        list.remove(Integer.valueOf(4));
        list.removeLastOccurrence(3);

        list.sort(Integer::compareTo);

        System.out.println("List after removing and sorting: " + list);
    }
}
