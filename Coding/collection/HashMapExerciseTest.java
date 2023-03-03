package com.chuwa.exercise.collection;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

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
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        capitalCities.putIfAbsent(".","f");
        HashMap<String, String> capitalCities1 = new HashMap<String, String>();
        capitalCities.putAll(capitalCities1);
        String g=capitalCities.get("Germany");
        String u=capitalCities.getOrDefault("US","0");
        Boolean flag=capitalCities.containsKey("aaa");
        Boolean flag1=capitalCities.containsValue("nbb");
        System.out.println(capitalCities.keySet());
        System.out.println(capitalCities.values());
        System.out.println(capitalCities1.isEmpty());


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
        HashMap<String, String> capitalCities = new HashMap<String, String>();
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
