import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest {
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(1);
        list.add(2);
        Integer x = list.get(0);
        int size = list.size();
        ArrayList<Integer> list1 = new ArrayList<>(8);
        for (int i = 3; i <= 10; i++){
            list1.add(i);
        }
        list.addAll(list1);
        list.forEach(System.out::println);
    }
    /**
     * remove(int index)
     * remove(Object o)
     * removeRange(int fromIndex, int toIndex)
     * removeAll(Collection<?> c)
     * clear()
     *
     * Update:
     * set(int index, E e)
     * replaceAll(UnaryOperator<E> operator)
     *
     * check:
     * contains(Object o)
     * indexOf(Object o)
     * lastIndexOf(Object o)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//        list.forEach(System.out::println);
        list.remove(0);
//        list.forEach(System.out::println);
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 4));
        list.removeAll(list1);
//        list.forEach(System.out::println);
        list.clear();
        list.add(1);
        list.set(0, 10);
//        list.forEach(System.out::println);

        System.out.println(list.contains(1));
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));
        list.add(10);
        System.out.println(list.lastIndexOf(10));

    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     * forEachRemaining(Consumer<? super E> action) -- from Java8
     */

    @Test
    public void learn_Iterator() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("is");
        list.add("a");
        list.add("CS");
        list.add("Students");
        list.add("Portal");

        System.out.println("The list is: \n"
                + list);

        Iterator<String> iterator = list.iterator();

        System.out.println("\nThe iterator values"
                + " of list are: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 9, 2, 7, 6));
        Collections.sort(list);
        list.forEach(System.out::println);
        Collections.sort(list, Comparator.reverseOrder());
        list.forEach(System.out::println);
    }
}