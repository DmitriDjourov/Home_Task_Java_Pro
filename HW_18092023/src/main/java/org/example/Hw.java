package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hw {
    // 1. Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.
    public void allKeyAllValue(HashMap<Integer, String> hashMap, TreeMap<Integer, String> treeMap) {
        System.out.println(" 1. ");
        System.out.println(" Ключи | Значения ");
        for (Map.Entry<Integer, String> m : hashMap.entrySet()) {
            System.out.println("Key: " + m.getKey() + " | " + " Val: " + m.getValue());
        }
        for (Map.Entry<Integer, String> t : treeMap.entrySet()) {
            System.out.println("Key: " + t.getKey() + " | " + " Val: " + t.getValue());
        }
        System.out.println();
    }

    // 2. Переберите только ключи в HashMap и TreeMap и найдите сумму их длин.
    public void getSumKey(HashMap<Integer, String> hashMap, TreeMap<Integer, String> treeMap) {
        int hashMapSum = 0;
        int treeMapSum = 0;

        for (Integer integer : hashMap.keySet()) {
            hashMapSum = hashMapSum + integer.toString().length();
        }

        for (Integer integer : treeMap.keySet()) {
            treeMapSum = treeMapSum + integer.toString().length();
        }

        System.out.println(" 2. Сумма длин ключей : " + (hashMapSum + treeMapSum));

/*      int a_size= hashMap.size() + treeMap.size();
        System.out.println("Сумма дли ключей : " + a_size); */
    }

    // 3. Переберите только значения в HashMap и TreeMap и найдите их среднее значение.
    public void getValuesAvg(HashMap<Integer, String> hashMap, TreeMap<Integer, String> treeMap) {
        int sum = 0;
        int count = 0;

        for (String str : hashMap.values()) {
            sum = sum + str.length();
            count++;
        }

        for (String str : treeMap.values()) {
            sum = sum + str.length();
            count++;
        }

        if (count == 0) {
            count = 1;
        } else {
            System.out.println(" 3. Среднее значение значений в HashMap и TreeMap:  " + (double) sum / count);
        }
    }

    // 4. Переберите HashMap и найдите ключ с максимальным значением.
    public void getMaxKey(HashMap<Integer, String> hashMap) {

        int maxKey = Integer.MIN_VALUE;
        int tempKey = 0;

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            tempKey = entry.getKey();
            if (tempKey > maxKey) {
                maxKey = tempKey;
            }
        }
        System.out.println(" 4. Ключ с максимальным значением : " + maxKey);
    }

    // 5. Переберите TreeMap и найдите ключ с минимальным значением.
    public void getMimKey(TreeMap<Integer, String> treeMap) {

        int minKey = Integer.MAX_VALUE;
        int tempKey = 0;
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            tempKey = entry.getKey();

            if (tempKey < minKey) {
                minKey = tempKey;
            }
        }
        System.out.println(" 5. Ключ с минимальным значением : " + minKey);
    }

    // 6. Переберите HashMap и удалите все элементы с четными значениями.
    public void getRemoveAllEvens(HashMap<String, Integer> hashMap) {
        int tempValue = -1;

        // Создаем список для удаления
        ArrayList<String> keysToRemove = new ArrayList<>();

        System.out.println(" 6. список до удаления четных элементов : " + hashMap);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            tempValue = entry.getValue();
            if (tempValue % 2 == 0) {
                keysToRemove.add(entry.getKey());
            }
        }
        // удаляем по списку четных ключей
        for (String key : keysToRemove) {
            hashMap.remove(key);
        }
        System.out.println("    список после удаления четных элементов : " + hashMap);
    }

    // 7. Переберите TreeMap и удалите все элементы с ключами, начинающимися с буквы 'A'.
    public void getRemoveAllA(TreeMap<String, Integer> treeMap) {

        ArrayList<String> keysToRemove = new ArrayList<>();

        System.out.println(" 7. список до удаления элементов начинающихся с буквы 'A' : " + treeMap);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String tempKey = entry.getKey();
            if (tempKey.startsWith("A")) {
                keysToRemove.add(entry.getKey());
            }
        }

        for (String key : keysToRemove) {
            treeMap.remove(key);
        }
        System.out.println("    список после удаления элементов начинающихся с буквы 'A' : " + treeMap);
    }

    // 8. Переберите TreeMap и найдите наибольший ключ, который меньше или равен заданному ключу.
    public void getMaxMimEqualOurKey(TreeMap<Integer, String> treeMap, int key){

        System.out.println(" 8. Наш список : " + treeMap);
        System.out.println("    заданный ключ : " + key);

        // Используем floorKey для поиска наибольшего ключа, меньшего или равного заданному
        Integer floorKey = treeMap.floorKey(key);

        if(floorKey != null) {
            System.out.println("    наибольший ключ, который меньше или равен заданному ключу " + floorKey);
        } else {
            System.out.println("    ключ не задан! ");
        }

    }
    // 9. Переберите HashMap и найдите ключ с максимальной суммой значений в
    // его вложенных HashMap: HashMap<String, HashMap<String, Integer>> nestedHashMap = new HashMap<>();

    public void getHashInToHash(){
        // Создаем вложенную HashMap
        HashMap<String, HashMap<String, Integer>> hardHashMap = new HashMap<>();

        // Заполняем вложенную HashMap данными
        HashMap<String, Integer> inMap1 = new HashMap<>();
        inMap1.put("A", 10);
        inMap1.put("B", 20);
        inMap1.put("C", 30);

        HashMap<String, Integer> inMap2 = new HashMap<>();
        inMap2.put("X", 15);
        inMap2.put("Y", 25);
        inMap2.put("Z", 35);

        hardHashMap.put("Map1", inMap1);
        hardHashMap.put("Map2", inMap2);

        // ключ с максимальной суммой значений во вложенных HashMap
        String keyWithMaxSum = null;
        int maxSum = Integer.MIN_VALUE;

        for (Map.Entry<String, HashMap<String, Integer>> entry : hardHashMap.entrySet()) {
            String outerKey = entry.getKey();
            HashMap<String, Integer> innerMap = entry.getValue();

            int sum = innerMap.values().stream().mapToInt(Integer::intValue).sum();

            if (sum > maxSum) {
                maxSum = sum;
                keyWithMaxSum = outerKey;
            }
        }

        if (keyWithMaxSum != null) {
            System.out.println("Ключ с максимальной суммой значений: " + keyWithMaxSum);
        } else {
            System.out.println("Вложенная HashMap пуста.");
        }
    }
}
