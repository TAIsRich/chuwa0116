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
        List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println(list);
        System.out.println("max value: " + Collections.max(list));
        System.out.println("min value: " + Collections.min(list));
        System.out.println("fre: " + Collections.frequency(list, "Four"));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<String> list = Collections.synchronizedList(new LinkedList<>());
        list.add("practice");
        list.add("code");
        list.add("quiz");
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}
