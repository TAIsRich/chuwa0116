package collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

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
        TreeSet<Integer> set= new TreeSet<>();
        set.add(10);
        set.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(set.contains(10));

        System.out.println(set.first());

        System.out.println(set.last());

        SortedSet<Integer> subSet1 = set.subSet(2, 4);
        SortedSet<Integer> subSet2 = set.headSet(3); // default exclusive < 3
        SortedSet<Integer> subSet3 = set.tailSet(3); // default inclusive >= 3
    }
}
