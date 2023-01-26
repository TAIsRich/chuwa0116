package com.chuwa.learn.collection;

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
        List<Integer> lst = Arrays.asList(2,2,2,5,1);
        System.out.println(Collections.min(lst));
        System.out.println(Collections.max(lst));
        System.out.println(Collections.frequency(lst,2));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> lst = Arrays.asList(2,3,1,1,2,3,4,2,1,5);
        List<Integer> synlist = Collections
                .synchronizedList(lst); // thread safe

    }
}