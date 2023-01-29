package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.*;

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
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.addFirst(200);
        list.add(2, 500);
        List<Integer> another = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.addAll(another);
        List<Integer> another2 = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66));
        list.addAll(1, another2);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(list.size()-1));
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
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.addFirst(200);
        list.add(2, 500);
        List<Integer> another = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.addAll(another);
        List<Integer> another2 = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66));
        list.addAll(1, another2);

        list.removeFirst();
        list.removeLast();
        list.remove(5);
        list.remove((Integer) 44);
        list.removeLastOccurrence(22);
        Collections.sort(list);
    }
}
