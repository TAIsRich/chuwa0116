import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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
        // This is to test the feature of LinkedHashMap: preserve the access order
        // If the size exceeds capacity, the least recently inserted entry would be removed
        HashMap<String, Integer> map = new LinkedHashMap<String,Integer>(4,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size()>4;
            }
        };
        map.put("ABC",21312);
        map.put("asdas",12312);
        map.put("asda",12312);
        map.put("dshcvhkj",213123);
        map.put("asdasdasd",2131);
        System.out.println(map.containsKey("ABC"));
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
        Map<String,Integer> map = new LinkedHashMap<>();
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
