package com.chuwa.exercise.collection;

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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println("Elements of the list: " + list.get(0) + list.get(1));
        System.out.println("The size of the list: " + list.size());
        list.addAll(new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6)));
        System.out.println("The size of the new list: " + list.size());
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
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);
        ((ArrayList<Integer>) list).removeRange(0, 2);

        list.set(1, 10);
        list.contains(3);
        list.indexOf(2);
        list.lastIndexOf(3);

        list.clear();
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
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        iter2 = list.iterator();
        iter2.forEachRemaining(System.out::println);
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(100);
        list.add(5);

        Collections.sort(list, Comparator.comparingInt(a -> a));
        for (int num : list)
            System.out.println(num);

        Collections.sort(list, Comparator.reverseOrder());
        for (int num : list)
            System.out.println(num);
    }
}
