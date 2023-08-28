package org.example;

public class SumPositivArrayElement {
  public static void myarray(){
    int[] array = { 5, -2, 9, -7, 3, 1, 0, 8 };
    double sum = 0;
    int count =0;

    for (int i = 0; i < array.length; i++) {
      if (array[i]>0) {
        sum = sum + array[i];
        count++;
      }
    }
    if (count >0){
      System.out.println("Cреднее арифметическое положительных элементов массива :" + count);
    } else {
      System.out.println("В этом массиве нет положительных элементов.");
    }
  }
}
