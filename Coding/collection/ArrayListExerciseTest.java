package com.chuwa.exercise.collection;

import org.junit.Test;
import org.testng.annotations.Test;

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
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.get(1));
        System.out.println(list1.size());
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        System.out.println(list1);
        System.out.println(list2);
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

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
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
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for(Iterator<String> iterator = list.iterator(); iterator.hasNext();){
            String temp = iterator.next();
            if(!temp.isEmpty()){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(8);
        list.get(1);
        list.get(2);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

    }
}
