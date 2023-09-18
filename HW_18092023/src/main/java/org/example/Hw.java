package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hw {
    // 1. Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.
    public void allKeyAllValue(HashMap<Integer, String> hashMap, TreeMap<Integer, String> treeMap){
        for (Map.Entry<Integer, String> m : hashMap.entrySet()) {
            System.out.println("Key: " + m.getKey() + " | " + " Val: " + m.getValue());
        }
        for (Map.Entry<Integer, String> t : treeMap.entrySet()) {
            System.out.println("Key: " + t.getKey() + " | " + " Val: " + t.getValue());
        }

    }
}
