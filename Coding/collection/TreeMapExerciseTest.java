

import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class TreeMapExerciseTest {

    /**
     * e.g.
     * TreeMap<String, Integer> map = new TreeMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * firstKey()
     * lastKey()
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
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(92037, "CA");
        map.putIfAbsent(98109, "WA");

        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(92092, "CA");
        map2.put(10012, "NY");

        map2.putAll(map);

        System.out.println(map.get(98109));
        System.out.println(map2.firstKey());
        System.out.println(map2.lastKey());
        System.out.println(map2.containsKey(98109));


        Set<Integer> keys = map2.keySet();
  
        System.out.println(map2.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(92037, "CA");
        map.putIfAbsent(98109, "WA");
        map.putIfAbsent(77494, "OR");

        map.replace(77494, "TX");
        map.remove(77494);
        System.out.println(map.isEmpty());

    }
}
