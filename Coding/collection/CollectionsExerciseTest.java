package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
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
        String[] numbers = {"a", "a","b","c" };
        List<String> list = Arrays.asList(numbers);
        String mi = Collections.min(list);
        String ma = Collections.max(list);
        System.out.println(mi+" "+ma);
        System.out.println(Collections.frequency(list, "a"));

    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        String[] numbers = {"a", "a","b","c" };
        List<String> list = Arrays.asList(numbers);
        List<String>sync = Collections.synchronizedList(list);
        System.out.println(sync);
    }
}
