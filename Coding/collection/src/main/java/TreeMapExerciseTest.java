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
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("a", 1);
        treeMap.putIfAbsent("c", 2);
        System.out.println(treeMap.get("a"));
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());

    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("a", 1);
        treeMap.putIfAbsent("c", 2);
        treeMap.replace("a", 1, 2);
        treeMap.replace("a", 3);
        treeMap.remove("a");

    }
}