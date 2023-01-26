package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

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
        HashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        HashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.putAll(map);
        System.out.println(map);
        System.out.println(map2);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.isEmpty());


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
        HashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        map.replace("one", 100);
        map.replace("two",2,200);
        map.replaceAll((key, value) -> value * 10);
        map.remove("one");

        map.compute("three", (key, val) -> val + 1);
        System.out.println(map);
    }
}
