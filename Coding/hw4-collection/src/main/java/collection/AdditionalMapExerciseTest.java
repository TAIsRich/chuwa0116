package collection;

import org.junit.Test;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class AdditionalMapExerciseTest {

    /**
     * e.g.
     * ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     */
    @Test
    public void learn_ConcurrentHashMap() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Tom", 1);
        map.put("Jerry", 2);
        map.put("Marry", 3);
        map.putIfAbsent("Tom", 10);

        ConcurrentHashMap<String, Integer> map2 = new ConcurrentHashMap<>();
        map2.putAll(map);
    }

    /**
     * e.g.
     * Map<DayOfWeek, Integer> map = new IdentityHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     */
    @Test
    public void learn_IdentityHashMap() {
        Map<DayOfWeek, Integer> map = new IdentityHashMap<>();
        map.put(DayOfWeek.FRIDAY, 999);
        map.put(DayOfWeek.THURSDAY, 888);
        map.put(DayOfWeek.WEDNESDAY, 777);
        map.putIfAbsent(DayOfWeek.FRIDAY, 1999);
        System.out.println(map);
    }

    /**
     * e.g.
     * EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     */
    @Test
    public void learn_EnumMap() {
        EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
        System.out.println(enumMap);

        enumMap.put(DayOfWeek.FRIDAY, 999);
        enumMap.put(DayOfWeek.THURSDAY, 888);
        enumMap.put(DayOfWeek.WEDNESDAY, 777);
        System.out.println(enumMap);
    }
}
