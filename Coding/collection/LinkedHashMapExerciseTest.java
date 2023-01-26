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
        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Alex", 1);
        map.putIfAbsent("Bob", 2);
        map.putIfAbsent("Bob", 2);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Joe", 3);
        map2.put("Sammy", 4);
        map.putAll(map2);

        System.out.println(map.get("Alex"));
        System.out.println(map.getOrDefault("Len", 5));

        System.out.println(map.containsKey("Alex"));
        System.out.println(map.containsValue(4));

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        System.out.println(map.isEmpty());
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
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Alex", 1);
        map.put("Bob", 2);
        map.put("Joe", 3);
        map.put("Sammy", 4);

        map.replace("Alex", 1, 10);
        map.replace("Bob", 3);
        map.replaceAll((key, value) -> value + value);

        map.remove("Alex");
        map.remove("Joe", 3);

        map.compute("Sammy", (key, value) -> value + 5);
        map.computeIfAbsent("Joe", key -> 1);
        map.computeIfPresent("Bob", (key, value) -> value * 2);
    }
}
