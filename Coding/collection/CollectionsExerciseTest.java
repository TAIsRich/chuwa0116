package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

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
        int[] values = new int[]{ 8, 2, 3, 7, 5, 6, 7, 5, 9, 9, 16 };
        List<Integer> l = new ArrayList<>();
        for (int value : values){
            l.add(value);
        }


        int min = Collections.min(l);
        int max = Collections.max(l);
        int freq = Collections.frequency(l, 9);
        
        System.out.println(min);
        System.out.println(max);
        System.out.println(freq);

    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        try {
            int[] values = new int[]{ 8, 2, 3, 7, 5, 6, 7, 5, 9, 9, 16 };
            List<Integer> l = new ArrayList<>();
            for (int value : values){
                l.add(value);
            }

            List<Integer> l2 = Collections.synchronizedList(l);
        }  catch (IllegalArgumentException e){
            System.out.println(e);
        }
            
    }
}
