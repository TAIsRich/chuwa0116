package collections;


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
        int a = Collections.min(Arrays.asList(1,2,3,4,5));
        a = Collections.min(Arrays.asList(1,2,3,4,5), Comparator.comparingInt(num -> num));

        int b = Collections.max(Arrays.asList(1,2,3,4,5));
        b = Collections.max(Arrays.asList(1,2,3,4,5), Comparator.comparingInt(num -> num));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> SyncList = Collections.synchronizedList(Arrays.asList(1,2,3,4,5));
    }
}
