package collection;

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
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(a[2]);
        a[2] = 200;
        System.out.println(a[2]);
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
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.binarySearch(a, 4));

        int[] b = { 10, 9, 3, 4, 5, 6, 7 };
        Arrays.sort(b);
        for (int n : b) {
            System.out.print(n + " ");
        }

        System.out.println();
        int[] c = { 10, 9, 3, 4, 5, 6, 7 };
        Arrays.sort(c, 0, 2);
        for (int n : c) {
            System.out.print(n + " ");
        }

        System.out.println();
        int[] d = { 10, 9, 3, 4, 5, 6, 7 };
        Arrays.parallelSort(d);
        for (int n : d) {
            System.out.print(n + " ");
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
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = Arrays.copyOf(a, 5);
        System.out.println();
        for (int n : b) {
            System.out.print(n + " ");
        }

        int[] c = Arrays.copyOfRange(a, 3, 5);
        System.out.println();
        for (int n : b) {
            System.out.print(n + " ");
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
        List<Integer> list = Arrays.asList(1, 2, 3);

        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.equals(a, b));

        Arrays.fill(a, 20);
        System.out.println();
        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}
