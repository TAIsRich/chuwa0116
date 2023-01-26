package com.chuwa.exercise.collection;

import java.util.List;

import org.junit.Test;
import java.util.*;
import java.util.stream.Collectors;

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
        List<Integer>ls = new ArrayList<>();
        List<Integer>ans = new ArrayList<>();
        ls.add(3);
        System.out.println(ls.get(ls.size()-1));
        ans.addAll(ls);

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
        List<String>ls = new ArrayList<>();
        List<String>ans = new ArrayList<>();
        ls.add("A");
        ls.remove(0);
        System.out.println(ls);
        ls.add("A");
        ls.remove("A");
        System.out.println(ls);
        ls.add("A");
        ls.add("B");
        ans.add("B");
        ls.removeAll(ans);
        ls.clear();
        System.out.println(ls);

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
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s);
            if(!s.isEmpty()) iter.remove();
        }
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
//        sort()
        ArrayList<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
