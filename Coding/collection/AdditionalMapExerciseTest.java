import org.junit.Test;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class AdditionalMapExerciseTest {

    /**
     * e.g. ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
     *
     * <p>put(K key, V value) putIfAbsent(K key, V value) putAll(Map<? extends K, ? extends V> m)
     */
    @Test
    public void learn_ConcurrentHashMap() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("a", 0);
        map.putIfAbsent("b", 1);

        Map<String, Integer> m = new HashMap<>();
        m.put("a", 0);
        m.put("c", 2);

        map.putAll(m);
        System.out.println(map);
    }

    /**
     * e.g. Map<DayOfWeek, Integer> map = new IdentityHashMap<>();
     *
     * <p>put(K key, V value) putIfAbsent(K key, V value)
     */
    @Test
    public void learn_IdentityHashMap() {
        Map<String, Integer> map = new IdentityHashMap<>();
        map.put("a", 0);
        map.putIfAbsent(new String("a"), -1);
        System.out.println(map);
    }

    /**
     * e.g. EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
     *
     * <p>put(K key, V value) putIfAbsent(K key, V value)
     */
    @Test
    public void learn_EnumMap() {
        EnumMap<Week, Integer> map = new EnumMap<Week, Integer>(Week.class);
        map.put(Week.Sun, 10);
        map.putIfAbsent(Week.Wed, 5);
        System.out.println(map);
    }

    public enum Week {
        Sun,
        Mon,
        Tue,
        Wed,
        Thur,
        Fri,
        Sat;
    }
}