package com.chuwa.exercise.collection;
import java.util.HashMap;
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
        LinkedHashMap<String, String> lhm
                = new LinkedHashMap<String, String>();
        LinkedHashMap<String, String> lhm1
                = new LinkedHashMap<String, String>();
        // Adding entries in Map
        // using put() method
        lhm.put("one", "practice.geeksforgeeks.org");
        lhm.put("two", "code.geeksforgeeks.org");
        lhm.put("four", "www.geeksforgeeks.org");
        lhm.putIfAbsent("111","222");
        lhm.putAll(lhm1);
        String test=lhm.get("one");
        System.out.println(test);
        String test1=lhm.getOrDefault("three","test2");
        System.out.println(test1);
        System.out.println(lhm.containsKey("one"));
        System.out.println(lhm.containsValue("tew"));
        System.out.println(lhm.keySet());
        System.out.println(lhm.values());
        System.out.println(lhm.isEmpty());


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
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        capitalCities.replace("England","xxxx");
        capitalCities.replace("Norway","Oslo","oooo");
        capitalCities.replaceAll((key,value)->value.toUpperCase());
        capitalCities.remove("USA");
        capitalCities.remove("Germany","Berlin");
        capitalCities.compute("Norway",(key,val)->val.concat("????"));
        capitalCities.computeIfAbsent("abc",key->"abc".concat("!!!"));
        capitalCities.computeIfPresent("USA",(key,value)->value.concat("@@@"));
    }
}
