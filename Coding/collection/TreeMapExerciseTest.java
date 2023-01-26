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
        TreeMap<Integer, String> tree_map
                = new TreeMap<Integer, String>();
        TreeMap<Integer, String> tree_map1
                = new TreeMap<Integer, String>();

        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map1.put(20, "Geeks");
        tree_map1.put(25, "Welcomes");
        tree_map.putIfAbsent(30, "You");
        tree_map.putAll(tree_map1);
        tree_map.get(10);
        System.out.println(tree_map.containsKey(10));
        System.out.println((tree_map.containsValue("Geeks")));
        System.out.println(tree_map.keySet());
        System.out.println(tree_map.values());
        System.out.println((tree_map.isEmpty()));

    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<Integer, String> tree_map
                = new TreeMap<Integer, String>();
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.replace(10, "Geeks");
        tree_map.replace(15, "4","123");
        tree_map.remove(10);

    }
}
