import apple.laf.JRSUIUtils;
import org.junit.Test;

import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class TreeSetExerciseTest {
    /**
     * e.g. Set<Integer> set= new TreeSet<>();
     *
     * <p>add(E e) addAll(Collection<> c)
     *
     * <p>contains(Object o)
     *
     * <p>first() last() subSet(E fromElement, E toElement) headSet(E toElement) tailSet(E
     * fromElement)
     *
     * <p>remove(Object o)
     *
     * <p>size() isEmpty()
     */
    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(0);
        List<Integer> l = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        s.addAll(l);

        System.out.println(s.contains(0));

        System.out.println(s.first());
        System.out.println(s.last());

        TreeSet<Integer> s1 = (TreeSet<Integer>) s.subSet(2, 4);
        System.out.println(s1);
        TreeSet<Integer> s2 = (TreeSet<Integer>) s.headSet(3);
        System.out.println(s2);
        TreeSet<Integer> s3 = (TreeSet<Integer>) s.tailSet(3);
        System.out.println(s3);

        System.out.println(s.size());

        System.out.println(s.isEmpty());
    }
}