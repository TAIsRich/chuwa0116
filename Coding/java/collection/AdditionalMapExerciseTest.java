package com.chuwa.exercise.collection;

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
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        map.putIfAbsent(5, 500);

        ConcurrentHashMap<Integer, Integer> map2 = new ConcurrentHashMap<>();
        map2.put(6, 600);

        map.putAll(map2);
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
        Map<String, String> ihm = new IdentityHashMap<>();
        ihm.put("ihmkey","ihmvalue");
        ihm.put(new String("ihmkey"),"ihmvalue1");
        ihm.putIfAbsent("ihmkey2","ihmvalue1");
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
        public enum KEYS {
            FIRST,
            SECOND,
            THIRD,
            FORTH;
        }

        EnumMap<KEYS, String> enumMap = new EnumMap<KEYS, String>(KEYS.class);
        enumMap.put(KEYS.FIRST, "1st");
        enumMap.put(KEYS.SECOND, "2nd");
    }
}
