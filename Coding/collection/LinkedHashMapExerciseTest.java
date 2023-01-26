package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.LinkedHashMap;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class LinkedHashMapExerciseTest {
    /**
     * e.g.
     * HashMap<String, Integer> map = new LinkedHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * getOrDefault(Object key, V defaultValue)
     *
     * containsKey(Object key)
     * containsValue(Object value)
     *
     * keySet()
     * values()
     * isEmpty()
     */

    @Test
    public void learn_Inserting_And_Retrieving() {
        //put
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("LinkedHashMap1: " + evenNumbers);
        evenNumbers.putIfAbsent("Three", 3);
        System.out.println(evenNumbers);
        LinkedHashMap<String, Integer> evenNumbers1 = new LinkedHashMap<>();
        evenNumbers1.putAll(evenNumbers);
        System.out.println(evenNumbers1);

        //get
        System.out.println(evenNumbers1.get("Two"));
        Integer tmp = evenNumbers1.getOrDefault("Five", 0);
        System.out.println(tmp);
        evenNumbers1.containsKey("Two");
        evenNumbers1.containsValue(3);

        System.out.println(evenNumbers1.keySet());
        System.out.println(evenNumbers1.values());
        System.out.println(evenNumbers1.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     * replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
     *
     * remove(Object key)
     * remove(Object key, Object value)
     *
     * compute(Key, BiFunction)
     * computeIfAbsent(Key, Function)
     * computeIfPresent(Key, BiFunction)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("LinkedHashMap1: " + evenNumbers);
        evenNumbers.putIfAbsent("Three", 3);

        evenNumbers.replace("Two", 2, 3);
        evenNumbers.replace("Two", 4);
        evenNumbers.replaceAll((k, v) -> 100);
        System.out.println(evenNumbers);

        //remove
        evenNumbers.remove("Two");
        evenNumbers.remove("Two", 100);

        //compute https://www.educative.io/answers/what-is-the-linkedhashmapcomputeifabsent-method-in-java
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Maths", 50);
        map.put("Science", 60);
        map.put("Programming", 70);
        System.out.println( "The map is - " + map);

        System.out.println( "\nCalling compute function for key Maths");

        Integer newVal = map.compute("Maths", (key, oldVal) -> { return oldVal + 10; });
        System.out.println("\nThe return value is " + newVal);
        System.out.println( "The map is - " + map);

        System.out.println( "\n---------------\n");
        System.out.println( "Calling compute function for key Economics\n");
        newVal =
                map.compute("Economics",
                        (key, oldVal) ->  {
                            System.out.print("Inside BiFunction: The key is ");
                            System.out.print(key);

                            System.out.print(". The value is ");
                            System.out.println(oldVal + ".");

                            if(oldVal != null) {
                                return oldVal + 10;
                            }
                            return null;
                        });
        System.out.println("\nThe return value is " + newVal);

        //computeIfAbsent https://www.educative.io/answers/what-is-the-linkedhashmapcompute-method-in-java
        Integer returnVal = map.computeIfAbsent("Economics", (key) ->{
            System.out.println( "\nMapping function called");
            return 80;
        });
        System.out.println("The return value from the computeIfAbsent for key Economics is " + returnVal);
        System.out.println( "\nAfter calling computeIfAbsent for key Economics , map is\n" + map);

        returnVal = map.computeIfAbsent("Maths", (key) ->{
            System.out.println( "Mapping function called");
            return 30;
        });
        System.out.println("\nThe return value from the computeIfAbsent  for key Maths is " + returnVal);
        System.out.println( "\nAfter calling computeIfAbsent for key Maths , map is\n" + map);

        //computeIfPresent https://www.educative.io/answers/what-is-the-linkedhashmapcomputeifpresent-method-in-java
        Integer returnVal1 = map.computeIfPresent("Maths", (key, oldVal) ->{
            System.out.println( "\nReMapping function called with key " + key + " value "  + oldVal );
            return 80;
        });
        System.out.println("\nAfter calling computeIfPresent for key Maths");
        System.out.println("\nThe return value is " + returnVal);
        System.out.println( "The map is\n" + map);

        returnVal1 = map.computeIfPresent("Economics", (key, oldVal) ->{
            System.out.println( "\n ReMapping function called");
            return 80;
        });
        System.out.println("\nAfter calling computeIfPresent for key Economics");
        System.out.print("The return value is ");
        System.out.println(returnVal1);

        System.out.println( "The map is\n" + map);
    }
}
