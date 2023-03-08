package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class CopyOnWriteArrayListExerciseTest {

    /**
     * e.g.
     * List list = new CopyOnWriteArrayList();
     *
     * add(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addIfAbsent(E e)
     * addAllAbsent(Collection c)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        CopyOnWriteArrayList<Integer> al
                = new CopyOnWriteArrayList<Integer>();
        System.out.println("Initial size of al: " + al.size());
        CopyOnWriteArrayList<Integer> list2
                = new CopyOnWriteArrayList<Integer>();
        // add elements to the array list
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(1, 7);
        System.out.println("Size of al after additions: " + al.size());

        // display the array list
        System.out.println("Contents of al: " + al);
        list2.add(25);
        list2.add(30);
        list2.add(31);
        list2.add(35);
        al.addAll(list2);
        System.out.println("Printing all the elements");
        // let us print all the elements available in
        // list1
        for (Integer number : al)
            System.out.println("Number = " + number);
        al.addIfAbsent(10);
        CopyOnWriteArrayList<Integer> list3
                = new CopyOnWriteArrayList<Integer>();
        list3.add(25);
        list3.add(300);
        list3.add(310);
        list3.add(350);
        al.addAllAbsent(list3);
        System.out.println("Printing all the elements after list3");
        for (Integer number : al)
            System.out.println("Number = " + number);


    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     */

    @Test
    public void learn_Iterator() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //Created an iterator
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String i=iter.next();
            if(i=="Apple") {
                list.remove("Apple");
                break;
            }
        }
        for(String s:list){
            System.out.println(s);
        }
    }
}
