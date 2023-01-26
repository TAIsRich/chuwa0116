import org.junit.Test;

import java.util.*;
import java.util.function.UnaryOperator;

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
    list.add(3);
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.addAll(Arrays.asList(1,23,2));
        System.out.println(list);
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
        ArrayList<Integer> list = new ArrayList<Integer>(){{
           add(3);
           add(6);
           add(28);
           add(600);
           add(333);
        }};
        list.remove(list.size()-1);
        list.remove(3);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<Integer>(){{
            add(3);
            add(6);
        }};
        list.removeAll(list1);
        System.out.println(list);
        list.clear();
        list.add(3);
        list.add(6);
        list.set(0,20);
        list.replaceAll(a->a*2);
        System.out.println(list);
        System.out.println(list.contains(40));
        System.out.println(list.indexOf(40));
        System.out.println(list.lastIndexOf(12));
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
        ArrayList<Integer> list = new ArrayList<Integer>(){{
            add(3);
            add(6);
            add(28);
            add(600);
            add(333);
        }};
        Iterator<Integer> iterator = list.iterator();
        if(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        list.iterator().forEachRemaining(System.out::println);
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> list = new ArrayList<Integer>(){{
            add(3);
            add(6);
            add(28);
            add(600);
            add(333);
        }};
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }
}
