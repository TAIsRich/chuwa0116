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
        Set<Integer> hashSet = new HashSet<>();
       int[] nums = {1,23,23,31,23,231,2132,21231231};
       for(int num:nums)hashSet.add(num);
       Set<Integer> hashSet1=new HashSet<>();
       hashSet1.addAll(hashSet);
        System.out.println(hashSet1.contains(1));
        System.out.println(hashSet1.remove(1));
        System.out.println(hashSet1.isEmpty());
        hashSet1.clear();
    }
}
