package collection;

import org.junit.Test;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

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
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("One", 1);
        map.putIfAbsent("Two", 2);
        map.putIfAbsent("Two", 2);

        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("Three", 3);
        map2.put("Four", 4);
        map2.put("Five", 5);

        map.putAll(map2);

        System.out.println(map.get("One"));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.containsKey("One"));
        System.out.println(map.containsValue(5));


        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        System.out.println(map.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("One", 1);
        map.putIfAbsent("Two", 2);
        map.putIfAbsent("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);

        map.replace("One", 1, 11);
        map.replace("One", 1);

        map.remove("One");
    }
}
