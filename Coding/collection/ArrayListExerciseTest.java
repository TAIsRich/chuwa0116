package com.chuwa.exercise.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
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
        ArrayList<String> cars = new ArrayList<String>();
        //add elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        //get elements
        String t=cars.get(0);
        System.out.println(t);
        //get size
        int sz=cars.size();
        System.out.println(sz);
        //addALL
        ArrayList<String> cars1 = new ArrayList<String>();
        cars1.addAll(cars);
        for(int i=0;i<cars1.size();i++){
            System.out.println(cars1.get(i));
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
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.add("Volvo1");
        cars.add("BMW1");
        cars.add("Ford1");
        cars.add("Mazda1");
//        remove(int index)
        cars.remove(0);
//        remove(Object o)
        cars.remove("Ford");
//        cars.removeRange(2,3);
//        removeRange
        cars.subList(1, 3).clear();

//        check
        boolean ans=cars.contains("Ford1");
        if(ans==true){
            System.out.println("yes");
        }
        else System.out.println("no");

//update
        cars.set(2,"???what");
        cars.replaceAll(e->e.toUpperCase());

        System.out.println(cars.indexOf("Mazda1"));
        System.out.println(cars.lastIndexOf("BMW1"));


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
        ArrayList<String> list
                = new ArrayList<>();

        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("is");
        list.add("a");
        list.add("CS");
        list.add("Students");
        list.add("Portal");

        // Displaying the list
        System.out.println("The list is: \n"
                + list);

        // Create an iterator for the list
        // using iterator() method
        Iterator<String> iter
                = list.iterator();


        // Displaying the values after iterating
        // through the list
        System.out.println("\nThe iterator values"
                + " of list are: ");
        while (iter.hasNext()) {
            String i=iter.next();
            if(i=="for") {
                iter.remove();
                break;
            }
        }
       for(String s:list){
           System.out.println(s);
       }
//       forEachRemaining:
        System.out.println("forEachRemaining\n");
        iter.forEachRemaining(e -> System.out.println(e));
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");

        Iterator<String> iterator = fruits.iterator();
        iterator.forEachRemaining((fruit) -> System.out.println(fruit));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Double> testList = new ArrayList();

        testList.add(0.5);
        testList.add(0.2);
        testList.add(0.9);
        testList.add(0.1);
        testList.add(0.1);
        testList.add(0.1);
        testList.add(0.54);
        testList.add(0.71);
        testList.add(0.71);
        testList.add(0.71);
        testList.add(0.92);
        testList.add(0.12);
        testList.add(0.65);
        testList.add(0.34);
        testList.add(0.62);

        Collections.sort(testList);
        for(int i=0;i<testList.size();i++){
            System.out.println(testList.get(i));
        }
        Collections.reverse(testList);
        for(int i=0;i<testList.size();i++){
            System.out.println(testList.get(i));
        }
        //comparator
        ArrayList<Double> l = new ArrayList();
        l.sort(Comparator.naturalOrder());
    }
}
