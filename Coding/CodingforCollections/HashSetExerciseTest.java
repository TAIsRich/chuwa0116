import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class HashSetExerciseTest {
    /**
     * e.g.
     * Set<Integer> set= new HashSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * get()
     * contains()
     *
     * remove(Object o)
     * clear()
     *
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(22);
        Set<Integer> another = new HashSet<>();
        another.add(22);
        another.add(66);
        another.add(88);
        another.add(100);
        set.addAll(another);
        //get
        boolean check1 = set.contains(100);
        boolean check2 = set.contains(200);

        //remove
        set.remove(22);
        int before_size = set.size();
        set.clear();
        boolean ifEmpty = set.isEmpty();


    }
}
