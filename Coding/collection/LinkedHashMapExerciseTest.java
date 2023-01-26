package com.chuwa.exercise.collection;

import java.util.LinkedHashMap;

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
        LinkedHashMap<String, String> countryToContinent = new LinkedHashMap<String, String>();
        LinkedHashMap<String, String> ctc = new LinkedHashMap<String, String>();

        countryToContinent.put("China", "Asia");
        countryToContinent.put("France", "Europe");
        countryToContinent.put("Vietnam", "Asia");
        countryToContinent.putIfAbsent("Russia","Europe");
        ctc.putAll(countryToContinent);

        String ans=countryToContinent.getOrDefault("Singapore","Asia");
        System.out.println(ans);
        System.out.println(countryToContinent.containsKey("USA"));
        System.out.println(countryToContinent.keySet());
        System.out.println(countryToContinent.values());
        System.out.println(countryToContinent.isEmpty());
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
        LinkedHashMap<String, String> countryToContinent = new LinkedHashMap<String, String>();
        LinkedHashMap<String, String> ctc = new LinkedHashMap<String, String>();

        countryToContinent.put("China", "Asia");
        countryToContinent.put("France", "Europe");
        countryToContinent.put("Vietnam", "Atlantic");
        countryToContinent.putIfAbsent("Russia","Europe");
        ctc.putAll(countryToContinent);

        ctc.replace("Vietnam","SouthEast Asia");
        ctc.remove("France");
        ctc.compute("China",(key,val)->"East ".concat(val));

    }
}
