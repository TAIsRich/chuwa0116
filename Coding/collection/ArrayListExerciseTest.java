package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

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
        List<Integer> fibo = new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        fibo.add(2);
        fibo.add(3);
        fibo.add(5);
        fibo.add(8);

        List<Integer> fibo2 = new ArrayList<>();
        fibo2.addAll(fibo);
        for (int i = 0; i<fibo2.size(); i++){
            System.out.println(fibo2.get(i));
        }


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
        List<String> animals = new ArrayList<>();
        animals.add("rabbit");
        animals.add("snake");
        animals.add("elephant");
        animals.add("monkey");
        animals.add("chicken");

        System.out.println(animals.size());

        animals.remove(0);
        System.out.println(animals.size());

        animals.remove("monkey");
        System.out.println(animals.size());

        animals.clear();




        animals.set(2, "duck");
        System.out.println(animals.contains("duck"));
        System.out.println(animals.indexOf("elephant"));

        animals.add("snake");
        animals.add("snake");

        System.out.println(animals.lastIndexOf("elephant"));

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
        List<Integer> testArray = new ArrayList<>();
        testArray.add(2);
        testArray.add(9);
        testArray.add(7);
        testArray.add(5);

        Iterator<Integer> it = testArray.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {

        List<Integer> testArray = new ArrayList<>();
        testArray.add(2);
        testArray.add(9);
        testArray.add(7);
        testArray.add(5);

        Collections.sort(testArray);

        Collections.reverse(testArray);

        for (int i = 0; i<testArray.size(); i++){
            System.out.println(testArray.get(i));
        }
    }
}
