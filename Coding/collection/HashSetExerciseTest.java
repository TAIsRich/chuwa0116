package com.chuwa.exercise.collection;

import org.junit.Test;
import java.util.*;
/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class HashSetExerciseTest {
    /**
     * e.g.
     * Set<Integer> set= new HashSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * get()
     * contains()
     *
     * remove(Object o)
     * clear()
     *
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        Set<String> set= new HashSet<>();
        set.add("china");
        set.addAll(Arrays.asList(new String[]{"us", "japan"}));

        System.out.println(set.contains("china"));
        set.remove("us");
        set.clear();
        System.out.println(set.isEmpty());
    }
}
