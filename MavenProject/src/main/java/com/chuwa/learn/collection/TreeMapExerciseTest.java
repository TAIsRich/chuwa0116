package com.chuwa.learn.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
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
        Map<String, Integer> map = new TreeMap<>();
        map.put("hello", 1);
        map.putIfAbsent("hello2",2);
        map.putIfAbsent("hello1",2);
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map);
        System.out.println(map2);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("England", 1);
        map.put("Germany", 2);
        map.put("Norway", 3);

        map.replace("England",100);
        map.replace("Norway",3,300);

        map.remove("USA");
        map.remove("Germany");

        System.out.println(map);

    }
}