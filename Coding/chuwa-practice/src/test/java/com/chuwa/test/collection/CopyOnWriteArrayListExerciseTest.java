package com.chuwa.test.collection;

import org.junit.Test;

import java.util.Arrays;
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
        // CopyWriteArraylist is thread safe. it will copy the whole list while iteration
        List<Integer> list = new CopyOnWriteArrayList(Arrays.asList(1,2,3,4));
        Iterator<Integer> itr = list.iterator();
        list.add(10);
        // attention! because when we init the iterator, 10 is not in the list, so we will not copy it.
        itr.forEachRemaining(System.out::println);
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
        // remove is not allowed in the iteration of CopyOnWriteArrayList
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            if (itr.next().equals("Apple")) {
                itr.remove();
            }
        }
    }
}