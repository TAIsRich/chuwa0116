import org.junit.Test;

import java.util.Arrays;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class ArraysExerciseTest {

  /**
   * e.g. int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; numbers[?]
   *
   * <p>numbers[?] = #
   */
  @Test
  public void learn_Inserting_And_Retrieving() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(nums[2]);
    nums[0] = -1;
    System.out.println(nums[0]);
  }

  /**
   * binarySearch() e.g. Arrays.binarySearch(numbers, 4);
   *
   * <p>sort(array) sort(array, fromIndex, toIndex) e.g. Arrays.sort(numbers);
   *
   * <p>Arrays.parallelSort(numbers);
   */
  @Test
  public void learn_search_and_sort() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(Arrays.binarySearch(nums, 4));

    Arrays.sort(nums);
    Arrays.sort(nums, 2, 5);
    Arrays.parallelSort(nums);
  }

  /**
   * copyOf() e.g. Arrays.copyOf(numbers, numbers.length);
   *
   * <p>copyOfRange() e.g. Arrays.copyOfRange(numbers, 0, 5);
   */
  @Test
  public void learn_copy_of_array() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int[] t = Arrays.copyOf(nums, 10);

    int[] p = Arrays.copyOfRange(nums, 2, 5);
  }

  /**
   * asList() e.g. List<Integer> list = Arrays.asList(numbers);
   *
   * <p>equals() e.g. Arrays.equals(numbers1, numbers2);
   *
   * <p>fill() e.g. Arrays.fill(numbers, 20);
   */
  @Test
  public void learn_common_operations() {}
}
