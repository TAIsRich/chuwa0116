import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author b1go
 * @date 6/12/22 4:45 PM
 */
public class LinkedListExerciseTest {

  /**
   * e.g. List<Integer> list = new LinkedList<Integer>(); Inserting: add(E e) or addLast(E e)
   * addFirst(E e) add(int index, E element) addAll(Collection c) addAll(int index, Collection c)
   *
   * <p>Retrieving: getFirst() getLast() get(int index)
   */
  @Test
  public void learn_Inserting_And_Retrieving() {
    LinkedList<Integer> l = new LinkedList<>();
    l.add(0);
    l.add(1);
    l.addLast(4);
    l.addFirst(-1);
    l.add(3, 2);
    List<Integer> l1 = new LinkedList<>(Arrays.asList(5, 6));
    List<Integer> l2 = new LinkedList<>(Arrays.asList(7, 8));
    l.addAll(l1);
    l.addAll(0, l2);
    System.out.println(l);

    System.out.println(l.getFirst());
    ;
    System.out.println(l.getLast());
    System.out.println(l.get(2));
  }

  /**
   * removeFirst() removeLast() remove(int index) remove(Object o) removeLastOccurrence()
   *
   * <p>sort()
   */
  @Test
  public void learn_Remove_Sort() {
    LinkedList<Double> l = new LinkedList<>(Arrays.asList(0.3, 0.2, 0.1, 0.5, 0.4));
    l.sort(Comparator.naturalOrder());
    System.out.println(l);
    l.removeFirst();
    System.out.println(l);
    l.removeLast();
    System.out.println(l);
    l.remove(1);
    System.out.println(l);
    l.remove(0.4);
    System.out.println(l);
    l.removeLastOccurrence(0.3);
    System.out.println(l);
  }
}
