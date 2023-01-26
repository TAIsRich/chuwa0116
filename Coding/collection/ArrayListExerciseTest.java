package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest<E> extends ArrayList<E> {
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        List<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");

        // get element
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.size());

        List<String> anotherList = new ArrayList<String>();
        anotherList.add("four");
        anotherList.add("five");
        list.addAll(anotherList);

        //print list
        System.out.println(list);
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
        ArrayListExerciseTest<String> list = new ArrayListExerciseTest();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("orange");
        list.add("grape");

        // remove element at index 2
        list.remove(2);
        System.out.println(list);

        // remove element "orange"
        list.remove("orange");
        System.out.println(list);

        // remove range of elements
        list.removeRange(0, 2);
        System.out.println(list);

        // remove all elements from another list
        List<String> anotherList = new ArrayList<String>();
        anotherList.add("grape");

        list.removeAll(anotherList);
        System.out.println(list);

        // clear the list
        list.clear();
        System.out.println(list);

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.set(1, "orange");
        System.out.println(list);

        list.replaceAll(s -> s.toUpperCase());
        System.out.println(list);

        System.out.println(list.contains("orange"));
        System.out.println(list.contains("grape"));

        System.out.println(list.indexOf("orange"));
        System.out.println(list.lastIndexOf("cherry"));
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
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // create an iterator
        Iterator<String> iterator = list.iterator();

        // check if there are more elements
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            // remove the current element
            iterator.remove();
        }
        //print list
        System.out.println(list); // prints "[]"

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        iterator = list.iterator();
        iterator.forEachRemaining(element -> System.out.println(element));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<String> list = new ArrayList<String>();
        list.add("cherry");
        list.add("banana");
        list.add("apple");

        // sort the list
        Collections.sort(list);
        System.out.println(list);

        // sort the list in reverse order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
