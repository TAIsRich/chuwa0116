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
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("a", 1);
        hashmap.putIfAbsent("b", 2);
        hashmap.get("1");
        hashmap.getOrDefault("3", 0);
        hashmap.containsKey("a");
        hashmap.containsValue("0");
        hashmap.keySet();
        hashmap.values();
        hashmap.isEmpty();
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
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("a", 1);
        hashmap.putIfAbsent("b", 2);
        hashmap.get("1");
        hashmap.replace("a", 3, 2);
        System.out.println(hashmap.get("a"));
        hashmap.remove("a");
        hashmap.compute("a", (k, v) -> v == null ? 2 : v + 10);
        System.out.println(hashmap.get("a"));


    }
}