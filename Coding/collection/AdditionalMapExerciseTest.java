package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;
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
        ConcurrentHashMap<Integer,String> mp = new ConcurrentHashMap<>();
        mp.put(1,"abc");
        mp.put(2, "bcd");
        System.out.println(mp.get(1));
        if(mp.containsKey(2)) System.out.println("found key");
        System.out.println(mp.getOrDefault(3, "sss"));
        ConcurrentHashMap<Integer,String>mp1 = new ConcurrentHashMap<>();
        mp1.putAll(mp);
        System.out.println(mp1.values());
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
        Map<Integer,String> mp = new IdentityHashMap<>();
        mp.put(1,"abc");
        mp.put(2, "bcd");
        System.out.println(mp.get(1));
        if(mp.containsKey(2)) System.out.println("found key");
        System.out.println(mp.getOrDefault(3, "sss"));
        Map<Integer,String>mp1 = new IdentityHashMap<>();
        mp1.putAll(mp);
        System.out.println(mp1.values());
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
        EnumMap<DayOfWeek,String> mp = new EnumMap<DayOfWeek, String>(DayOfWeek.class);
        mp.put(DayOfWeek.Monday,"abc");
        mp.put(DayOfWeek.Tuesday, "bcd");
        System.out.println(mp.values());
        System.out.println(mp.keySet());
    }
    public enum  DayOfWeek {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday

    }
}
