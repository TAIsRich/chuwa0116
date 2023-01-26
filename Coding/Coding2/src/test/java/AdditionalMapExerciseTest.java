import org.junit.Test;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.HashMap;
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
    Map<Integer,Integer> additionalMap = new HashMap<Integer,Integer>(){{
    put(1,1);
    put(2,3);
    put(4,5);}};
        ConcurrentHashMap<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<Integer,Integer>(){{
            putAll(additionalMap);
            put(1,2);
            put(6,9);
            putIfAbsent(1,20);
        }};
        for(Map.Entry<Integer,Integer> entry:concurrentHashMap.entrySet())
            System.out.println(entry);
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
        map.put(DayOfWeek.SATURDAY,20);
        map.putIfAbsent(DayOfWeek.SATURDAY,200);
        System.out.println(map.get(DayOfWeek.SATURDAY));
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
     EnumMap<DayOfWeek,Integer> enumMap = new EnumMap<>(DayOfWeek.class);
     enumMap.put(DayOfWeek.SATURDAY,20);
     enumMap.putIfAbsent(DayOfWeek.SATURDAY,60);
     System.out.println(enumMap.get(DayOfWeek.SATURDAY));
    }
}
