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
        List<Integer> test = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            test.add(i);
        }
        System.out.println(Collections.min(test));
        System.out.println(Collections.max(test));
        System.out.println(Collections.frequency(test, 5));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(1, 4, 5, 7, 22, 46,46, 22, 46, 89, 100)));
        synchronized (list){
            Iterator it = list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
