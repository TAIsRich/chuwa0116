package com.chuwa.exercise.collection;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        int num = nums.get(0);
        int size = nums.size();

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(11);
        nums2.add(12);
        nums.addAll(nums2);
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
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.remove(0);
        nums.remove(Integer.valueOf(40));
        nums.removeRange(0, 1);
        nums.subList(0, 1).clear();

        nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.removeAll(nums2);

        nums.set(0, 100);
        nums.replaceAll(e -> e * 2);

        boolean contain = nums.contains(100);
        int index = nums.indexOf(100);
        nums.add(100);
        nums.add(100);
        int last = nums.lastIndexOf(100);
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
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        Iterator<Integer> iter = nums.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        iter = nums.iterator();
        for(int i = 0; i < 2; ++i){
            iter.next();
        }
        iter.remove();
        iter.forEachRemaining((cur) -> System.out.println(cur));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        nums.sort(Comparator.naturalOrder());
        nums.sort(Comparator.reverseOrder());
        Collections.sort(nums);
    }
}
