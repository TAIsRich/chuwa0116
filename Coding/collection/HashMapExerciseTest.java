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
        map.put("book1",1);
        map.put("book2",2);
        map.putIfAbsent("book3",3);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("book1",1);
        map2.put("book2",2);
        map2.putIfAbsent("book3",3);
        map.putAll(map2);
        map.get("book1");
        map.getOrDefault("book4", 100);
        map.containsKey("book2");
        map.containsValue(4);
        map.keySet();
        map.values();
        map.isEmpty();
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
        map.put("book1",1);
        map.put("book2",2);
        map.putIfAbsent("book3",3);
        map.replace("book1", 1, 5);
        map.replace("book1",  6);
        map.replaceAll((k,v) -> v+3);
        map.remove("book1");
        map.remove("book2",2);
        map.compute("book3", (key, val)
                -> (val == null)
                ? 1
                : val + 1);
        map.computeIfAbsent("book3", key
                -> 100);
        map.computeIfPresent("book3", (key, val)
                -> val+100);

    }
}
