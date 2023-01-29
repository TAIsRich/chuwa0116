package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        Map<String, Integer> map = new HashMap<>();
        map.put("Lucy", 1);
        map.putIfAbsent("Band", 0);
        Map<String, Integer> another = new HashMap<>();
        another.put("super", 2);
        another.put("purple", 3);
        map.putAll(another);

        int get1 = map.get("Lucy");
        int get2 = map.getOrDefault("Lucy", 100);

        boolean check1 = map.containsKey("Lucy");
        boolean check2 = map.containsKey("rain");
        boolean check3 = map.containsValue(102);

        Set<String> keys = map.keySet();
        Collection values = map.values();
        boolean ifEmpty = map.isEmpty();
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
        Map<String, Integer> map = new HashMap<>();
        map.put("band", 0);
        map.put("Lucy", 1);
        map.put("purple", 2);
        map.put("rain", 3);

        //replace
        map.replace("rain", 3, 5);
        map.replace("purple", 6);
        map.replaceAll((key, value) -> value + 100);

        //remove
        map.remove("rain");
        map.remove("band", 100);
        //compute
        map.compute("Lucy", (key, value) -> value + 66);
        map.computeIfAbsent("rain", value -> 222);
        map.computeIfAbsent("mone", value -> 206);
        map.computeIfPresent("Lucy", (key, value) -> value + 11);
    }
}
