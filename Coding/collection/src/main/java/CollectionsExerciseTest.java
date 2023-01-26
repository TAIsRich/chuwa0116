import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++){
            list.add(i);
        }
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 1));

    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++){
            list.add(i);
        }
        Collections.synchronizedList(list);
    }
}