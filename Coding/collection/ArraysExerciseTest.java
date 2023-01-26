package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class ArraysExerciseTest {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    /**
     * e.g.
     * int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
     * numbers[?]
     *
     * numbers[?] = #
     */

    @Test
    public void learn_Inserting_And_Retrieving() {
        System.out.println("Retrieving the second element: " + numbers[1]);
        numbers[2] = 20;
        System.out.println("Inserting a new value at the second element: " + numbers[1]);
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
        System.out.println("Searching for the number 4: " + Arrays.binarySearch(numbers, 4));
        Arrays.sort(numbers);
        System.out.println("Sorting the array using sort method: " + Arrays.toString(numbers));
        Arrays.parallelSort(numbers);
        System.out.println("Sorting the array using parallelSort method: " + Arrays.toString(numbers));
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
        System.out.println("Searching for the number 4: " + Arrays.binarySearch(numbers, 4));
        Arrays.sort(numbers);
        System.out.println("Sorting the array using sort method: " + Arrays.toString(numbers));
        Arrays.parallelSort(numbers);
        System.out.println("Sorting the array using parallelSort method: " + Arrays.toString(numbers));
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
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = Arrays.asList(nums);
        System.out.println("Converting array to list: " + list);
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Comparing if two arrays are equal: " + Arrays.equals(numbers, numbers2));
        Arrays.fill(numbers, 20);
        System.out.println("Filling the array with the value 20: " + Arrays.toString(numbers));
    }
}
