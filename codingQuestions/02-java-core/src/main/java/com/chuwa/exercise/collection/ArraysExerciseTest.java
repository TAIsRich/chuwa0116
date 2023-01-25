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
        System.out.println(numbers[1]);
        numbers[1] = -1;
        for(int i = 0; i < numbers.length; ++i){
            System.out.printf(numbers[i]+" ");
        }

    }

    /**
     * binarySearch():  the index of the first element greater than the key
     *                  not found : return value < 0
     * e.g.
     * Arrays.binarySearch(numbers, 4);
     *
     * sort(array)
     * sort(array, fromIndex, toIndex)
     * e.g.
     * Arrays.sort(numbers);
     *
     * Arrays.parallelSort(numbers): parallel quick sort
     */
    @Test
    public void learn_search_and_sort() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = Arrays.binarySearch(numbers, 4);
        System.out.println(target);


        target = Arrays.binarySearch(numbers, 11);
        System.out.println(target);
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
        int[] copy = Arrays.copyOf(numbers, 5); //start from 0, len = 5
        for(int i = 0; i < copy.length; ++i){
            System.out.printf(copy[i]+" ");
        }
        System.out.println();
        int[] copy2 = Arrays.copyOfRange(numbers, 2, 5); //start from 2, end = 5
        for(int i = 0; i < copy2.length; ++i){
            System.out.printf(copy2[i]+" ");
        }

    }

    /**
     * asList()
     * e.g.
     * List<Integer> list = Arrays.asList(numbers);
     *
     * equals(): if two array contains same elements
     * e.g.
     * Arrays.equals(numbers1, numbers2);
     *
     * fill(): assign each element of the array to the value
     * e.g.
     * Arrays.fill(numbers, 20);
     *
     */

    @Test
    public void learn_common_operations() {
        String a[] = new String[]{"abc","klm","xyz","pqr"};

        List list1 = Arrays.asList(a);
        System.out.println("The list is:" + list1);

        String b[] = new String[]{"abc","klm","xyz","pqr"};
        System.out.println(Arrays.equals(a, b));

        Arrays.fill(a, "1111");
        for(int i = 0; i < a.length; ++i){
            System.out.printf(a[i] +" ");
        }
    }
}
