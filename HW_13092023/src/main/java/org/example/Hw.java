package org.example;

import java.util.*;

public class Hw {
    // 5. Уровень сложности 5 из 10:

    // 5.1 Найти сумму всех элементов ArrayList<Integer>.
    public void getSum() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(12);

        int sum = 0;
        for (Integer integer : numbers) {
            sum = sum + integer;
        }
        System.out.println("5.1 Сумма всех элементов  ArrayList<Integer> списка : " + sum);
    }

    // 5.2 Найти среднее значение элементов LinkedList<Integer>.
    public void getAvg() {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(8);
        numbers.add(17);
        numbers.add(83);

        int avg = 0;
        int sum = 0;
        for (Integer integer : numbers) {
            sum = sum + integer;
        }
        avg = sum / numbers.size();
        System.out.println("5.2 Среднее значение всех элементов списка : " + avg);
    }

    // 5.3 Перебрать ArrayList<String> и вывести все элементы на экран.
    public void ArrayList() {
        List<String> strings = new ArrayList<>();
        strings.add("Nik");
        strings.add("Vasya");
        strings.add("Anna");

        System.out.println("5.3 Элементы ArrayList<String> :");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    // 5.4 Перебрать LinkedList<String> и найти самую длинную строку.
    public void getLongestStreng() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Mik");
        strings.add("Dima");
        strings.add("Irina");

        int longestElemIndex = 0; // индекс элемента
        int elemlength = strings.get(0).length(); // размер элемента на 0 индексе
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() > elemlength) {
                elemlength = strings.get(i).length();
                longestElemIndex = i;
            }
        }
        System.out.println("5.4 Самая длинная строка : " + strings.get(longestElemIndex));
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

        System.out.println("5.6 ArrayList с объектами моего класса : ");
        for (MyClass myClass : myClasses) {
            System.out.println(myClass);
        }
    }

    //        Уровень сложности 6 из 10:

    // 6.1 Перебрать ArrayList<Integer> и найти наименьший элемент.
    public void getMinElem() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(12);

        int minElem = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < minElem) {
                minElem = numbers.get(i);
            }
        }
        System.out.println("6.1 Наименьший из всех элементов списка : " + minElem);
    }

    // 6.2 Перебрать LinkedList<Integer> и найти наибольший элемент.
    public void getMaxElem() {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(8);
        numbers.add(17);
        numbers.add(83);

        int maxElem = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > maxElem) {
                maxElem = numbers.get(i);
            }
        }
        System.out.println("6.2 Наибольший из всех элементов списка : " + maxElem);
    }

    // 6.3 Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
    public void doArrayListStringStartC() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Cherry");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Cat");

        char startletter = 'C';
        int counter = 0;
        for (String str : arrayList) {
            char firstLetter = str.toUpperCase().charAt(0);
            if (firstLetter == Character.toUpperCase(startletter)) {
                counter++;
            }
        }
        System.out.println("6.3 Количество элементов начинающихся с буквы С : " + counter);
    }

    // 6.4 Перебрать LinkedList<String> и найти первое вхождение определенной строки.
    public void doAnotherFirstLine() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Mik");
        strings.add("Dima");
        strings.add("Irina");

        String targetString = "Dima";
        int index = -1; //flag

        for (int i = 0; i < strings.size(); i++) {
            String currentString = strings.get(i);
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

        System.out.println(" 7.2 Мой массив до замены, всех кратных 3 чисел на 0:");
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

    // Уровень сложности 9 из 10

    // 9.1 Перебрать ArrayList<Integer> и найти второй по величине элемент.
    public void FindSecondLargestElement() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);

        Collections.sort(numbers, Collections.reverseOrder());// Сортируем ArrayList в порядке убывания
        // Второй по величине элемент будет на позиции с индексом 1 (первый элемент после максимального)
        if (numbers.size() >= 2) {
            int secondLargest = numbers.get(1);
            System.out.println(" 9.1 Второй по величине элемент( с индексом 1) : " + secondLargest);
        } else {
            System.out.println(" 9.1 Второй элемент отсутствует, список или пустой, или слишком короткий. ");
        }
    }

    // 9.2 Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.
    public void ElemReverseOrder() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);

        System.out.print(" 9.2 Все элементы массива : ");
        for (Integer integer : numbers) {
            System.out.print(integer);
        }
        System.out.println();
        System.out.print("     Все элементы массива в обратном порядке : ");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            int currentNum = numbers.get(i);
            System.out.print(currentNum);
        }
        System.out.println();
    }

    // 9.3 Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
    public void getOnlyStringsWithLetters() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Dima");
        strings.add("324Vasiya");
        strings.add("Tom432");
        strings.add("Misha");
        strings.add("Abramchik");

        System.out.println(" 9.3 Все элементы массива : ");
        for (String str : strings) {
            System.out.println(str);
        }

        System.out.println("     Все элементы массива содержащие только буквы : ");
        for (String str : strings) {
            if (str.matches("[a-zA-Z]+")) {
                System.out.println(str);
            }
        }
    }

    // 9.4 Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.
    public void getlongestStringWithoutSpaces() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Мама мыла раму");
        strings.add("Рама мыла маму");
        strings.add("Мамамылараму");

        // Переменная для хранения самой длинной строки без пробелов
        String longestStrElem = "";

        for (String string : strings) {
            // Проверяем, не содержит ли текущая строка пробелы и длиннее ли она текущей самой длинной
            if (!string.contains(" ") && string.length() > longestStrElem.length()) {
                longestStrElem = string;
            }
        }
        System.out.println(" 9.4 Самая длинная строка без пробелов: " + longestStrElem);
    }

    // 9.5 Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
    public void getOnlyUnicElem() {
        MyClass myClass1 = new MyClass("Nik", "Zadov", 19);
        MyClass myClass2 = new MyClass("Anna", "Kohava", 29);
        MyClass myClass3 = new MyClass("Anna", "Kohava", 29);
        MyClass myClass4 = new MyClass("Anna", "Kohava", 29);
        MyClass myClass5 = new MyClass("Vasia", "Pupkin", 39);

        List<MyClass> myClasses = new ArrayList<>();
        myClasses.add(myClass1);
        myClasses.add(myClass2);
        myClasses.add(myClass3);
        myClasses.add(myClass4);
        myClasses.add(myClass5);

        System.out.println(" 9.5 Мой массив до фильтра по уникальности : ");
        for (MyClass myClass : myClasses) {
            System.out.println(myClass);
        }
        // Используем HashSet для фильтрации уникальных объектов
        Set<MyClass> uniquePeople = new HashSet<>(myClasses);
        // Конвертируем Set обратно в ArrayList, если это необходимо
        List<MyClass> filteredPeople = new ArrayList<>(uniquePeople);

        System.out.println("     Мой массив после фильтра по уникальности: ");
        for (MyClass myClass : filteredPeople) {
            System.out.println(myClass);
        }
    }
}



