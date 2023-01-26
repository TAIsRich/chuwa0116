import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class CopyOnWriteArrayListExerciseTest {

    /**
     * e.g.
     * List list = new CopyOnWriteArrayList();
     *
     * add(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addIfAbsent(E e)
     * addAllAbsent(Collection c)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        List<Integer> list = new CopyOnWriteArrayList<Integer>();
        list.add(88);
        list.add(1, 89);
        list.addAll(new ArrayList(Arrays.asList(1, 2, 3, 4, 6, 8)));
        ((CopyOnWriteArrayList<Integer>) list).addIfAbsent((Integer)9);
        ((CopyOnWriteArrayList<Integer>) list).addAllAbsent(new ArrayList(Arrays.asList(1, 2, 32, 4, 68, 8)));
        for(Integer num : list){
            System.out.println(num);
        }

    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     */

    @Test
    public void learn_Iterator() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //Created an iterator
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //can not remove items by using iterator
        for(String str : list){
            if(str.equals("Banana")){
                list.remove(str);
            }
        }
        System.out.println(list.toString());


    }
}
