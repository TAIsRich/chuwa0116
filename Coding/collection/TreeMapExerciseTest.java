import org.junit.Test;

import java.util.TreeMap;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class TreeMapExerciseTest {

    /**
     * e.g. TreeMap<String, Integer> map = new TreeMap<>();
     *
     * <p>put(K key, V value) putIfAbsent(K key, V value) putAll(Map<? extends K, ? extends V> m)
     *
     * <p>get(Object key) firstKey() lastKey()
     *
     * <p>containsKey(Object key) containsValue(Object value)
     *
     * <p>keySet() values() isEmpty()
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 0);
        map.putIfAbsent("b", 1);

        TreeMap<String, Integer> m = new TreeMap<>();
        m.put("c", 1);
        m.put("a", -1);
        map.putAll(m);
        System.out.println(map);

        System.out.println(map.get("a"));

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.containsKey("d"));
        System.out.println(map.containsValue(-1));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue) replace(K key, V value)
     *
     * <p>remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 0);
        map.put("b", 1);

        map.replace("a", 0, -1);
        map.replace("b", 2);
        System.out.println(map);

        map.remove("b");
        System.out.println(map);
    }
}