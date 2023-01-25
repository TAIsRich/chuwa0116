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
        HashMap<String, String> mp = new HashMap<>();
        mp.put("apple", "tim");
        mp.put("google", "pichai");
        mp.put("micro", "pi");
        System.out.println(mp.get("apple"));
        System.out.println(mp.getOrDefault("netflix", "idk"));
        System.out.println(mp.containsKey("amazn"));
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
        HashMap<String, String> mp = new HashMap<>();
        mp.put("apple", "tim");
        mp.put("google", "pichai");
        mp.put("micro", "pi");

        mp.replace("micro", "indian");
        System.out.println(mp.get("micro"));

        mp.remove("apple");
        System.out.println(mp.containsKey("apple"));


    }
}
