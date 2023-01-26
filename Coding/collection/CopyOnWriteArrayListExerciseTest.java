package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Collections;
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
        CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<>();
        threadSafeList.add("geek");
        threadSafeList.add("code");
        threadSafeList.add("practice");
        System.out.println(threadSafeList);
        Iterator<String> it = threadSafeList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
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
        System.out.println(itr.hasNext());
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Iterator<String> itr2 = list.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        list.remove("Apple");

        Iterator<String> itr1 = list.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}
