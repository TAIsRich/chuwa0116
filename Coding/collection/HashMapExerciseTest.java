package com.chuwa.exercise.collection;

import java.util.HashMap;

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
        HashMap<String, String> cityToProvince = new HashMap<>();
        cityToProvince.put("Wuhan", "Hubei");
        cityToProvince.put("Zhengzhou", "Henan");
        cityToProvince.put("Hangzhou", "Zhejiang");

        System.out.println(cityToProvince.get("Wuhan"));
        System.out.println(cityToProvince.getOrDefault("Harbin", "HeilongJiang"));
        System.out.println(cityToProvince.containsKey("Zhengzhou"));

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
        HashMap<String, String> cityToProvince = new HashMap<>();
        cityToProvince.put("Wuhan", "Hubei");
        cityToProvince.put("Zhengzhou", "Henan");
        cityToProvince.put("Hangzhou", "Zhejiang");
        cityToProvince.put("Nanjing", "Js");

        cityToProvince.replace("Nanjing", "Jiangsu");
        System.out.println(cityToProvince.get("Nanjing"));

        cityToProvince.remove("Zhengzhou");
        System.out.println(cityToProvince.containsKey("Zhengzhou"));

        

        
    }
}
