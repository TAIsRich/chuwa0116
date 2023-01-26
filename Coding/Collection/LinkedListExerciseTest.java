package Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:45 PM
 */
public class LinkedListExerciseTest {

    /**
     * e.g.
     * List<Integer> list = new LinkedList<Integer>();
     * Inserting:
     * add(E e) or addLast(E e)
     * addFirst(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addAll(int index, Collection c)
     *
     * Retrieving:
     * getFirst()
     * getLast()
     * get(int index)
     *
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        LinkedList<String> cars = new LinkedList<String>();
        LinkedList<String> cars1 = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.addLast("BB");
        cars.addFirst("AA");
        cars.add(0,"CC");
        cars1.add("DD");
        cars.addAll(cars1);
        cars1.add("EE");
        cars.addAll(0,cars1);
        System.out.println(cars);
        String first=cars.getFirst();
        String last=cars.getLast();
        System.out.println("first: "+first);
        System.out.println("last: "+last);
        System.out.println(cars.get(3));

    }

    /**
     * removeFirst()
     * removeLast()
     * remove(int index)
     * remove(Object o)
     * removeLastOccurrence()
     *
     * sort()
     */

    @Test
    public void learn_Remove_Sort() {
        LinkedList<String> cars = new LinkedList<String>();
//        LinkedList<String> cars1 = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("1");
        cars.add("2");
        cars.add("3");
        cars.removeFirst();
        System.out.println(cars);
        cars.removeLast();
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);
        cars.remove("3");
        System.out.println(cars);
        cars.removeLastOccurrence("2");
        System.out.println(cars);
        Collections.sort(cars, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(cars);


    }
}
