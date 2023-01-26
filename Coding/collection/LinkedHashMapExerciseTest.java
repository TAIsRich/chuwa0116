package com.chuwa.exercise.collection;

import org.junit.Test;

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
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

        lhm.put("one", 1);
        lhm.put("two", 2);
        lhm.put("four", 3);
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
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

        lhm.put("one", 1);
        lhm.put("two", 2);
        lhm.put("four", 3);
        lhm.remove("one");
        lhm.compute("two",(key, val)->  (val == null)? 1: val + 5);
    }
}