package com.chuwa.exercise.collection;

import org.junit.Test;

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
        int[] values = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(values[6]);
        System.out.println(values[8]);
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
        int[] arr = new int[]{ 43,523,21,423,4,325,43,2332,12,321,31 };
        Arrays.binarySearch(arr, 5);
        Arrays.sort(arr, 2, 6);

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        Arrays.parallelSort(arr);
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
        int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9 };
        int[] arr1 = Arrays.copyOf(arr);
        for (int i = 0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        int[] arr2 = Arrays.copyOf(values, 0, 6);
        for (int i = 0; i<arr2.length; i++){
            System.out.println(arr2[i]);
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
        int[] arr = new int[]{ 8, 2, 3, 7, 5, 6, 7, 5, 9, 16 };
        List<Integer> ls = Arrays.asList(arr);
        Arrays.fill(arr, 3);
        for (int i = 0; i<ls.size(); i++){
            System.out.println(ls.get(i));
        }
    }
}
