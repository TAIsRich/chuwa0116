package collection;

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
        list.add(4);
        list.add(5);
        System.out.println(list.get(2));
        System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);
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

        list.remove(2);
        list.remove(Integer.valueOf(2));
        System.out.println(list);

        list.removeAll(list);
        System.out.println(list.size());

        list.add(1);
        list.add(2);
        list.add(3);
        list.clear();
        System.out.println(list.size());

        list.add(1);
        list.add(2);
        list.add(3);
        list.set(1, 3);
        list.replaceAll(e -> e * 2);
        System.out.println(list);

        System.out.println(list.contains(6));
        System.out.println(list.indexOf(6));
        System.out.println(list.lastIndexOf(6));
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

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int x = it.next();
            System.out.println(x);
            if (x == 3) {
                it.remove();
            }
        }

        it = list.iterator();
        it.forEachRemaining(e -> System.out.println(e));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(3);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
