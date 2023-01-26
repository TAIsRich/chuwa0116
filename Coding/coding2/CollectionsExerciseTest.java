import org.junit.Test;

import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class CollectionsExerciseTest {

  /**
   * Collections.min(list)) min(Collection c, Comparator comp)
   *
   * <p>Collections.max(list) max(Collection c, Comparator comp)
   *
   * <p>frequency(Collection c, object o)
   */
  @Test
  public void learn_common_collections_operations() {
    List<Integer> l = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 0));
    System.out.println(Collections.min(l));
    System.out.println(
        Collections.max(
            l,
            new Comparator<Integer>() {
              @Override
              public int compare(Integer o1, Integer o2) {
                return (-1 * o1) - (-1 * o2);
              }
            }));

    System.out.println(Collections.frequency(l, 0));
  }

  /** synchronizedList() */
  @Test
  public void learn_thread_safe_ArrayList() {
    List<Integer> l = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 0));
    List<Integer> sl = Collections.synchronizedList(l);
    System.out.println(sl);
  }
}
