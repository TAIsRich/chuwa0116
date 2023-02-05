package Coding.collection;

import org.junit.Test;

import java.util.ArrayList;
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
        LinkedList<Integer> lst = new LinkedList<>(new ArrayList<>(Arrays.asList(0, 11, 22, 33, 4,5,66,77)));
        lst.remove(0);
        lst.remove(Integer.valueOf(4));
        System.out.println(lst); //[11, 22, 33, 5, 66, 77]
//        lst.removeRange(0,1); not working with arraylist
        lst.removeAll(new ArrayList<>(Arrays.asList(66,77)));
        System.out.println(lst); //[11, 22, 33, 5]
        lst.set(0, 110);
        System.out.println(lst);
        lst.replaceAll(s->s+1);
        System.out.println(lst);
        System.out.println(lst.contains(111));
        System.out.println(lst.indexOf(111));
        System.out.println(lst.indexOf(23));
        lst.clear();
        lst.add(100);
        lst.add(200);
        lst.add(300);
        System.out.println(lst.getFirst());
        System.out.println(lst.getLast());
        System.out.println(lst.get(1));
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
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(100);
        lst.add(200);
        lst.add(200);
        lst.add(150);
        lst.add(200);
        lst.add(200);
        lst.add(200);
        lst.add(250);
        lst.add(300);
        lst.removeFirst();
        lst.remove(lst.size()-1);
        lst.remove(Integer.valueOf(200));

        System.out.println(lst);
        lst.removeLastOccurrence(200);
        System.out.println(lst);

    }
}
