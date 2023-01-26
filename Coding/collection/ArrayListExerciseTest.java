package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

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
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.forEach((Integer value) -> System.out.println(value));
        System.out.println(list.get(0));
        System.out.println(list.size());
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(7);
        list.addAll(list1);
        list.forEach((Integer value) -> System.out.println(value));
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
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("iphone");
        list.add("ipad");
        list.add("windows");
        list.remove(0);
        list.remove("banana");
        list.forEach((String value) -> System.out.print(value));
        System.out.println("");
        ArrayList<String> list1 = list;
        list1.removeAll(list1);
        list1.forEach((String value) -> System.out.print(value));
        System.out.println("");
        list.clear();
        list.forEach((String value) -> System.out.print(value));
        System.out.println("");
        list.set(0, "apple");
        list.forEach((String value) -> System.out.print(value));
        System.out.println("");
        boolean result = list.contains("banana");
        System.out.println(result);
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
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        Iterator<Integer> it = list.iterator();
        System.out.println(it.next());

    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(1);
        Collections.sort(list);
        list.forEach((Integer value) -> System.out.print(value));
    }
}
