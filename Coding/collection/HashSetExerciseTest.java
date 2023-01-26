package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class HashSetExerciseTest {
    /**
     * e.g.
     * Set<Integer> set= new HashSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * get()
     * contains()
     *
     * remove(Object o)
     * clear()
     *
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        Set<String> st = new HashSet<>();
        st.add("1");
        st.add("2");
        st.add("3");
        System.out.println(st.size());

        st.remove("3");
        System.out.println(st.size());
        System.out.println(st.contains("3"));

        st.clear();
        System.out.println(st.isEmpty());
    }
}
