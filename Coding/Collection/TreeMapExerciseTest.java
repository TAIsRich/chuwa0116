package Collection;
import java.util.*;
import java.util.concurrent.*;
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
        TreeMap<Integer, String> tree_map
                = new TreeMap<Integer, String>();
        TreeMap<Integer, String> tree_map1
                = new TreeMap<Integer, String>();
        // Mapping string values to int keys
        // using put() method
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
        tree_map.putIfAbsent(22,"f");
        tree_map.putAll(tree_map1);
        String g=tree_map.get(30);
        System.out.println(g);
        System.out.println("first key: "+tree_map.firstKey());
        System.out.println("last key: "+tree_map.lastKey());
        System.out.println(tree_map.containsKey(20));
        System.out.println(tree_map.containsValue("hhhh"));
        System.out.println(tree_map.keySet());
        System.out.println(tree_map.values());
        System.out.println(tree_map.isEmpty());
        System.out.println(tree_map1.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<Integer, String> tree_map
                = new TreeMap<Integer, String>();
        TreeMap<Integer, String> tree_map1
                = new TreeMap<Integer, String>();
        // Mapping string values to int keys
        // using put() method
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");

        tree_map.replace(10,"Geeks","Geek");
        tree_map.replace(25,"efe");
        tree_map.remove(25);
        System.out.println(tree_map.keySet());
        System.out.println(tree_map.values());
    }
}
