package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Hw hw = new Hw();

        //Уровень сложности 5 из 10

        // 5.1 Найти сумму всех элементов ArrayList<Integer>.
        hw.getSum();

        // 5.2 Найти среднее значение элементов LinkedList<Integer>.
        hw.getAvg();

        // 5.3 Перебрать ArrayList<String> и вывести все элементы на экран.
        hw.ArrayList();

        // 5.4 Перебрать LinkedList<String> и найти самую длинную строку.
        hw.getLongestStreng();

        // 5.5 Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
        hw.doMyClassList();

        // Уровень сложности 6 из 10:

        // 6.1 Перебрать ArrayList<Integer> и найти наименьший элемент.
        hw.getMinElem();

        // 6.2 Перебрать LinkedList<Integer> и найти наибольший элемент.
        hw.getMaxElem();

        // 6.3 Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
        hw.doArrayListStringStartC();

        // 6.4 Перебрать LinkedList<String> и найти первое вхождение определенной строки.
        hw.doAnotherFirstLine();

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
        hw.doSumSumSquaresAllNumbers();

        // 8.2 Перебрать LinkedList<Integer> и вычислить произведение всех элементов.
        hw.doProductAllNumbers();

        // 8.3 Перебрать ArrayList<String> и найти самую короткую строку.
        hw.getShortestString();

        // 8.4 Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.
        hw.getReplacingVowelsWithStars();

        // 8.5 Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.
        hw.getSortDescendingOrder();

        // Уровень сложности 9 из 10

        // 9.1 Перебрать ArrayList<Integer> и найти второй по величине элемент.
        hw.FindSecondLargestElement();

        // 9.2 Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.
        hw.ElemReverseOrder();

        // 9.3 Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
        hw.getOnlyStringsWithLetters();

        // 9.4 Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.
        hw.getlongestStringWithoutSpaces();

        // 9.5 Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
        hw.getOnlyUnicElem();

        // Уровень сложности 10 из 10:

        // 10.1 Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.
        hw.getFindLargestIncreasingSequenceElem();

    }
}