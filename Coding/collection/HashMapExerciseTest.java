package collection;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        map.put("One", 1);

        map.putIfAbsent("Two", 2);
        map.putIfAbsent("Two", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Three", 3);
        map2.put("Four", 4);
        map2.put("Five", 5);

        map.putAll(map2);

        System.out.println(map.get("One"));
        System.out.println(map.getOrDefault("Ten", 10));

        System.out.println(map.containsKey("One"));
        System.out.println(map.containsValue(10));

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
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.putIfAbsent("Two", 2);
        map.putIfAbsent("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);

        map.replace("One", 1, 11);
        map.replace("One", 12);
        map.replaceAll((key, value) -> value * value);

        map.remove("One");
        map.remove("Two", 2);

        map.compute("Three", (key, value) -> value * 10);
        map.computeIfAbsent("One", key -> 1);
        map.computeIfPresent("Three", (key, value) -> value / 10);
    }
}
