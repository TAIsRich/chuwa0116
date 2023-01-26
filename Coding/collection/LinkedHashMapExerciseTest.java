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
        LinkedHashMap<String, String> mp1 = new LinkedHashMap<String, String>();
        //LinkedHashMap<String, String> mp2 = new LinkedHashMap<String, String>();

        mp1.put("Shanghai", "xuhui");
        mp1.put("Beijing", "Choaoyang");
        mp1.put("Dalian", "zhongshan");
        mp1.putIfAbsent("Shenyang","huanggu");
        mp2.putAll(mp1);
        String res=mp1.getOrDefault("Guangzhou","haizhu");
        System.out.println(res);
        System.out.println(mp1.containsKey("Guangzhou"));
        System.out.println(mp1.keySet());
        System.out.println(mp1.values());
        System.out.println(mp1.isEmpty());

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
        LinkedHashMap<String, String> mp1 = new LinkedHashMap<String, String>();
        LinkedHashMap<String, String> mp2 = new LinkedHashMap<String, String>();

        mp1.put("Shanghai", "xuhui");
        mp1.put("Beijing", "Choaoyang");
        mp1.put("Dalian", "zhongshan");
        mp1.putIfAbsent("Shenyang","huanggu");
        mp2.putAll(mp1);
        mp2.replace("Shenyang","hunnan");
        mp2.remove("Dalian");
        mp2.compute("Shanghai",(key,val)->"District of ".concat(val));
    }
}
