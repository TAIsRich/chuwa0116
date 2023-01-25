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
        List<Integer> Ls = new ArrayList<>();
        fibo.add(1);
        fibo.add(3);
        fibo.add(2);


        List<Integer> Ls2 = new ArrayList<>();
        fibo2.addAll(fibo);
        for (int i = 0; i<Ls2.size(); i++){
            System.out.println(Ls2.get(i));
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
        List<String> Ls = new ArrayList<>();
        Ls.add("Mac");
        Ls.add("Pc");


        System.out.println(Ls.size());

        animals.remove(0);
        System.out.println(Ls.size());

        animals.remove("Pc");
        System.out.println(Ls.size());

        animals.clear();


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
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        Iterator<Integer> it = arr.iterator();
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
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        Collections.sort(arr);

        Collections.reverse(arr);

        for (int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
