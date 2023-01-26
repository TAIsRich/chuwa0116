package com.chuwa.exercise.collection;

import org.junit.Test;

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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list.get(0));
        System.out.println(list.size());
        List<Integer> list2 = List.of(2, 3);
        list.addAll(list2);
        System.out.println(list);
    }

    /**
     * remove(int index)
     * remove(Object o): Removes the first occurrence of the specified element from this list, if it is present (optional operation).
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
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("B");
        list.add("A");

        System.out.println(list);

        String removedStr = list.remove(1);
        System.out.println(list);
        System.out.println(removedStr);
        list.remove("A");
        System.out.println(list);
        System.out.println(list.contains("A"));
        System.out.println(list.indexOf("A"));
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
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("B");
        list.add("A");
        System.out.println(list);
        Iterator<String> i = list.iterator();
        System.out.println(i.next());
        i.remove();
        System.out.println(list);
        i.forEachRemaining(e -> System.out.println(e));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder() :  Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("B");
        list.add("A");
        list.sort((s1, s2)-> s1.compareTo(s2));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
