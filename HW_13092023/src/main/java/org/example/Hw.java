package org.example;

import java.util.*;

public class Hw {
    // 5. Уровень сложности 5 из 10:

    // 5.1 Найти сумму всех элементов ArrayList<Integer>.
    public int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        /* for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
         }*/
        return sum;
    }

    // 5.2 Найти среднее значение элементов LinkedList<Integer>.
    public int getAvg(List<Integer> list) {
        int avg = 0;
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        avg = sum / list.size();
        return avg;
    }

    // 5.3 Перебрать ArrayList<String> и вывести все элементы на экран.
    public void ArrayList(List<String> list) {
        System.out.println("5.3 Элементы ArrayList<String> :");
        for (String string : list) {
            System.out.println(string);
        }
    }

    // 5.4 Перебрать LinkedList<String> и найти самую длинную строку.
    public void getLongestStreng(List<String> list) {
        int longestElemIndex = 0; // индекс элемента
        int elemlength = list.get(0).length(); // размер элемента на 0 индексе
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > elemlength) {
                elemlength = list.get(i).length();
                longestElemIndex = i;
            }
        }
        System.out.println("5.4 Самая длинная строка : " + list.get(longestElemIndex));
    }

    // 5.5 Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
    public void doMyClassList() {
        MyClass myClass1 = new MyClass("Nik", "Zadov", 19);
        MyClass myClass2 = new MyClass("Anna", "Kohava", 29);
        MyClass myClass3 = new MyClass("Vasia", "Pupkin", 39);

        List<MyClass> myClasses = new ArrayList<>();
        myClasses.add(myClass1);
        myClasses.add(myClass2);
        myClasses.add(myClass3);

        for (MyClass myClass : myClasses) {
            System.out.println(myClass);
        }
    }

    //        Уровень сложности 6 из 10:

    // 6.1 Перебрать ArrayList<Integer> и найти наименьший элемент.
    public int getMinElem(List<Integer> list) {
        int minElem = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minElem) {
                minElem = list.get(i);
            }
        }
        return minElem;
    }

    // 6.2 Перебрать LinkedList<Integer> и найти наибольший элемент.
    public int getMaxElem(List<Integer> list) {
        int maxElem = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxElem) {
                maxElem = list.get(i);
            }
        }
        return maxElem;
    }

    // 6.3 Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
    public void doArrayListStringStartC(List<String> list) {
        char startletter = 'C';
        int counter = 0;
        for (String str : list) {
            char firstLetter = str.toUpperCase().charAt(0);
            if (firstLetter == Character.toUpperCase(startletter)) {
                counter++;
            }
        }
        System.out.println("6.3 Количество элементов начинающихся с буквы С : " + counter);
    }

    // 6.4 Перебрать LinkedList<String> и найти первое вхождение определенной строки.
    public void doAnotherFirstLine(List<String> list) {
        String targetString = "Dima";
        int index = -1; //flag

        for (int i = 0; i < list.size(); i++) {
            String currentString = list.get(i);
            if (currentString.equals(targetString)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("6.4 Первое вхождение строки " + targetString + " найдено на индексе " + index);
        } else {
            System.out.println("6.4 Строка " + targetString + " не найдена. ");
        }
    }

    // 6.5 Создать LinkedList с объектами вашего собственного класса и удалить все элементы,
    //     удовлетворяющие определенному условию.
    public void doMyClassListDelElem() {
        MyClass myClass1 = new MyClass("Nik", "Zadov", 19);
        MyClass myClass2 = new MyClass("Anna", "Kohava", 29);
        MyClass myClass3 = new MyClass("Vasia", "Pupkin", 39);

        LinkedList<MyClass> myClasses = new LinkedList<>();
        myClasses.add(myClass1);
        myClasses.add(myClass2);
        myClasses.add(myClass3);
        // Условие для удаления: возраст старше 30 лет
        int ageThreshold = 30;

        System.out.println("6.5 Мой массив до удаления, старого пердуна :");
        for (MyClass myClass : myClasses) {
            System.out.println(myClass);
        }

        for (int i = 0; i < myClasses.size(); i++) {
            if (myClasses.get(i).getAge() > ageThreshold) {
                myClasses.remove(i);
                i--;
            }
        }
        System.out.println("   Мой массив после удаления, старого пердуна :");
        for (MyClass myClass : myClasses) {
            System.out.println(myClass);
        }
    }

    //    Уровень сложности 7 из 10:
    // 7.1 Перебрать ArrayList<Integer> и удалить все четные числа.
    public void doDelEvenElem() {
        List<Integer> numbers_arr_list = new ArrayList<>();
        numbers_arr_list.add(5);
        numbers_arr_list.add(7);
        numbers_arr_list.add(12);
        numbers_arr_list.add(86);
        numbers_arr_list.add(11);

        System.out.println(" 7.1 Мой массив до удаления, всех четных чисел :");
        for (Integer integer : numbers_arr_list) {
            System.out.println(integer);
        }

        for (int i = 0; i < numbers_arr_list.size(); i++) {
            if (numbers_arr_list.get(i) % 2 == 0) {
                numbers_arr_list.remove(i);
                i--;
            }
        }
        System.out.println("     Мой массив после удаления, всех четных чисел :");
        for (Integer integer : numbers_arr_list) {
            System.out.println(integer);
        }
    }

    // 7.2 Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.
    public void doReplaceElemMultiples3_zero() {
        LinkedList<Integer> numbers_list = new LinkedList<>();
        numbers_list.add(5);
        numbers_list.add(9);
        numbers_list.add(12);
        numbers_list.add(6);
        numbers_list.add(11);

        System.out.println(" 7.1 Мой массив до замены, всех кратных 3 чисел на 0:");
        for (Integer integer : numbers_list) {
            System.out.println(integer);
        }

        for (int i = 0; i < numbers_list.size(); i++) {
            if (numbers_list.get(i) % 3 == 0) {
                numbers_list.set(i, 0);
            }
        }
        System.out.println("     Мой массив после замены, всех кратных 3 чисел на 0:");
        for (Integer integer : numbers_list) {
            System.out.println(integer);
        }
    }

    // 7.3 Перебрать ArrayList<String> и объединить все элементы в одну строку.
    public void DoAllElemOneString() {
        List<String> myLists = new ArrayList<>();
        myLists.add("Mik");
        myLists.add("Dima");
        myLists.add("Irina");

        StringBuilder allString = new StringBuilder();

        System.out.println(" 7.3 Массив строк до объединения : ");

        for (String list : myLists) {
            System.out.println(list);
            allString.append(" ").append(list);
        }

        System.out.println("Строка после объединения : " + allString + " ");
    }

    // 7.4 Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.
    public void getDelElemSpecificString() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Mik");
        strings.add("Dima");
        strings.add("Irina");
        strings.add("Anna");
        strings.add("Tom");

        String subStrToRemove = "na";

        System.out.println(" 7.4 Мой массив до удаления элементов содержащих подстроку - %na :");
        for (String string : strings) {
            System.out.println(string);
        }

        for (int i = 0; i < strings.size(); i++) {
            String currentStr = strings.get(i);
            if (currentStr.contains(subStrToRemove)) {
                strings.remove(i);
                i--;
            } else {
                i++;
            }
        }
        System.out.println("     Мой массив после удаления элементов содержащих подстроку - %na :");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    // 7.5 Создать ArrayList с объектами вашего собственного класса и вывести только те,
    // которые удовлетворяют определенному условию.
    public void doMyClassListSpecificPrint() {
        MyClass myClass1 = new MyClass("Nik", "Zadov", 19);
        MyClass myClass2 = new MyClass("Anna", "Kohava", 29);
        MyClass myClass3 = new MyClass("Vasia", "Pupkin", 39);

        int specificElemAge = 20;

        List<MyClass> myClasses = new ArrayList<>();
        myClasses.add(myClass1);
        myClasses.add(myClass2);
        myClasses.add(myClass3);

        System.out.println(" 7.5 Мой массив :");

        for (MyClass myClass : myClasses) {
            System.out.println(myClass);
        }

        System.out.println("    Мой массив, все кто старше 20 лет :");
        for (int i = 0; i < myClasses.size(); i++) {
            if (myClasses.get(i).getAge() > specificElemAge) {
                System.out.println(myClasses.get(i));
            }
        }
    }

    // Уровень сложности 8 из 10:

    // 8.1 Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.
    public void doSumSumSquaresAllNumbers() {
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(4);
        lists.add(7);
        lists.add(2);
        lists.add(5);
        lists.add(9);

        int sumSquaews = 0;

        for (Integer integer : lists) {
            sumSquaews = sumSquaews + (integer * integer);
        }
        System.out.println(" 8.1 Сумма квадратов всех чисел : " + sumSquaews);
    }

    // 8.2 Перебрать LinkedList<Integer> и вычислить произведение всех элементов.
    public void doProductAllNumbers() {
        LinkedList<Integer> lists = new LinkedList<>();
        lists.add(4);
        lists.add(7);
        lists.add(2);
        lists.add(5);
        lists.add(9);

        int prodNum = 1;

        for (Integer integer : lists) {
            prodNum = prodNum * integer;
        }
        System.out.println(" 8.2 Произведение всех чисел : " + prodNum);
    }

    // 8.3 Перебрать ArrayList<String> и найти самую короткую строку.
    public void getShortestString() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Mik");
        strings.add("Dima");
        strings.add("Irina");
        strings.add("Anna");

        String shotString = null;

        for (String string : strings) {
            if (shotString == null || string.length() < shotString.length()) {
                shotString = string;
            }
        }
        System.out.println(" 8.3 Самая короткая строка: " + shotString);
    }

    // 8.4 Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.
    public void getReplacingVowelsWithStars() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Mama");
        strings.add("Mila");
        strings.add("Ramu");

        System.out.println(" 8.4 Мой массив до замены гласных букв на звездочки :");
        for (String string : strings) {
            System.out.println(string);
        }

        for (int i = 0; i < strings.size(); i++) {
            String currentStr = strings.get(i);
            String newString = currentStr.replaceAll("[AEIOUaeiou]", "*");
            strings.set(i, newString);
        }
        System.out.println("     Мой массив после замены гласных букв на звездочки : ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    // 8.5 Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.
    public void getSortDescendingOrder() {
        MyClass myClass1 = new MyClass("Nik", "Zadov", 19);
        MyClass myClass2 = new MyClass("Anna", "Kohava", 29);
        MyClass myClass3 = new MyClass("Vasia", "Pupkin", 39);

        LinkedList<MyClass> myClasses = new LinkedList<>();
        myClasses.add(myClass1);
        myClasses.add(myClass2);
        myClasses.add(myClass3);
        System.out.println(" 8.5 Мой массив до сортировки в порядке убывания по возрасту: ");
        for (MyClass myClass : myClasses) {
            System.out.println(myClass);
        }

        Collections.sort(myClasses);

        System.out.println("     Мой массив после сортировки в порядке убывания по возрасту: ");
        for (MyClass myClass : myClasses) {
            System.out.println(myClass);
        }
    }

}


