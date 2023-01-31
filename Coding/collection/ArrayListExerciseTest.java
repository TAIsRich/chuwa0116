package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest<T> extends ArrayList<T> {
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        // get element
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.size());

        List<String> anotherList = new ArrayList<>();
        anotherList.add("four");
        anotherList.add("five");
        list.addAll(anotherList);

        //print list
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
        ArrayListExerciseTest<String> test = new ArrayListExerciseTest();
        for(int i= 0; i < 5; i++){
            test.add(String.valueOf(i));
        }
        test.remove(4);
        test.removeRange(0,2);
        System.out.println(test);

        test.remove("3");
        System.out.println(test);


        // remove all elements from another list
        List<String> another = new ArrayList<>();
        another.add("a");

        test.removeAll(another);
        System.out.println(test);

        // clear the list
        test.clear();
        System.out.println(test);

        test.add("apple");
        test.add("banana");
        test.add("cherry");
        test.set(1, "orange");
        System.out.println(test);

        test.replaceAll(s -> s.toUpperCase());
        System.out.println(test);

        System.out.println(test.contains("orange"));
        System.out.println(test.contains("grape"));

        System.out.println(test.indexOf("orange"));
        System.out.println(test.lastIndexOf("cherry"));
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
        List<String> test = new ArrayList<>();
        test.add("Welcome");
        test.add("To");
        test.add("Chuwa");

        Iterator itr = test.listIterator();
        int i = 0;
        while (itr.hasNext()) {
            // Removing odd elements
            System.out.print(itr.next());
            if (i % 2 != 0){
                itr.remove();
            }

            i++;
        }
        System.out.print(test);
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> test = new ArrayList<>();
        for(int i = 0 ; i < 5; i++){
            test.add(i);
        }
        Collections.sort(test);
        System.out.println(test);
        Collections.sort(test,  Comparator.reverseOrder());
        System.out.println(test);
    }
}
