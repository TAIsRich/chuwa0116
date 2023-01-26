package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
        Map<Integer, Integer> map = new TreeMap<>();
        map.putIfAbsent(1, 2);
        map.putIfAbsent(2, 3);
        map.putIfAbsent(1, 3);
        System.out.println(map.get(1));
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        Map<Integer, Integer> map = new TreeMap<>();
        map.putIfAbsent(1, 2);
        map.putIfAbsent(2, 3);
        map.replace(1, 3);
        System.out.println(map.get(1));
        map.compute(1, (key, value) -> value = value + 1);
        System.out.println(map.get(1));
    }
}
