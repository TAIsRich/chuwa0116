package com.chuwa.exercise.collection;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest<E> extends ArrayList<E> {
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(1));
        System.out.println(cars.size());
        ArrayList<String> list = new ArrayList<>();
        list.add("Honda");
        list.addAll(cars);
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
        //remove
        ArrayListExerciseTest<String> cars = new ArrayListExerciseTest<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Honda");
        System.out.println(cars);
        cars.remove(0);
        System.out.println("remove first element: " + cars);
        cars.remove("BMW");
        System.out.println("remove BMW: " + cars);
        cars.removeRange(2,3);
        System.out.println(cars);
        cars.removeAll(cars);
        System.out.println("use removeAll: " + cars);
        cars.add("Honda");
        System.out.println(cars);
        cars.clear();
        System.out.println("use clear() to clear element in cars: " + cars);

        //update
        cars.add("BMW");
        cars.set(0, "Benz");
        System.out.println(cars);
        cars.replaceAll(c -> c.toUpperCase());
        System.out.println(cars);

        //check
        System.out.println(contains("Benz"));
        System.out.println(cars.indexOf("N"));
        System.out.println(cars.indexOf("BENZ"));
        cars.add("zzz");
        System.out.println(cars.lastIndexOf("zzz"));
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
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        Iterator<String> it = sites.iterator();
        System.out.println(it.hasNext());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //cannot use it for remove, because it does not have next, we have to new another it1;
        Iterator<String> it1 = sites.iterator();
//        System.out.println(it == it1);
        while (it1.hasNext()) {
            String i = it1.next();
            if (i == "Runoob") {
                it1.remove();
            }
        }
        System.out.println(sites);
        Iterator<String> it2 = sites.iterator();
        it2.forEachRemaining(i -> {
            System.out.println(i);
        });
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(10);
        list.add(2);
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
