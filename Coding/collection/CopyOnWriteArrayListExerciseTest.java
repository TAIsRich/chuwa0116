import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class CopyOnWriteArrayListExerciseTest {

    /**
     * e.g. List list = new CopyOnWriteArrayList();
     *
     * <p>add(E e) add(int index, E element) addAll(Collection c) addIfAbsent(E e)
     * addAllAbsent(Collection c)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        CopyOnWriteArrayList<Integer> l = new CopyOnWriteArrayList<>();
        l.add(0);
        l.add(1, 1);
        List<Integer> l1 = new ArrayList<>(Arrays.asList(2, 3, 4));
        l.addAll(l1);
        l.addIfAbsent(4);
        l.addIfAbsent(5);
        l.addAllAbsent(l1);
        System.out.println(l);
    }

    /** iterator() hasNext() next() remove() */
    @Test
    public void learn_Iterator() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Created an iterator
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String a = itr.next();
            if (a.equals("Banana")) {
                System.out.println(a);
                list.remove(a);
            }
        }
        System.out.println(list);
    }
}