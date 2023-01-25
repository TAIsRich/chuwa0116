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
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 22, 46,46, 22, 46, 89, 100));
        int min_Value = Collections.min(list);
        int max_Value = Collections.max(list);
        int freqOfNum = Collections.frequency(list, 22);
        System.out.println(freqOfNum);

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
