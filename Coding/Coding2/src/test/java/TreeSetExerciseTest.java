import org.junit.Test;

import java.util.Arrays;
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
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.addAll(Arrays.asList(1232,12312,12312,12));
        System.out.println(treeSet.contains(1232));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.subSet(1,112312));
        System.out.println(treeSet.headSet(1232));
        System.out.println(treeSet.tailSet(12312));
        treeSet.remove(1);
        System.out.println(treeSet.size());
        System.out.println(treeSet.isEmpty());
    }
}
