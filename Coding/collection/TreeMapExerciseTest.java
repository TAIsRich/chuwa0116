package com.chuwa.exercise.collection;

import org.junit.Test;

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
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        map.putIfAbsent("strawberry", 4);

        System.out.println(map.get("apple")); // 1
        System.out.println(map.firstKey()); // apple
        System.out.println(map.lastKey()); // strawberry

        System.out.println(map.containsKey("orange")); // true
        System.out.println(map.containsValue(2)); // true

        System.out.println(map.keySet()); // [apple, banana, orange, strawberry]
        System.out.println(map.values()); // [1, 2, 3, 4]
        System.out.println(map.isEmpty()); // false
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        map.putIfAbsent("strawberry", 4);

        map.replace("banana", 2, 5);
        System.out.println(map.get("banana")); // 5
        map.replace("orange", 4);
        System.out.println(map.get("orange")); // 4

        map.remove("strawberry");
        System.out.println(map.containsKey("strawberry")); // false
    }
}
