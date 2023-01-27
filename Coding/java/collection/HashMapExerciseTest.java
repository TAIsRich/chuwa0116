package com.chuwa.exercise.collection;

import org.junit.Test;

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
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.putIfAbsent(2, 200);

        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(3, 300);
        map2.put(4, 400);

        map.putAll(map2);

        int value = map.get(1);
        int defaultValue = map.getOrDefault(5, 50);

        boolean containsKey = map.containsKey(5);
        boolean containsValue = map.containsValue(500);

        Set<Integer> s = map.keySet();
        Collection<Integer> collectionValues = map.values();
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
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.putIfAbsent(2, 200);
        map.replace(1, 100, 10);
        map.replace(2, 200, 20);
        map.replaceAll((key, val) -> val * val);

        map.remove(1);
        map.remove(2, 200);

        map.add(3, 300);
        map.add(4, 400);

        map.compute(3, (k, v) -> v * v);
        map.computeIfAbsent(6, k -> 600);
        map.computeIfPresent(6, (k, v) -> v * v);
    }
}
