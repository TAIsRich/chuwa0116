package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class HashMapExerciseTest {

    /**
     * e.g.
     * Map<String, Integer> map = new HashMap<>();
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
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 10);
        map.put("2", 30);
        map.put("3", 20);
        map.putIfAbsent("no",90);
        System.out.println(map.get("1"));
        System.out.println(map.keySet());
        System.out.println(map.values());

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
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 10);
        map.put("2", 30);
        map.put("3", 20);
        map.replace("3",20,200);
        map.remove("1");
        map.compute("2",(key, val)->  (val == null)? 1: val + 5);
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}
