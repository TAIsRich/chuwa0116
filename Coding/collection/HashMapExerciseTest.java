package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

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

        // Inserting
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Retrieving
        System.out.println("Value of key 'one': " + map.get("one"));
        System.out.println("Value of key 'two': " + map.get("two"));
        System.out.println("Value of key 'three': " + map.get("three"));

        // putIfAbsent
        map.putIfAbsent("four", 4);
        System.out.println("Value of key 'four': " + map.get("four"));
        map.putIfAbsent("four", 5);
        System.out.println("Value of key 'four': " + map.get("four"));

        // putAll
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("five", 5);
        anotherMap.put("six", 6);
        map.putAll(anotherMap);
        System.out.println("Value of key 'five': " + map.get("five"));
        System.out.println("Value of key 'six': " + map.get("six"));

        // getOrDefault
        System.out.println("Value of key 'seven': " + map.getOrDefault("seven", 7));

        // containsKey
        System.out.println("Map contains key 'one': " + map.containsKey("one"));
        System.out.println("Map contains key 'seven': " + map.containsKey("seven"));

        // containsValue
        System.out.println("Map contains value 1: " + map.containsValue(1));
        System.out.println("Map contains value 7: " + map.containsValue(7));

        // keySet
        System.out.println("Keys in map: " + map.keySet());

        // values
        System.out.println("Values in map: " + map.values());

        // isEmpty
        System.out.println("Map is empty: " + map.isEmpty());
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
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // replace
        map.replace("two", 4);
        System.out.println("Value of key 'two': " + map.get("two"));
        map.replace("four", 4);
        System.out.println("Value of key 'four': " + map.get("four"));

        // replaceAll
        map.replaceAll((k, v) -> v + 1);
        System.out.println("Values in map: " + map.values());

        // remove
        map.remove("two");
        System.out.println("Value of key 'two': " + map.get("two"));

        // remove(Object key, Object value)
        map.put("two", 2);
        map.remove("two", 3);
        System.out.println("Value of key 'two': " + map.get("two"));
        map.remove("two", 2);
        System.out.println("Value of key 'two': " + map.get("two"));

        // compute
        map.compute("one", (k, v) -> v + 1);
        System.out.println("Value of key 'one': " + map.get("one"));

        // computeIfAbsent
        map.computeIfAbsent("four", k -> 4);
        System.out.println("Value of key 'four': " + map.get("four"));

        // computeIfPresent
        map.computeIfPresent("four", (k, v) -> v + 1);
        System.out.println("Value of key 'four': " + map.get("four"));
        map.remove("four");
        map.computeIfPresent("four", (k, v) -> v + 1);
        System.out.println("Value of key 'four': " + map.get("four"));
    }
}
