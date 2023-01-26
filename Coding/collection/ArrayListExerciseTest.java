import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest {
    /** new ArrayList() add elements get element get Size list.addAll(anotherList) */
    @Test
    public void learn_Inserting_And_Retrieving() {
        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        int a = l.get(0);
        System.out.println(a);
        System.out.println(l.size());
        List<Integer> ll = new ArrayList<>();
        ll.addAll(l);
        System.out.println(ll);
    }

    /**
     * remove(int index) remove(Object o) removeRange(int fromIndex, int toIndex)
     * removeAll(Collection<?> c) clear()
     *
     * <p>Update: set(int index, E e) replaceAll(UnaryOperator<E> operator)
     *
     * <p>check: contains(Object o) indexOf(Object o) lastIndexOf(Object o)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        List<Double> l = new ArrayList<>(Arrays.asList(1.1, 1.2, 1.3, 1.4, 1.5, 1.6));

        List<Double> ll = new ArrayList<>(Arrays.asList(1.5, 1.6));

        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        l.remove(1.3);
        System.out.println(l);
        l.removeAll(ll);
        System.out.println(l);
        l.clear();
        System.out.println(l);

        List<Double> l2 = new ArrayList<>(Arrays.asList(1.1, 1.2, 1.3, 1.4, 1.5, 1.6));

        l2.set(0, 1.0);
        System.out.println(l2);
        l2.replaceAll(d -> d * d);
        System.out.println(l2);

        System.out.println(l2.contains(1.0));
        System.out.println(l2.indexOf(1.44));
        System.out.println(l2.lastIndexOf(1.44));
    }

    /**
     * iterator() hasNext() next() remove() forEachRemaining(Consumer<? super E> action) -- from Java8
     */
    @Test
    public void learn_Iterator() {
        List<Integer> l = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        Iterator<Integer> iter = l.listIterator();
        iter.forEachRemaining(System.out::println);
        while (iter.hasNext()) {
            int i = iter.next();
            if (i == 2) iter.remove();
        }
        System.out.println(l);
    }

    /** sort(List<T> list) Collections.sort(List<T> t) Comparator.reverseOrder() */
    @Test
    public void learn_Sorting() {
        List<Integer> l = new ArrayList<>(Arrays.asList(4, 2, 3, 1, 0));
        Collections.sort(l);
        System.out.println(l);
        l.sort(Comparator.reverseOrder());
        System.out.println(l);
    }
}