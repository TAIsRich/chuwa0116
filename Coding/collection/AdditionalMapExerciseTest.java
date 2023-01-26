package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.EnumMap;
import java.util.HashMap;
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
        ConcurrentHashMap<Integer, String> m
                = new ConcurrentHashMap<>();

        // Insert mappings using
        // put method
        m.put(100, "Hello");
        m.put(101, "Geeks");
        m.put(102, "Geeks");

        // Here we cant add Hello because 101 key
        // is already present in ConcurrentHashMap object
        m.putIfAbsent(101, "Hello");

        // We can remove entry because 101 key
        // is associated with For value
        m.remove(101, "Geeks");

        // Now we can add Hello
        m.putIfAbsent(103, "Hello");

        // We cant replace Hello with For
        m.replace(101, "Hello", "For");
        System.out.println(m);
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
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10000);
        map.put("b", 55000);
        map.put("c", 44300);
        map.put("e", 53200);

        // print original map
        System.out.println("HashMap:\n " + map.toString());

        // put a new value which is not mapped
        // before in map
        map.putIfAbsent("d", 77633);

        System.out.println("New HashMap:\n " + map);

        // try to put a new value with existing key
        // before in map
        map.putIfAbsent("d", 55555);

        // print newly mapped map
        System.out.println("Unchanged HashMap:\n " + map);
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
        EnumMap<GFG, String> gfgMap
                = new EnumMap<GFG, String>(GFG.class);

        // Putting values inside EnumMap in Java
        // Inserting Enum keys different from
        // their natural order
        gfgMap.put(GFG.CODE, "Start Coding with gfg");
        gfgMap.put(GFG.QUIZ, "Practice Quizes");

        // Printing size of EnumMap
        System.out.println("Size of EnumMap in java: "
                + gfgMap.size());

        System.out.println("EnumMap: " + gfgMap);

        // Retrieving value from EnumMap
        System.out.println("Key : " + GFG.CODE + " Value: "
                + gfgMap.get(GFG.CODE));

    }
    public enum GFG {
        CODE,
        QUIZ,
    }
}