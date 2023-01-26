package Collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
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
        List<Integer> list = new LinkedList<Integer>();

        // populate the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // printing the List
        System.out.println("List: " + list);

        // getting minimum value
        // using min() method
        int min = Collections.min(list);
        int max=Collections.max(list);
        int freq=Collections.frequency(list,10);
        // printing the min value
        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is: " + max);
        System.out.println("frequency of 10 is: "+freq);
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        try {

            // creating object of List<String>
            List<String> list = new ArrayList<String>();

            // populate the list
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");

            // printing the Collection
            System.out.println("List : " + list);

            // create a synchronized list
            List<String> synlist = Collections
                    .synchronizedList(list);

            // printing the Collection
            System.out.println("Synchronized list is : " + synlist);
        }

        catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
