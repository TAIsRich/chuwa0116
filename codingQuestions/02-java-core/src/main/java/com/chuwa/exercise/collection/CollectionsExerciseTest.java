package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class CollectionsExerciseTest {

    /**
     * Collections.min(list))
     * min(Collection c, Comparator comp)
     *
     * Collections.max(list)
     * max(Collection c, Comparator comp)
     *
     * frequency(Collection c, object o)
     */

    @Test
    public void learn_common_collections_operations() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 2));
    }

    /**
     * synchronizedList(): return a thread-saft list
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> list = new ArrayList<Integer>();

        // populate the list
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // printing the Collection
        System.out.println("List : " + list);

        // create a synchronized list
        List<Integer> synlist = Collections
                .synchronizedList(list);

        // printing the Collection
        System.out.println("Synchronized list is : " + synlist);
    }
}
