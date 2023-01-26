package com.chuwa.exercise.collection;

import org.junit.Test;

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
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = Arrays.binarySearch(numbers,4);
        System.out.println( k);
        int[] numbers1 = { 1, 2, 4, 3, 5, 6, 7, 8, 9, 10 };
        Arrays.sort(numbers1);
        for(int i:numbers1){
            System.out.print(i);
        }
        System.out.println();
        int[] numbers2 = { 1, 2, 4, 3, 5, 6, 7, 8, 9, 10 };
        Arrays.parallelSort(numbers2);
        for(int i:numbers2){
            System.out.print(i);
        }
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
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[]cp = Arrays.copyOf(numbers, numbers.length);
        for(int i:cp){
            System.out.print(i);
        }
        System.out.println();
        cp = Arrays.copyOfRange(numbers, 0, 5);
        for(int i:cp){
            System.out.print(i);
        }
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
        String[] numbers = {"a","b","c" };
        List<String>list = Arrays.asList(numbers);
        System.out.println(list);
        int[] numbers1 = { 1, 2, 4, 3, 5, 6, 7, 8, 9, 10 };
        int[] numbers2 = { 1, 2, 4, 3, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.equals(numbers1, numbers2));
        int[]fl = new int[7];
        Arrays.fill(fl, 9);
        System.out.println(fl[1]);
    }
}
