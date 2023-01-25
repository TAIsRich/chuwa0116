package collections;


import org.junit.Test;

import java.util.*;

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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("List Content: " + list.get(0) + list.get(1) + list.get(2));

        System.out.println("List Size: " + list.size());

        list.addAll(new ArrayList<Integer>(Arrays.asList(3, 4, 5)));

        System.out.println("New List Size: " + list.size());
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
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.remove(0);
        Integer a = 1;
        list.remove(a);

//        ((ArrayList<Integer>) list).removeRange(0, 2);

        list.set(1, 10);
        list.contains(6);
        list.indexOf(4);
        list.lastIndexOf(6);

        list.clear();

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

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("Print using forEachRemaining");
        iterator = list.iterator();
        iterator.forEachRemaining(System.out::println);
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(10);
        list.add(1);
        list.add(9);
        list.add(4);

        Collections.sort(list, Comparator.comparingInt(a -> a));
        for (int num : list)
            System.out.println(num);

        System.out.println("reverse order");
        Collections.sort(list, Comparator.reverseOrder());
        for (int num : list)
            System.out.println(num);
    }
}
