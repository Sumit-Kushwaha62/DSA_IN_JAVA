//package Hashing;

import java.util.*;

public class hashMap { // unordered:
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        // Insert data:

        hm.put("India", 150);
        hm.put("china", 100);
        hm.put("indonashiya", 50);
        hm.put("russia", 70);

        System.out.println(hm);

        // // GET

        // System.out.println(hm.get("India"));

        // // ContainsKey
        // System.out.println(hm.containsKey("Russia"));

        // // Remove;
        // hm.remove("china");
        // System.out.println(hm.size());
        // System.out.println(hm.isEmpty());
        // System.out.println(hm);
        // hm.clear();
        // System.out.println(hm);

        // Iteration on Hashmap:

        Set<String> Keys = hm.keySet();

        for (String k : Keys) {
            System.out.println("key = " + k + " " + " values = " + hm.get(k));
        }

        // enterySet() can we also use for iteration:

    }
}
