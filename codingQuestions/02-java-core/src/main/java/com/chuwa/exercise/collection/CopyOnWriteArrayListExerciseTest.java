package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
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

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(1,2);
        list.addIfAbsent(3);
        ArrayList<Integer> arr = new ArrayList<Integer>(4);

        // using add() to initialize values
        // [1, 2, 3, 4]
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        list.addAllAbsent(arr);
        System.out.println(list);
    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     *
     *
     * It is very safe to remove elements from ArrayList while iterating using Iterator.
     * But we can't use CopyOnWriteArrayList's iterator to remove element while iterating.
     */

    @Test
    public void learn_Iterator() {
        List<String> cowalStars =
                new CopyOnWriteArrayList<>();

        // adding elements to CopyOnWriteArrayList
        cowalStars.add("Super Star");
        cowalStars.add("Ultimate Star");
        cowalStars.add("Rock Star");
        cowalStars.add("Little Star");

        System.out.println("Iterating using enhanced for-loop:\n");

        // iterating CopyOnWriteArrayList using enhanced for-loop
        for(String star : cowalStars) {
            System.out.println(star);
        }
        System.out.println("\n1st: Iteration of COWAL "
                + "completed... !!\n\n");

        System.out.println("\n\n2nd: Iterating and removing:\n");

        // iterating CopyOnWriteArrayList using Iterator
        Iterator<String> itr = cowalStars.iterator();
        while(itr.hasNext()){

            String star = itr.next();

            if(star.contains("Super")){
                itr.remove();
            }
            else{
                System.out.println(star);
            }
        }
    }
}
