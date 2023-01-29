package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Collection;
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
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("band", 0);
        map.putIfAbsent("Lucy", 1);
        TreeMap<String, Integer> another = new TreeMap<>();
        another.put("purple", 2);
        another.put("rain", 3);
        map.putAll(another);

        //get
        int ans1 = map.get("Lucy");
        String ans2 = map.firstKey();
        String ans3 = map.lastKey();

        //contains
        boolean ans4 = map.containsKey("purple");
        boolean ans5 = map.containsValue(200);
        boolean ans6 = map.containsValue(2);

        Set<String> keys = map.keySet();
        Collection values = map.values();
        boolean ifEmpty = map.isEmpty();
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
        map.put("band", 0);
        map.putIfAbsent("Lucy", 1);

        //replace
        map.replace("band", 0, 100);
        map.replace("Lucy", 200);

        //remove
        map.remove("band");
    }
}
