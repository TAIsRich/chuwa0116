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
        LinkedHashMap<String, String> map1  = new LinkedHashMap<String, String>();

        map1.put("book1","a");
        map1.put("book2", "b");
        map1.putIfAbsent("book3","c");
        map1.get("book1");
        map1.getOrDefault("book1","aaa");
        map1.containsKey("book1");
        map1.containsValue("a");
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.isEmpty());
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
        LinkedHashMap<String, String> map1  = new LinkedHashMap<String, String>();

        map1.put("book1","a");
        map1.put("book2", "b");
        map1.putIfAbsent("book3","c");
        map1.replace("book1","a","c");
        map1.replace("book1", "vv");
        map1.replaceAll((k,v) -> v.concat("a"));
        map1.remove("book1");
        map1.remove("book2","ba");
        map1.compute("book2", (k,v) -> v.concat("a"));
        map1.computeIfAbsent("book4", k -> "abc");
        map1.computeIfPresent("book4", (k,v) -> v.concat("wow"));
    }
}
