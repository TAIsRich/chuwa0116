package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class LinkedHashMapExerciseTest {
    /**
     * e.g.
     * HashMap<String, Integer> map = new LinkedHashMap<>();
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
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        map.putIfAbsent(5, 500);

        HashMap<Integer, Integer> map2 = new LinkedHashMap<>();
        map2.put(6, 600);

        map.putAll(map2);

        int val = map.get(6);
        int defaultValue = map.getOrDefault(8, 80);

        boolean contains = map.containsKey(7);
        boolean containsVal = map.containsValue(700);

        Set<Integer> keys = map.keySet();
        Collection<Integer> vals = map.values();
        boolean empty = map.isEmpty();
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
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);

        map.replace(1, 100, 10);
        map.replace(2, 20);
        replaceAll((k, v) -> v * v);
        map.remove(3);
        map.remove(4, 1600);

        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        map.compute(3, (k, v) -> v * v);
        map.computeIfAbsent(6, k -> 600);
        map.computeIfPresent(6, (k, v) -> v * v);
    }
}
