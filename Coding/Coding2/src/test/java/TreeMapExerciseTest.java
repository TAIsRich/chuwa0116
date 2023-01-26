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
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("avcas",12);
        map.put("basdasd",123);
        map.putIfAbsent("cads",123);
        map.put("zsadsa",12312);
        map.put("sadsa",12);
        System.out.println(map.get("avcas"));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.containsKey("zsadsa"));
        System.out.println(map.containsValue(12));
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
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("avcas",12);
        map.put("basdasd",123);
        map.putIfAbsent("cads",123);
        map.put("zsadsa",12312);
        map.put("sadsa",12);
        map.replace("avcas",12,12312);
        map.replace("avcas",12);
        map.remove("avcas");
    }
}
