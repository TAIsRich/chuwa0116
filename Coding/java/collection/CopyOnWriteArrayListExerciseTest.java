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
        List list = new CopyOnWriteArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(4, 5);

        List list2 = new CopyOnWriteArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        list.addAll(list2);
        list.addIfAbsent(6);

        List list3 = new CopyOnWriteArrayList();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list.addAllAbsent(list3);

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
        if(itr.hasNext()) itr.next();
        itr.remove();
    }
}
