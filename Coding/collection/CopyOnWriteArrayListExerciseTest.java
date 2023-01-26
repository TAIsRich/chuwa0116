package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class CopyOnWriteArrayListExerciseTest {

    /**
     * e.g.
     * List list = new CopyOnWriteArrayList();
     *
     * add(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addIfAbsent(E e)
     * addAllAbsent(Collection c)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        List<String> list = new CopyOnWriteArrayList<>();

        // add(E e)
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println(list); // [apple, banana, cherry]

        // add(int index, E element)
        list.add(1, "mango");
        System.out.println(list); // [apple, mango, banana, cherry]

        // addAll(Collection c)
        list.addAll(List.of("orange", "grape"));
        System.out.println(list); // [apple, mango, banana, cherry, orange, grape]
    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     */

    @Test
    public void learn_Iterator() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //Created an iterator
        Iterator<String> itr = list.iterator();
    }
}
