package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> mapH = new HashMap<>();
        mapH.put(6, "Mik");
        mapH.put(7, "Nik");
        mapH.put(8, "Jane");
        mapH.put(9, "Paul");
        mapH.put(5, "Anna");
        mapH.put(1, "Alla");
        mapH.put(2, "Vera");

        Map<Integer, String> mapT = new TreeMap<>();
        mapT.put(4, "Mik");
        mapT.put(5, "Nik");
        mapT.put(7, "Jane");
        mapT.put(3, "Paul");
        mapT.put(2, "Anna");
        mapT.put(9, "Alla");
        mapT.put(11, "Vera");

        Hw hw = new Hw();

        // 1. Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.
        hw.allKeyAllValue((HashMap<Integer, String>) mapH, (TreeMap<Integer, String>) mapT);

        // 2. Переберите только ключи в HashMap и TreeMap и найдите сумму их длин.
        hw.getSumKey((HashMap<Integer, String>) mapH, (TreeMap<Integer, String>) mapT);

        // 3. Переберите только значения в HashMap и TreeMap и найдите их среднее значение.
        hw.getValuesAvg((HashMap<Integer, String>) mapH, (TreeMap<Integer, String>) mapT);

        // 4. Переберите HashMap и найдите ключ с максимальным значением.
        hw.getMaxKey((HashMap<Integer, String>)mapH);

        // 5. Переберите TreeMap и найдите ключ с минимальным значением.
        hw.getMimKey((TreeMap<Integer, String>) mapT);

        // 6. Переберите HashMap и удалите все элементы с четными значениями.
        Map<String, Integer> h_Map = new HashMap<>();
        h_Map.put("Apple",1);
        h_Map.put("Banana", 12);
        h_Map.put("Cherry", 17);
        h_Map.put("Apricot", 22);
        h_Map.put("Grapes", 8);
        h_Map.put("Kiwi", 15);

        hw.getRemoveAllEvens((HashMap<String, Integer>)h_Map);

        // 7. Переберите TreeMap и удалите все элементы с ключами, начинающимися с буквы 'A'.
        Map<String, Integer> t_Map = new TreeMap<>();
        t_Map.put("Apple", 5);
        t_Map.put("Banana", 10);
        t_Map.put("Cherry", 7);
        t_Map.put("Apricot", 12);
        t_Map.put("Grapes", 8);
        t_Map.put("Kiwi", 15);

        hw.getRemoveAllA((TreeMap<String, Integer>)t_Map);

        // 8. Переберите TreeMap и найдите наибольший ключ, который меньше или равен заданному ключу.
        int key = 6;
        hw.getMaxMimEqualOurKey((TreeMap<Integer, String>) mapT, key);

        // 9.Переберите HashMap и найдите ключ с максимальной суммой значений в его вложенных
        // HashMap: HashMap<String, HashMap<String, Integer>> nestedHashMap = new HashMap<>();
        hw.getHashInToHash();
    }
}