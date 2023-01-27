package com.chuwa.exercise.collection;

import org.junit.Test;

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
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        map.putIfAbsent(5, 500);

        TreeMap<Integer, Integer> map2 = new TreeMap<>();
        map2.put(6, 600);

        map.putAll(map2);

        int val = map.get(6);
        int firstKey = map.firstKey();
        int lastKey = map.lastKey();

        boolean contains = map.containsKey(7);
        boolean containsVal = map.containsValue(700);

        Set<Integer> keys = map.keySet();
        Collection<Integer> vals = map.values();
        boolean empty = map.isEmpty();
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);

        map.replace(1, 100, 10);
        map.replace(2, 20);
        map.remove(3);
    }
}
