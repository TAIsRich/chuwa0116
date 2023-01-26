import org.junit.Test;

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
    CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(){{
       add(3);
       add(4);
       add(7);
       add(18);
       add(20);
    }};
    list.add(0,2);
    System.out.println(list);
    list.addAll(Arrays.asList(2,23,12,23));
    list.addIfAbsent(3);
    list.addAllAbsent(Arrays.asList(2,23,12,23));
    System.out.println(list);
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
        boolean flag=false;
        while(itr.hasNext()){
            System.out.println(itr.next());
            if(!flag){
                flag=true;
                //UnsupportedException
                itr.remove();
            }
        }
    }
}
