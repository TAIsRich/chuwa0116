package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.LinkedList;

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
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        sites.addFirst("First");
        sites.addLast("Last");
        sites.add(6, "Six");

        LinkedList<String> sites1 = new LinkedList<String>();
        sites1.addAll(sites);
        System.out.println(sites1);
        sites1.addAll(5, sites);

        System.out.println(sites1);

        System.out.println(sites1.getFirst());
        System.out.println(sites1.getLast());
        System.out.println(sites1.get(0));

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
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.add("Weibo");
        sites.add("Weibo");
        sites.add("Weibo");
        System.out.println(sites);
        sites.removeFirst();
        sites.removeLast();
        sites.remove(0);
        sites.remove("Taobao");
        System.out.println(sites);
        //removeLastOccurrence

        sites.removeLastOccurrence("Weibo");

        System.out.println(sites);
        sites.sort(Comparator.naturalOrder());

    }
}
