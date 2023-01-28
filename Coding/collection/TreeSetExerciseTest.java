package collection;

import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class TreeSetExerciseTest {
    /**
     * e.g.
     * Set<Integer> set= new TreeSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * contains(Object o)
     *
     * first()
     * last()
     * subSet(E fromElement, E toElement)
     * headSet(E toElement)
     * tailSet(E fromElement)
     *
     * remove(Object o)
     *
     * size()
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(9);
        ts.add(15);
        ts.add(28);
        ts.add(90);

        ts.subSet(9, 28);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.size());

        SortedSet<Integer> h = ts.headSet(28);
        System.out.println(h.size());


    }
}
