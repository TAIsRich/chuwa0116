package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
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
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        System.out.println(list.toString());
        list.add("Mike");
        System.out.println(list.toString());
        list.add(1, "Marry");
        System.out.println(list.toString());
        List<String> list1 = new ArrayList<>();
        list1.add("Tom");
        list1.add("Ted");
        list.addAll(list1);
        System.out.println(list.toString());
        System.out.println(list.addIfAbsent("Mike"));
        System.out.println(list.addIfAbsent("Alice"));
        System.out.println(list.toString());
        List<String> list2 = new ArrayList<>();
        list2.add("Mike");
        list2.add("Alice");
        list2.add("Bob");
        list.addAllAbsent(list2);
        System.out.println(list.toString());
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
        if(itr.hasNext()) System.out.println(itr.next());
        try {
            itr.remove();
        } catch (UnsupportedOperationException use) {
            System.out.println("Remove is not allowed");
        } catch (Exception e) {
            System.out.println("General exception");
        }
    }
}
