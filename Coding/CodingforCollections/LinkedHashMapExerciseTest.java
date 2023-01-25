import org.junit.Test;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

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
        map.put("band", 0);
        map.put("Lucy", 1);
        map.putIfAbsent("purple", 2);
        Map<String, Integer> another = new LinkedHashMap<>();
        another.put("violin", 6);
        another.put("guitar", 7);
        another.put("vocal", 8);
        map.putAll(another);

        //get
        int get1 = map.get("Lucy");
        int get2 = map.getOrDefault("violin", 200);

        //contain
        boolean check1 = map.containsKey("vocal");
        boolean check2 = map.containsValue(206);

        //
        Set<String> keys = map.keySet();
        Collection values = map.values();
        boolean ifEmpty = map.isEmpty();

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
        map.put("band", 0);
        map.put("Lucy", 1);
        map.putIfAbsent("purple", 2);
        Map<String, Integer> another = new LinkedHashMap<>();
        another.put("violin", 6);
        another.put("guitar", 7);
        another.put("vocal", 8);
        map.putAll(another);

        map.replace("guitar", 107);
        map.replace("vocal", 8, 108);
        map.replaceAll((key, value) -> value + 10);

        //remove
        map.remove("guitar");
        map.remove("band", 10);

        //compute
        map.compute("Lucy", (key, value) -> value + 66);
        map.computeIfAbsent("newBand", value -> 1000);
        map.computeIfPresent("purple", (key, value) -> value + 1000);

    }
}
