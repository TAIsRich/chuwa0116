package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
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
        TreeMap<Integer, String> treeMap = new TreeMap();

        //Add objects to the TreeMap.
        treeMap.put(4, "Roxy");
        treeMap.put(2, "Sunil");
        treeMap.put(5, "Sandy");
        treeMap.put(1, "Munish");
        treeMap.put(3, "Pardeep");

        //Print the TreeMap object.
        System.out.println("TreeMap elements:");
        System.out.println(treeMap);

        treeMap.putIfAbsent(6, "null");
        System.out.println(treeMap);

        Map treeMap1 = new TreeMap();
        treeMap1.putAll(treeMap);
        System.out.println(treeMap1);

        System.out.println(treeMap.get(3));
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        treeMap1.containsKey(5);
        treeMap1.containsValue("Sandy");

        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());
        System.out.println(treeMap.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<Integer, String> treeMap = new TreeMap();

        //Add objects to the TreeMap.
        treeMap.put(4, "Roxy");
        treeMap.put(2, "Sunil");
        treeMap.put(5, "Sandy");
        treeMap.put(1, "Munish");
        treeMap.put(3, "Pardeep");

        treeMap.remove(4);
        treeMap.replace(5, "ooo");
        treeMap.replace(5, "ooo", "ppp");
        System.out.println(treeMap);

    }
}
