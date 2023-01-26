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
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2);
        list.addLast(3);
        list.addFirst(1);
        list.add(3, 4);
        list.addAll(Arrays.asList(5, 6));
        list.addAll(6, Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(6));
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
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.remove(0));
        Integer a = 4;
        System.out.println(list.remove(a));
        list.removeLastOccurrence(2);
    }
}
