package Collection;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import java.util.Arrays;

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
        Arrays.binarySearch(numbers,4);
        Arrays.sort(numbers);
        Arrays.sort(numbers,0,5);
        Arrays.parallelSort(numbers);


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
        int[] copy=Arrays.copyOf(numbers,5);
        for(int i=0;i<copy.length;i++){
            System.out.println(copy[i]);
        }
        int[]copy1=Arrays.copyOfRange(numbers,2,4);
        for(int i=0;i<copy1.length;i++){
            System.out.println(copy1[i]);
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
        int[] numbers1= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] numbers2= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
       List<int[]> list=Arrays.asList(numbers1);
//        List<int[]> list = Arrays.asList(numbers1);
        Arrays.equals(numbers1,numbers2);
        Arrays.fill(numbers1,100);

    }
}
