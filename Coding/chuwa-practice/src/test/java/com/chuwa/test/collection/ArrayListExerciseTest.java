package com.chuwa.test.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
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
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(4);
        System.out.println(arr1.get(1));
        System.out.println(arr1.size());
        arr1.stream().forEach(System.out::println);
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        arr1.addAll(0, arr2);
        arr1.stream().forEach(System.out::println);
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
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6));
        arr1.remove(0); // 2,2,3,4,5,6
        arr1.remove(Integer.valueOf(2)); // 2,3,4,5,6
        arr1.stream().forEach(System.out::println);
        //This is very important, subList will return a list point to the same list with original one.
        //removeRange is protected method, so we should use below method to remove range.
        arr1.subList(1,3).clear();// 2,5,6
        // subList will change the value in original list
        List<Integer> l = arr1.subList(1,3); // l = 5,6
        l.set(0,100); // l = 100,6; arr1 = 2,100,6
        arr1.stream().forEach(System.out::println);

        // removeAll, clear
        arr1.removeAll(Arrays.asList(2, 6)); // 100
        arr1.clear();

        arr1.addAll(Arrays.asList(1,2,3,4,5,2,6));
        // replaceAll
        arr1.replaceAll(e -> e+1);
        arr1.stream().forEach(System.out::println);
        //check
        //contains
        System.out.println(arr1.contains(2));
        System.out.println(arr1.indexOf(3));
        System.out.println(arr1.lastIndexOf(3));
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
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6));
        Iterator<Integer> itr = arr1.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        itr = arr1.iterator();
        // forEachRemaining
        itr.forEachRemaining(e -> {System.out.println(e); System.out.println(e);});
        itr = arr1.iterator();
        itr.forEachRemaining(System.out::println);

        // remove
        // remove the element of last next() or previous()
        itr = arr1.iterator();
        while (itr.hasNext()) {
            if (itr.next()%2==0) {
                itr.remove();
            }
        }
        itr = arr1.iterator();
        itr.forEachRemaining(System.out::println);// 1,3,5
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3,2,12,3,7,2,1));
        arr1.sort((a,b) -> a-b);
        arr1.stream().forEach(System.out::println);
        Collections.sort(arr1, (a,b) -> b-a);
        arr1.stream().forEach(System.out::println);
    }
}