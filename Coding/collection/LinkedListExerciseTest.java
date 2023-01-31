package collection;

import java.util.LinkedList;

import org.junit.Test;

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
        LinkedList<Integer> h = new LinkedList<>();
        h.add(10);
        h.add(3);
        h.add(9);
        h.add(7);
        h.addFirst(0);

        System.out.println(h.getFirst());
        System.out.println(h.getLast());
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
        LinkedList<Integer> h = new LinkedList<>();
        h.add(10);
        h.add(3);
        h.add(9);
        h.add(7);
        h.add(1);

        int number1 = h.removeFirst();
        int number2 = h.removeLast();
        System.out.println(number1);
        System.out.println(number2);

        System.out.println(h.size());
        h.sort((a, b)->{return a-b;});
        System.out.println(h.getFirst());
    }
        
}
