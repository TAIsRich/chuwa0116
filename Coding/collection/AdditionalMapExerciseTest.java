package collection;

import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

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
        ConcurrentHashMap<String, Integer> records = new ConcurrentHashMap<>();
        records.put("I", 1);
        records.put("II", 2);
        records.putIfAbsent("III", 3);

        ConcurrentHashMap<String, Integer> records2 = new ConcurrentHashMap<>();
        records2.putAll(records);

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
        IdentityHashMap<String, Integer> imap = new IdentityHashMap<>();
        imap.put("IV", 4);
        imap.putIfAbsent("V", 5);
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
        EnumMap<DayOfWeek, String> emap = new EnumMap<>(DayOfWeek.class);
        emap.put(DayOfWeek.Fri, "HAPPY YEAH");
        emap.put(DayOfWeek.Mon, "Oh, I hate!");
        emap.putIfAbsent(DayOfWeek.Fri, "LALALALA");

    }

    public enum DayOfWeek {
        Mon,
        Tue,
        Wed,
        Thur,
        Fri,
        Sat,
        Sun;
    }


}
