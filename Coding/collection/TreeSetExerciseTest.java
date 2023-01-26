package com.chuwa.exercise.collection;
import java.util.*;
import java.util.TreeSet;
import org.junit.Test;

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
        TreeSet<String> ts1 = new TreeSet<>();
        TreeSet<String> ts2 = new TreeSet<>();

        // Elements are added using add() method
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
        ts1.add("D");
        ts1.add("E");
        ts1.add("F");
        ts1.addAll(ts2);
        System.out.println(ts1.contains("d"));
        System.out.println("first: "+ts1.first());
        System.out.println("last: "+ts1.last());
        TreeSet<String>ts3=new TreeSet<>();
        ts3=(TreeSet<String>) ts1.subSet("A","C");

        TreeSet<String>ts4=new TreeSet<>();
        ts4=(TreeSet<String>) ts1.headSet("B");

        TreeSet<String>ts5=new TreeSet<>();
        ts5=(TreeSet<String>) ts1.tailSet("D");



        Iterator iterate;
        iterate = ts3.iterator();

        // Displaying the tree set data
        System.out.println("The resultant values from the ts3: ");

        // Iterating through the tailSet
        while (iterate.hasNext()) {
            System.out.println(iterate.next() + " ");
        }

        Iterator iterate1;
        iterate1 = ts4.iterator();

        // Displaying the tree set data
        System.out.println("The resultant values from the headSet: ");

        // Iterating through the tailSet
        while (iterate1.hasNext()) {
            System.out.println(iterate1.next() + " ");
        }

        Iterator iterate2;
        iterate2 = ts5.iterator();

        // Displaying the tree set data
        System.out.println("The resultant values from the tailSet: ");

        // Iterating through the tailSet
        while (iterate2.hasNext()) {
            System.out.println(iterate2.next() + " ");
        }






    }
}
