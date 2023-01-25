package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class AdditionalMapExerciseTest {

    @Test
    public void learn_ConcurrentHashMap() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("a", 0);
        map.put("b",1);
        map.putIfAbsent("a", 1);
        ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<>();
        map.putAll(mpa1);
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
        IdentityHashMap<String, Integer> mp = new IdentityHashMap<>();
        mp.put("a", 4);
        mp.putIfAbsent("a", 5);
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
        EnumMap<DayOfWeek, Integer> mp = new EnumMap<>(DayOfWeek.class);
        mp.put(DayOfWeek.Mon, "Hell no");
        mp.put(DayOfWeek.Sun, "No way");
        mp.putIfAbsent(DayOfWeek.Mon, "Hell Yeah");
    }
}
