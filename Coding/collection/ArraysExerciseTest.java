package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println(values[2]);
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
        int[] values = new int[]{ 8, 2, 3, 7, 5, 6, 7, 5, 9, 16 };
        Arrays.binarySearch(values, 5);
        Arrays.sort(values, 2, 6);

        for (int i = 0; i<values.length; i++){
            System.out.println(values[i]);
        }

        Arrays.parallelSort(values);
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
        int[] values = new int[]{ 8, 2, 3, 7, 5, 6, 7, 5, 9, 16 };
        int[] valuesCopy1 = Arrays.copyOf(values, values.length);
        for (int i = 0; i<valuesCopy1.length; i++){
            System.out.println(valuesCopy1[i]);
        }
        int[] valuesCopy2 = Arrays.copyOfRange(values, 0, 6);
        for (int i = 0; i<valuesCopy2.length; i++){
            System.out.println(valuesCopy2[i]);
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
        int[] values = new int[]{ 8, 2, 3, 7, 5, 6, 7, 5, 9, 16 };

        List<Integer> l = new ArrayList<>();
        for (int value:values){
            l.add(value);
        }

        Arrays.fill(values, 100);
        for (int i = 0; i<l.size(); i++){
            System.out.println(l.get(i));
        }
    }
}
