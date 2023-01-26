import org.junit.Test;

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
    Map<String,Integer> map = new HashMap<>();
    map.put("Abc",66);
    map.putIfAbsent("Abc",68);
    map.putAll(new HashMap<String,Integer>(){{
        put("DASH",123);
        put("asdas",213);
        put("asdasd",321321);
    }});
        System.out.println(map.get("DASH"));
        System.out.println(map.getOrDefault("a",0));
        System.out.println(map.containsKey("DASH"));
        System.out.println(map.containsValue(123));
        Set<String> strings = map.keySet();
        System.out.println(strings);
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
        Map<String,Integer> map = new HashMap<>();
        map.put("Abc",66);
        map.putIfAbsent("Abc",68);
        map.putAll(new HashMap<String,Integer>(){{
            put("DASH",123);
            put("asdas",213);
            put("asdasd",321321);
        }});
        map.replace("Abc",66,68);
        map.replace("Abc",100);
        map.replaceAll((a,b)->a.hashCode()+b);
        System.out.println(map);
        map.remove("Abc");
        System.out.println(map.compute("DASH", (a, b) -> a.hashCode() * 10 + b));
        System.out.println(map.computeIfAbsent("DASH",x->20));
        System.out.println(map.computeIfPresent("DASH",(a,x)->20));
        System.out.println(map);
    }
}
