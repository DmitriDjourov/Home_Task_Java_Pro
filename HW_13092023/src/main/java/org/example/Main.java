package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//        Уровень сложности 5 из 10:
        HW hw = new HW();
// 5.1 Найти сумму всех элементов ArrayList<Integer>.
        List<Integer> numbers_arr = new ArrayList<>();
        numbers_arr.add(5);
        numbers_arr.add(7);
        numbers_arr.add(12);

        int sum = hw.getSum(numbers_arr);
        System.out.println("5.1 Сумма всех элементов  ArrayList<Integer> списка : " + sum);

        // 5.2 Найти среднее значение элементов LinkedList<Integer>.
        List<Integer> numbers = new LinkedList<>();
        numbers.add(8);
        numbers.add(17);
        numbers.add(83);

        int avg = hw.getAvg(numbers);
        System.out.println("5.2 Среднее значение всех элементов списка : " + avg);

        // 5.3 Перебрать ArrayList<String> и вывести все элементы на экран.
        List<String> strings_arr = new ArrayList<>();
        strings_arr.add("Nik");
        strings_arr.add("Vasya");
        strings_arr.add("Anna");

        hw.ArrayList(strings_arr);

        // 5.4 Перебрать LinkedList<String> и найти самую длинную строку.
        List<String> strings = new LinkedList<>();
        strings.add("Mik");
        strings.add("Dima");
        strings.add("Irina");

        hw.getLongestStreng(strings);

        // 5.6 Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
        System.out.print("5.6 ArrayList с объектами моего класса : ");
        hw.doMyClassList();

//        Уровень сложности 6 из 10:

        // 6.1 Перебрать ArrayList<Integer> и найти наименьший элемент.
        int min = hw.getMinElem(numbers_arr);
        System.out.println("6.1 Наименьший из всех элементов списка : " + min);




    }
}