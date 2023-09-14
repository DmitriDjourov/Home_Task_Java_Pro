package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        HW hw = new HW();

        //Уровень сложности 5 из 10

        // 5.1 Найти сумму всех элементов ArrayList<Integer>.
        List<Integer> numbers_arr = new ArrayList<>();
        numbers_arr.add(5);
        numbers_arr.add(7);
        numbers_arr.add(12);

        int sum = hw.getSum(numbers_arr);
        System.out.println("5.1 Сумма всех элементов  ArrayList<Integer> списка : " + sum);

        // 5.2 Найти среднее значение элементов LinkedList<Integer>.
        LinkedList<Integer> numbers = new LinkedList<>();
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
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Mik");
        strings.add("Dima");
        strings.add("Irina");

        hw.getLongestStreng(strings);

        // 5.5 Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
        System.out.println("5.6 ArrayList с объектами моего класса : ");
        hw.doMyClassList();

        // Уровень сложности 6 из 10:

        // 6.1 Перебрать ArrayList<Integer> и найти наименьший элемент.
        int min = hw.getMinElem(numbers_arr);
        System.out.println("6.1 Наименьший из всех элементов списка : " + min);

        // 6.2 Перебрать LinkedList<Integer> и найти наибольший элемент.
        int max = hw.getMaxElem(numbers);
        System.out.println("6.2 Наибольший из всех элементов списка : " + max);

        // 6.3 Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Cherry");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Cat");

        hw.doArrayListStringStartC(arrayList);

        // 6.4 Перебрать LinkedList<String> и найти первое вхождение определенной строки.
        hw.doAnotherFirstLine(strings);

        // 6.5 Создать LinkedList с объектами вашего собственного класса и удалить все элементы,
        //     удовлетворяющие определенному условию.
        hw.doMyClassListDelElem();

        // Уровень сложности 7 из 10:

        // 7.1 Перебрать ArrayList<Integer> и удалить все четные числа.
        hw.doDelEvenElem();

        // 7.2 Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.
        hw.doReplaceElemMultiples3_zero();

        // 7.3 Перебрать ArrayList<String> и объединить все элементы в одну строку.
        hw.DoAllElemOneString();

        // 7.4 Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.
        hw.getDelElemSpecificString();

        // 7.5 Создать ArrayList с объектами вашего собственного класса и вывести только те,
        //     которые удовлетворяют определенному условию.(все кто старше 20 лет)
        hw.doMyClassListSpecificPrint();

        // Уровень сложности 8 из 10:

        // 8.1 Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.
    }
}