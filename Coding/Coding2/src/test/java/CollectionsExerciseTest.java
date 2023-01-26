import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class CollectionsExerciseTest {
    private ArrayList<Integer> list = new ArrayList<Integer>(){{
        add(3);
        add(3);
        add(28);
        add(600);
        add(333);
    }};
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
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,3));
    }

    /**
     * synchronizedList()
     * This list is thread-safe because we could
     * successfully add all the elements to the List
     */
    @Test
    public void learn_thread_safe_ArrayList() throws InterruptedException {
        List<Integer> integers = Collections.synchronizedList(this.list);
        Thread[] threads = new Thread[10000];
        for(int i=0;i<10000;++i){
            threads[i] = new Thread(()->{
                integers.add(100);
            });
            threads[i].start();
        }
        for(int i=0;i<10000;++i)
            threads[i].join();
        System.out.println(integers.size());
    }
}
