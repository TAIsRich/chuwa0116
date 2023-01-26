import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class HashSetExerciseTest {
  /**
   * e.g. Set<Integer> set= new HashSet<>();
   *
   * <p>add(E e) addAll(Collection<> c)
   *
   * <p>get() contains()
   *
   * <p>remove(Object o) clear()
   *
   * <p>isEmpty()
   */
  @Test
  public void learn_Inserting_And_Retrieving_Removing() {
    HashSet<Integer> s = new HashSet<>();

    s.add(0);
    List<Integer> l = new ArrayList<>(Arrays.asList(0, 1, 2));
    s.addAll(l);

    System.out.println(s.contains(8));

    s.remove(2);

    s.clear();

    System.out.println(s.isEmpty());
  }
}
