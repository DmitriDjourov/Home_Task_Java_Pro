package org.example;

import java.util.ArrayList;
import java.util.List;

public class HW {
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

    // 5.6 Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
    public void doMyClassList() {
        MyClass myClass1 = new MyClass("Nik", "Zadov", 19);
        MyClass myClass2 = new MyClass("Anna", "Kohava", 29);
        MyClass myClass3 = new MyClass("Vasia", "Pupkin", 39);

        List<MyClass> myClasses = new ArrayList<>();
        myClasses.add(myClass1);
        myClasses.add(myClass2);
        myClasses.add(myClass3);

        System.out.println(myClasses);

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
}

