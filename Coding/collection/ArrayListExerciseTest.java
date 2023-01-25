package Coding.collection;

import org.junit.Test;

//import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        List<Integer> lst = new ArrayList<>();
        lst.add(99);
        int idx0ele = lst.get(0);
        int lstLen = lst.size();
        lst.addAll(new ArrayList<>(Arrays.asList(0,1,2,3,4)));
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
        List<Integer> lst = new ArrayList<>(new ArrayList<>(Arrays.asList(0, 11, 22, 33, 4,5,66,77)));
        lst.remove(0);
        lst.remove(Integer.valueOf(4));
        System.out.println(lst); //[11, 22, 33, 5, 66, 77]
//        lst.removeRange(0,1); not working with arraylist
        lst.removeAll(new ArrayList<>(Arrays.asList(66,77)));
        System.out.println(lst); //[11, 22, 33, 5]
        lst.set(0, 110);
        System.out.println(lst);
        lst.replaceAll(s->s+1);
        System.out.println(lst);
        System.out.println(lst.contains(111));
        System.out.println(lst.indexOf(111));
        System.out.println(lst.indexOf(23));
        lst.clear();

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
        List<Integer> lst = new ArrayList<>(Arrays.asList(0, 11, 22, 33, 4,5,66,77));
        Iterator<Integer> it = lst.iterator();
        it.next();
        it.remove();

        while (it.hasNext()){
            Integer temp = it.next();
            System.out.println(temp);
        }
        System.out.println(lst);
        it = lst.iterator();
        it.next();
        it.forEachRemaining(System.out::println);
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        int[] arr = new int[] {5,3,2,6,7,3,5,2,99,7,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = IntStream.of(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i->i)
                .toArray();
        System.out.println(Arrays.toString(arr2));
    }
}
