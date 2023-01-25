package com.chuwa.exercise.collection;

import org.junit.Test;

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
        int[] arr = new int[]{ 3,2,54,32,3,2,1,4,5,3,2,1,3};
        List<Integer> ls = Arrays.asList(arr);

        int minn = Collections.min(ls);
        int maxx = Collections.max(ls);
        int freq = Collections.frequency(ls, 9);
        System.out.println(minn);
        System.out.println(maxx);
        System.out.println(freq);
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        try {
            int[] arr = new int[]{ 3,2,54,32,3,2,1,4,5,3,2,1,3};
            List<Integer> ls = Arrays.asList(arr);
            List<Integer> ls2 = Collections.synchronizedList(ls);
        }  catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
