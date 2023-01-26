import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class LinkedHashMapExerciseTest {
    /**
     * e.g. HashMap<String, Integer> map = new LinkedHashMap<>();
     *
     * <p>put(K key, V value) putIfAbsent(K key, V value) putAll(Map<? extends K, ? extends V> m)
     *
     * <p>get(Object key) getOrDefault(Object key, V defaultValue)
     *
     * <p>containsKey(Object key) containsValue(Object value)
     *
     * <p>keySet() values() isEmpty()
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 0);
        map.putIfAbsent("b", 1);

        HashMap<String, Integer> m = new HashMap<>();
        m.put("c", 1);
        m.put("a", -1);
        map.putAll(m);
        System.out.println(map);

        System.out.println(map.get("a"));
        System.out.println(map.getOrDefault("d", -1));

        System.out.println(map.containsKey("d"));
        System.out.println(map.containsValue(-1));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue) replace(K key, V value) replaceAll(BiFunction<? super K,
     * ? super V, ? extends V> function)
     *
     * <p>remove(Object key) remove(Object key, Object value)
     *
     * <p>compute(Key, BiFunction) computeIfAbsent(Key, Function) computeIfPresent(Key, BiFunction)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);

        map.replace("a", 0);
        map.replace("b", 2, 1);

        map.replaceAll((k, v) -> v * v);
        System.out.println(map);

        map.remove("a", 0);
        map.remove("b");

        map.put("a", 1);
        map.put("b", 2);

        map.compute("a", (key, v) -> v - 1);
        map.computeIfAbsent("c", a -> 10);
        map.computeIfPresent("c", (k, v) -> v / 2);

        System.out.println(map);
    }
}