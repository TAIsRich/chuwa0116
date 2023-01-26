package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<Integer> list = Arrays.asList( 3,2,54,32,3,2,1,4,5,3,2,1,3);
        int min = Collections.min(list);
        int max = Collections.max(list);
        int fre = Collections.frequency(list, 9);
        System.out.println(min);
        System.out.println(max);
        System.out.println(fre);

    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        try {
            List<Integer> list = Arrays.asList( 3,2,54,32,3,2,1,4,5,3,2,1,3);
            List<Integer> ls2 = Collections.synchronizedList(list);
        }  catch (IllegalArgumentException e){
            System.out.println(e);
        }

    }
}
