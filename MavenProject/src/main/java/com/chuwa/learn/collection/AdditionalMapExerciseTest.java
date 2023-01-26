package com.chuwa.learn.collection;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
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
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("hello", 1);
        map.putIfAbsent("hello2",2);
        map.putIfAbsent("hello1",2);
        Map<String, Integer> map2 = new ConcurrentHashMap<>();
        map2.putAll(map);
        System.out.println(map);
        System.out.println(map2);

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
        map.put(DayOfWeek.from(LocalDate.of(1947, Month.AUGUST, 15)), 1);
        map.putIfAbsent(DayOfWeek.from(LocalDate.of(1947, Month.AUGUST, 15)), 1);
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
        Map<DayOfWeek, Integer> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.from(LocalDate.of(1947, Month.AUGUST, 15)), 1);
        map.putIfAbsent(DayOfWeek.from(LocalDate.of(1947, Month.AUGUST, 15)), 1);
    }
}