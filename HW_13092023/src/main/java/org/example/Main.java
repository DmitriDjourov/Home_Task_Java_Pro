package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        HW hw = new HW();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(12);

        // 5.1 Найти сумму всех элементов ArrayList<Integer>.
        int sum = hw.getSum(numbers);
        System.out.println("5.1 Сумма всех элементов списка : " + sum);

        // 5.2 Найти среднее значение элементов LinkedList<Integer>.
        int avg = hw.getAvg(numbers);
        System.out.println("5.2 Среднее значение всех элементов списка : " + avg);

        // 5.3 Перебрать ArrayList<String> и вывести все элементы на экран.
        List<String> strings = new ArrayList<>();
        strings.add("Nik");
        strings.add("Vasya");
        strings.add("Anna");

        hw.ArrayList(strings);

        // 5.4 Перебрать LinkedList<String> и найти самую длинную строку.
        hw.getLongestStreng(strings);

        // 5.6 Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
        System.out.print("5.6 ArrayList с объектами моего класса : ");
        hw.doMyClassList();

    }
}