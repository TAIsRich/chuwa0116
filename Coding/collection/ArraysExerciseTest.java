package Coding.collection;

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
        int[] arr = new int[] {4,5,6,7,8};
        System.out.println(arr[1]);
        arr[2] = 2222;
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
        int[] arr = new int[] {4,5,6,6,6,6,6,6,6,7,8};
        System.out.println(Arrays.binarySearch(arr,6));
        Arrays.sort(arr);
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
        int[] arr1 = new int[] {1,2,3};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        int[] arr3 = Arrays.copyOfRange(arr1, 1,2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
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
        List<Integer> lst1 = Arrays.asList(1,2,3);
        List<Integer> lst2 = Arrays.asList(1, 2, 3);
        List<Integer> lst3 = Arrays.asList(1, 2, 4);
        System.out.println(lst1.equals(lst2));
        System.out.println(lst1.equals(lst3));

        int[] arr3 = new int[10];
        Arrays.fill(arr3, 99);
        System.out.println(Arrays.toString(arr3));

    }
}
