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
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);

        int min = Collections.min(list);
        System.out.println("Minimum element in the list: " + min);

        int max = Collections.max(list);
        System.out.println("Maximum element in the list: " + max);

        int frequency = Collections.frequency(list, 2);
        System.out.println("Frequency of 2 in the list: " + frequency);
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> list = new ArrayList<>();
        list = Collections.synchronizedList(list);
        System.out.println("Thread safe list created: " + list);
    }
}
