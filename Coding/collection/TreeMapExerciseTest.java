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
        Map<String, Integer> map = new TreeMap<>();
        map.put("Alex", 1);
        map.putIfAbsent("Bob", 2);
        map.putIfAbsent("Bob", 2);

        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("Joe", 3);
        map2.put("Sammy", 4);

        map.putAll(map2);

        System.out.println(map.get("Alex"));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.containsKey("Joe"));
        System.out.println(map.containsValue(4));

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
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
        map.put("Alex", 1);
        map.put("Bob", 2);
        map.put("Joe", 3);
        map.put("Sammy", 4);

        map.replace("Alex", 1, 10);
        map.replace("Bob", 3);
        map.remove("Alex");
    }
}
