package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.*;
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
        TreeMap<Integer,String> mp = new TreeMap<>();
        mp.put(1,"abc");
        mp.put(2, "bcd");
        System.out.println(mp.get(1));
        System.out.println(mp.firstKey());
        System.out.println(mp.lastKey());
        if(mp.containsKey(2)) System.out.println("found key");
        System.out.println(mp.getOrDefault(3, "sss"));
        HashMap<Integer,String>mp1 = new HashMap<>();
        mp1.putAll(mp);
        System.out.println(mp1.values());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<Integer,String>mp = new TreeMap<>();
        mp.put(1,"abc");
        mp.put(2, "bcd");
        mp.replace(1, "ssss");
        mp.remove(2);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
    }
}
