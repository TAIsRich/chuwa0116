package Coding.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("hello", 1);
        map.putIfAbsent("hello2",2);
        map.putIfAbsent("hello1",2);
        Map<String, Integer> map2 = new ConcurrentHashMap<>();
        map2.putAll(map);
        System.out.println(map);
        System.out.println(map2);
        System.out.println(map.keySet());
        System.out.println(map.values());
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
        map.put("England", 1);
        map.put("Germany", 2);
        map.put("Norway", 3);

        map.replace("England",100);
        map.replace("Norway",3,300);
        map.replaceAll((key,value)->value*10);
        map.remove("USA");
        map.remove("Germany");
        map.compute("Norway",(key,val)->val+1);
        System.out.println(map);
        map.computeIfAbsent("abc",key->100);
        map.computeIfPresent("USA",(key,value)->value+101);
        System.out.println(map);
    }
}
