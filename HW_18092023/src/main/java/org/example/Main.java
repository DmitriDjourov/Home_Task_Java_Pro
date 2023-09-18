package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
// 1. Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран..
        Map<Integer, String> mapH = new HashMap<>();
        mapH.put(6, "Mik");
        mapH.put(7, "Nik");
        mapH.put(8, "Jane");
        mapH.put(9, "Paul");
        mapH.put(0, "Anna");
        mapH.put(1, "Alla");
        mapH.put(2, "Vera");

        Map<Integer, String> mapT = new TreeMap<>();
        mapT.put(4, "Mik");
        mapT.put(5, "Nik");
        mapT.put(7, "Jane");
        mapT.put(3, "Paul");
        mapT.put(2, "Anna");
        mapT.put(0, "Alla");
        mapT.put(9, "Vera");

        // Создаем объект класса Hw
        Hw hw = new Hw();
        hw.allKeyAllValue((HashMap<Integer, String>) mapH, (TreeMap<Integer, String>) mapT);
    }
}