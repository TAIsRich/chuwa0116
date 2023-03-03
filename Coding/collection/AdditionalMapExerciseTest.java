package com.chuwa.exercise.collection;
//import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.IdentityHashMap;
import java.util.EnumMap;
import java.util.HashMap;
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
        map.put("1",1);
        map.put("2",0);
        ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<>();
        map1.putAll(map);

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
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("1",1);
        map.putIfAbsent("2",0);

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
//        EnumMap<String, Integer> enumMap = new EnumMap<>(String.class);
        EnumMap<GFG, String> gfgMap
                = new EnumMap<GFG, String>(GFG.class);
        gfgMap.put(GFG.CODE, "Start Coding with gfg");
        gfgMap.put(GFG.CONTRIBUTE, "Contribute for others");
        gfgMap.put(GFG.QUIZ, "Practice Quizes");
        gfgMap.put(GFG.MCQ, "Test Speed with Mcqs");
        gfgMap.putIfAbsent(GFG.CODE,"wevfew");

    }
    public enum GFG {
        CODE,
        CONTRIBUTE,
        QUIZ,
        MCQ;
    }
}
