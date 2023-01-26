package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class ArraysExerciseTest {

    /**
     * e.g.
     * int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
     * numbers[?]
     *
     * numbers[?] = #
     */

    @Test
    public void learn_Inserting_And_Retrieving() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(numbers[2]);
        numbers[2] = 100;
        System.out.println(Arrays.toString(numbers));
    }

    /**
     * binarySearch()
     * e.g.
     * Arrays.binarySearch(numbers, 4);
     *
     * sort(array)
     * sort(array, fromIndex, toIndex)
     * e.g.
     * Arrays.sort(numbers);
     *
     * Arrays.parallelSort(numbers);
     */
    @Test
    public void learn_search_and_sort() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.binarySearch(numbers, 4));
        int[] number = { 1, 2, 7, 4, 5, 6, 3, 8, 9, 10};
        Arrays.sort(number);
        Arrays.sort(number, 2, 6);
        System.out.println(Arrays.toString(number));
        //只有当数组长度大于 8192 时才进行并行排序
        Arrays.parallelSort(number);
    }

    /**
     * copyOf()
     * e.g.
     * Arrays.copyOf(numbers, numbers.length);
     *
     * copyOfRange()
     * e.g.
     * Arrays.copyOfRange(numbers, 0, 5);
     */
    @Test
    public void learn_copy_of_array() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(Arrays.copyOf(numbers, 2)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(numbers, 2, 5)));
    }

    /**
     * asList()
     * e.g.
     * List<Integer> list = Arrays.asList(numbers);
     *
     * equals()
     * e.g.
     * Arrays.equals(numbers1, numbers2);
     *
     * fill()
     * e.g.
     * Arrays.fill(numbers, 20);
     *
     */

    @Test
    public void learn_common_operations() {
        Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = Arrays.asList(numbers);
        System.out.println(list);
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        boolean a = Arrays.equals(ary2, ary1);
        System.out.println(a);
        int[] test = new int[6];
        Arrays.fill(test, 20);
        System.out.println(Arrays.toString(test));
    }
}
