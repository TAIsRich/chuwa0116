package com.chuwa.exercise.collection;

import org.junit.Test;

import java.lang.reflect.Array;
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
        ArrayList<String> list = new ArrayList<>();
        list.add("I feel good");
        System.out.println(list.get(0));
        System.out.println(list.size());
        List<String> anotherList = new ArrayList<>();
        anotherList.add("My name is Minrui");
        anotherList.add("I am in New York City");
        list.addAll(anotherList);
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
        // ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(1);
        list.add(8);
        list.add(12);
        list.add(1);
        list.add(82);
        System.out.println(list.toString());
        list.remove(2);
        System.out.println(list.toString());
        list.remove(Integer.valueOf(1));
        System.out.println(list.toString());
//        list.removeRange(3,5);
//        System.out.println(list.toString());
        list.removeAll(Arrays.asList(5,6,7,8));
        System.out.println(list.toString());
        list.set(0, 1);
        System.out.println(list.toString());
        list.replaceAll(i -> i*2);
        System.out.println(list.toString());
        list.clear();
        System.out.println(list.toString());
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
        list.add(22);
        list.add(1);
        list.add(8);
        list.add(12);
        list.add(1);
        list.add(82);
        Iterator<Integer> iter = list.iterator();
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(list.toString());
        iter.remove();
        System.out.println(list.toString());
        iter.forEachRemaining(i -> System.out.println(i));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(1);
        list.add(8);
        list.add(12);
        list.add(1);
        list.add(82);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list.toString());
        list.sort(Integer::compareTo);
        System.out.println(list.toString());
        System.out.println(list1.toString());
        Collections.sort(list1);
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        Collections.sort(list2, Comparator.reverseOrder());
        System.out.println(list2.toString());
    }
}
