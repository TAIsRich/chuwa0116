package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class TreeMapExerciseTest {

    /**
     * e.g.
     * TreeMap<String, Integer> map = new TreeMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * firstKey()
     * lastKey()
     *
     * containsKey(Object key)
     * containsValue(Object value)
     *
     * keySet()
     * values()
     * isEmpty()
     */

    @Test
    public void learn_Inserting_And_Retrieving() {
        TreeMap<Integer, String> mp1 = new TreeMap<>();
        mp1.put(1, "a");
        mp1.putIfAbsent(2, "b");
        TreeMap<String, Integer> mp2 = new TreeMap<>();
        mp2.put(1, "a");
        mp2.put(3, "c");

        mp2.putAll(mp1);
        System.out.println(mp1.get(1));
        System.out.println(mp2.firstKey());
        System.out.println(mp2.lastKey());
        System.out.println(mp2.containsKey(2));
        Set<String> keys = mp2.keySet();
        System.out.println(mp2.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(1, "a");
        mp.putIfAbsent(2, "b");
        mp.putIfAbsent(3, "c");
        mp.replace(3, "d");
        mp.remove(2);
        System.out.println(mp.isEmpty());
    }
}
