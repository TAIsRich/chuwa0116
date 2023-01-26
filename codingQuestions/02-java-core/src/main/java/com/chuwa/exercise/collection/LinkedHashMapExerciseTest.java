package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class LinkedHashMapExerciseTest {
    /**
     * e.g.
     * HashMap<String, Integer> map = new LinkedHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * getOrDefault(Object key, V defaultValue)
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
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.putIfAbsent(1, 2);
        map.putIfAbsent(2, 3);
        map.putIfAbsent(1, 3);
        System.out.println(map.containsKey(1));
        System.out.println(map.get(1));
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     * replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
     *
     * remove(Object key)
     * remove(Object key, Object value)
     *
     * compute(Key, BiFunction)
     * computeIfAbsent(Key, Function)
     * computeIfPresent(Key, BiFunction)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.putIfAbsent(1, 2);
        map.putIfAbsent(2, 3);
        map.replace(1, 3);
        System.out.println(map.get(1));
        map.compute(1, (key, value) -> value = value + 1);
        System.out.println(map.get(1));
    }
}
