package org.example;

public class SumPositivArrayElement {
  public static void myarray() {
    int[] array = {-5, 3, 9, 6, 5, 20, 0, -8};
    double sum = 0;
    int count = 0;


    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        sum = sum + array[i];
        count++;
      }
    }
    if (count > 0) {
      double averSum = sum / count;
      System.out.println("Cреднее арифметическое положительных элементов массива :" + averSum);
    } else {
      System.out.println("В этом массиве нет положительных элементов.");
    }
  }
}
