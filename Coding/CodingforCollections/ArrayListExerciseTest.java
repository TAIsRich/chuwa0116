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
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        int num = list.get(0);
        int size = list.size();
        ArrayList<Integer> another = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.addAll(another);
        int afterSize = list.size();

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
        //remove
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 99, 100));
        list.remove(list.size()-1);
        list.remove((Object)99);
        list.removeAll(list);

        //update
        list.add(1);
        list.add(12);
        list.add(122);
        list.add(12222);
        list.set(0, 88);
        list.set(1, 86);
        list.replaceAll(l1 -> l1 + 100);

        //check:
        boolean check1 = list.contains(188);
        int check2 = list.indexOf(list.size()-1);
        int check3 = list.lastIndexOf(186);
        System.out.println(check3);


    }
    public class removeRangeOfArrayList extends ArrayList{
        public void learn_remove_range(){
            removeRangeOfArrayList list1 = new removeRangeOfArrayList();
            list1.add(99);
            list1.add(100);
            list1.add(101);
            list1.add(102);
            list1.removeRange(0, 2);
        }
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
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 99, 100));
        Iterator it = list.iterator();
        while(it.hasNext()){
            int num = (int)it.next();
            if(num == 99){
                it.remove();
            }
        }
        it.forEachRemaining(num -> System.out.println(num));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(88, 1, 22, 13, 46, 5, 99, 100));
        list1.sort(Integer::compareTo);

        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(88, 1, 22, 13, 46, 5, 99, 100));
        Collections.sort(list2);
        Collections.sort(list2, Comparator.reverseOrder());

    }
}
