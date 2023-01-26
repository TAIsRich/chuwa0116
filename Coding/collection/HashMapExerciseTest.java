package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;

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
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        //put
        Sites.putIfAbsent(2, "Weibo");
        System.out.println(Sites);
        Sites.putIfAbsent(5, "Weibo");
        System.out.println(Sites);
        HashMap<Integer, String> Sites1 = new HashMap<Integer, String>();
        Sites1.putAll(Sites);
        System.out.println(Sites1);
        //get
        System.out.println(Sites.get(1));
        System.out.println(Sites.getOrDefault(6, "No"));
        //contains
        boolean b = Sites.containsKey(1);
        boolean c = Sites.containsValue("google");
        System.out.println(b);
        System.out.println(c);

        //keySet values isEmpty
        System.out.println(Sites.keySet());
        System.out.println(Sites.values());
        System.out.println(Sites.isEmpty());
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
        HashMap<Integer, String> sites = new HashMap<>();

        sites.put(1, "Google");
        sites.put(2, "Runoob");
        sites.put(3, "Taobao");
        System.out.println("sites HashMap: " + sites);
        //replace
        String value = sites.replace(2, "Wiki");

        System.out.println("Replaced Value: " + value);
        System.out.println("Updated HashMap: " + sites);

        sites.replace(3, "Taobao", "Meta");
        System.out.println(sites);

        sites.replaceAll((k, v) -> v.toUpperCase());
        System.out.println("Updated HashMap: " + sites);

        //remove
        sites.remove(2);
        System.out.println(sites);
        sites.remove(3, "Meta");
        System.out.println(sites);
        HashMap<String, Integer> prices = new HashMap<>();


        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);


        int newPrice = prices.compute("Shoes", (k, v) -> v - v * 10/100);
        System.out.println("Discounted Price of Shoes: " + newPrice);


        System.out.println("Updated HashMap: " + prices);

        int shirtPrice = prices.computeIfAbsent("Shirt", key -> 280);
        System.out.println("Price of Shirt: " + shirtPrice);
        System.out.println("Updated HashMap: " + prices);

        int shoesPrice = prices.computeIfPresent("Shoes", (k, v) -> v + v * 10/100);
        System.out.println("Price of Shoes after VAT: " + shoesPrice);


        System.out.println("Updated HashMap: " + prices);
    }
}
