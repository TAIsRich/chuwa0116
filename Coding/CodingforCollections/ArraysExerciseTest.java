import org.junit.Test;

import java.lang.reflect.Array;
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
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int number = num[3];
        num[3] = 100;
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
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.binarySearch(num, 5);
        int[] another = { 1, 22, 3, 46, 5, 66, 7, 82, 9, 10 };
        Arrays.sort(another);
        int[] another2 = { 1, 2, 235, 46, 35, 66, 7, 82, 99, 10 };
        Arrays.parallelSort(another2, 1, 5);
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
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.copyOf(num, num.length);
        Arrays.copyOfRange(num, 0, 6);
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
        List<Integer> another = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int[] num1 = {9, 8, 7, 6, 5};
        int[] num2 = {9, 8, 7, 6, 5};
        boolean ifEqual = Arrays.equals(num1, num2);
        Arrays.fill(num1, 10);
    }
}
