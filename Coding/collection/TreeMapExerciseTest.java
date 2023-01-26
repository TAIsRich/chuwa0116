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
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

        tree_map.put(10, "hello");
        tree_map.put(15, "chuwa");
        tree_map.put(20, "world");
        tree_map.put(25, "sky");
        tree_map.put(30, "fall");
        System.out.println(tree_map.containsKey(10));
        System.out.println(tree_map.firstEntry());
        System.out.println(tree_map.lastKey());
        System.out.println(tree_map.keySet());
        System.out.println(tree_map.values());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

        tree_map.put(10, "hello");
        tree_map.put(15, "chuwa");
        tree_map.put(20, "world");
        tree_map.put(25, "sky");
        tree_map.put(30, "fall");

        tree_map.replace(10,"hello","goodbye");
        System.out.println(tree_map.values());
    }
}
