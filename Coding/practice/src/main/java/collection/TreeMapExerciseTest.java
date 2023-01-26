package collection;

import org.junit.Test;

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
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Tom");
        map.put(2, "Jerry");
        map.put(1, "Marry");
        map.putIfAbsent(3, "John");
        System.out.println(map);

        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.putAll(map);
        System.out.println(map2);

        System.out.println(map.get(1));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Tom"));

        System.out.println(map.keySet());
        System.out.println(map.values());
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
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Tom");
        map.put(2, "Jerry");
        map.put(1, "Marry");

        map.replace(3, "Tom", "John");
        map.replace(2, "Kevin");

        map.remove(1);
        System.out.println(map);
    }
}
