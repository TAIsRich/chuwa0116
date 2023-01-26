package com.chuwa.learn.collection;

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
        CopyOnWriteArrayList<Integer> lst = new CopyOnWriteArrayList<Integer>();
        lst.add(1);
        lst.add(1,100);
        lst.addAll(Arrays.asList(2,2,2));
        System.out.println(lst);
        lst.addIfAbsent(2);
        lst.addAllAbsent(Arrays.asList(100,5));
        System.out.println(lst);

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
//        itr.next();
//        itr.remove(); not working
//        itr.next();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}