package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.*;

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
        List<Integer> list = new LinkedList<Integer>();

        list.add(2);
        list.add(4);
        list.add(3);
        list.add(8);

        int minElem = Collections.min(list);
        System.out.println(minElem);
        int maxElem = Collections.max(list);
        System.out.println(maxElem);
        System.out.println(Collections.frequency(list, 10));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        List<Integer> synlist = Collections.synchronizedList(list);

        System.out.println(synlist);
    }
}
