package collection;

import org.junit.Test;
import java.util.Set;
import java.util.HashSet;


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
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("pink");
        System.out.println(colors.size());

        colors.remove("red");
        System.out.println(colors.size());

        System.out.println(colors.contains("red"));
        System.out.println(colors.isEmpty());

        colors.clear();
        System.out.println(colors.isEmpty());
    }
}
