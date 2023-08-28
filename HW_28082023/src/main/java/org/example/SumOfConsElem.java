package org.example;

public class SumOfConsElem {
  public static void myarray() {
    int[] array = {-5, 3, 9, 6, 5, 20, 0, -8};
    int sum = Integer.MIN_VALUE;
    int tempSum = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        tempSum = tempSum + array[j];
        sum = Math.max(sum, tempSum);
      }
    }
    System.out.println("Наибольшая сумму подряд идущих элементов :" + sum);
  }
}
