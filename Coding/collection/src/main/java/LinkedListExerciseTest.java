import org.junit.Test;

import java.util.Collections;
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
        list.add(2);
        list.addFirst(1);
        list.add(2, 3);
//        list.forEach(System.out::println);
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(4);
        list1.add(5);

//        list.addAll(list1);
        list.addAll(1, list1);
//        list.forEach(System.out::println);

        System.out.println(list.getFirst() + " " + list.getLast() + " " + list.get(1));
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
        list.add(2);
        list.addFirst(1);
        list.add(2, 3);

        Collections.sort(list);
        list.removeFirst();
        list.removeLast();
        list.removeLastOccurrence(1);
    }
}