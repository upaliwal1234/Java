package HashMap;

import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args) {
        // LinkedList is used to implement HashMap
        HashMap<String, Integer> h = new HashMap<>();
        // Map<String, Integer> h = new HashMap<>();
        // data is unsorted and also not in order
        // we can also put null as a key
        // Add
        h.put("Raj", 68);
        h.put("Manish", 78);
        h.put("Shubham", 88);
        h.put("Utkarsh", 88);
        h.put("Aryan", 80);
        h.put("Harsh", 98);
        h.put("Sparsh", 98);
        h.put("Utkarsh", 80);
        // keys will be unique
        System.out.println(h);
        // // get
        // System.out.println(h.get("Sparsh")); // -> 98
        // System.out.println(h.get("SAM")); // -> null
        // // remove
        // System.out.println(h.remove("Raj"));
        // System.out.println(h);
        // // Contains
        // System.out.println(h.containsKey("Utkarsh"));
        // System.out.println(h.containsKey("Sam"));
        // System.out.println(h.containsKey("Sam"));
        // h.put(null, 100);
        // System.out.println(h);

        TreeMap<String, Integer> map1 = new TreeMap<>();
        // Add
        // data is key wise sorted in TreeMap
        // Red–black tree is used to implement TreeMap
        // we cannot put null as a key in TreeMap
        map1.put("Raj", 68);
        map1.put("Manish", 78);
        map1.put("Shubham", 88);
        map1.put("Utkarsh", 88);
        map1.put("Aryan", 80);
        map1.put("Harsh", 98);
        map1.put("Sparsh", 98);
        map1.put("Utkarsh", 80);
        System.out.println(map1);

        // LinkedHashMap ------------ Time Complexity O(n)
        // Implemented using doubly linked list
        // It stores the data in the order in which it is stored in it
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        // Add
        map2.put("Raj", 68);
        map2.put("Manish", 78);
        map2.put("Shubham", 88);
        map2.put("Utkarsh", 88);
        map2.put("Aryan", 80);
        map2.put("Harsh", 98);
        map2.put("Sparsh", 98);
        map2.put("Utkarsh", 80);
        map2.put(null, 75);
        System.out.println(map2);
        // System.out.println(map2.keySet());
        Set<String> key = map2.keySet();
        for (String k : key) {
            System.out.println(k + " " + map2.get(k));
        }
    }

}