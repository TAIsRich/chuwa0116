package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest {
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        ArrayList<Integer> myNums = new ArrayList<Integer>();
        myNums.add(1);
        myNums.add(2);
        myNums.add(3);
        System.out.println(myNums.get(0));
        System.out.println(myNums.size());
        ArrayList<Integer> myNums2 = new ArrayList<Integer>();
        myNums.addAll(myNums2);
    }

    /**
     * remove(int index)
     * remove(Object o)
     * removeRange(int fromIndex, int toIndex)
     * removeAll(Collection<?> c)
     * clear()
     *
     * Update:
     * set(int index, E e)
     * replaceAll(UnaryOperator<E> operator)
     *
     * check:
     * contains(Object o)
     * indexOf(Object o)
     * lastIndexOf(Object o)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        ArrayList<Integer> myNums = new ArrayList<Integer>();
        myNums.add(1);
        myNums.add(2);
        myNums.add(3);
        myNums.add(4);
        myNums.add(5);
        myNums.remove(0);
        myNums.subList(1,2).clear();
        myNums.set(0,25);
        myNums.replaceAll(e-> e + 1);
        if(myNums.contains(2)){
            System.out.println("Yes");
        } else System.out.println("No");

    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     * forEachRemaining(Consumer<? super E> action) -- from Java8
     */

    @Test
    public void learn_Iterator() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();
        System.out.println(it.next());
        System.out.println(it.hasNext());
        it.remove();
        it.forEachRemaining(s -> System.out.println(s+"abc"));

    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> myNums = new ArrayList<Integer>();
        myNums.add(3);
        myNums.add(2);
        myNums.add(1);
        myNums.add(6);
        myNums.add(8);
        Collections.sort(myNums);
        for(int i = 0; i < myNums.size(); i++){
            System.out.println(myNums.get(i));
        }
        myNums.sort(Comparator.reverseOrder());
        for(int i = 0; i < myNums.size(); i++){
            System.out.println(myNums.get(i));
        }
    }
}
