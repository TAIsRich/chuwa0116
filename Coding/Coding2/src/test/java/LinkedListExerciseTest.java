import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author b1go
 * @date 6/12/22 4:45 PM
 */
public class LinkedListExerciseTest {

    /**
     * e.g.
     * List<Integer> list = new LinkedList<Integer>();
     * Inserting:
     * add(E e) or addLast(E e)
     * addFirst(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addAll(int index, Collection c)
     *
     * Retrieving:
     * getFirst()
     * getLast()
     * get(int index)
     *
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.addFirst(5);
        list.addAll(Arrays.asList(123,3213,123));
        list.addAll(1,Arrays.asList(12,32,123));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(0));
        System.out.println(list);
    }

    /**
     * removeFirst()
     * removeLast()
     * remove(int index)
     * remove(Object o)
     * removeLastOccurrence()
     *
     * sort()
     */

    @Test
    public void learn_Remove_Sort() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.addFirst(5);
        list.addAll(Arrays.asList(123,3213,123));
        list.removeFirst();
        list.removeLast();
        list.remove(0);
        list.remove(1);
        list.removeLastOccurrence(123);
        list.sort((a,b)->a-b);
        System.out.println(list);
    }
}
