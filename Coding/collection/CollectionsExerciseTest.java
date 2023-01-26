package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
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
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(19);
        nums.add(12);
        nums.add(11);
        nums.add(15);
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
        System.out.println(Collections.frequency(nums, 11));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(19);
        nums.add(12);
        nums.add(11);
        nums.add(15);
        List<Integer> synNums = Collections.synchronizedList(nums);
    }
}
