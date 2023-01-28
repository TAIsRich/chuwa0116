package collection;

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
        Map<String, Integer> map = new HashMap<>();
        map.put("Tom", 1);
        map.put("Jerry", 2);
        map.put("Marry", 3);
        map.putIfAbsent("Marry", 4);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);

        System.out.println(map.get("Jerry"));
        System.out.println(map.getOrDefault("John", 5));
        System.out.println(map.containsKey("Tom"));
        System.out.println(map.containsValue(5));

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
        Map<String, Integer> map = new HashMap<>();
        map.put("Tom", 1);
        map.put("Jerry", 2);
        map.put("Marry", 3);
        System.out.println(map);

        map.replace("Tom", 1, 10);
        System.out.println(map);

        map.replace("Tom", 5);
        System.out.println(map);

        map.replaceAll((k, v) -> v * 2);
        System.out.println(map);

        map.compute("Tom", (k, v) -> v * 2);
        System.out.println(map);

        map.computeIfAbsent("Tom", v -> 10 * 2);
        System.out.println(map);

        map.computeIfPresent("Tom", (k, v) -> v * 2);
        System.out.println(map);
    }
}
