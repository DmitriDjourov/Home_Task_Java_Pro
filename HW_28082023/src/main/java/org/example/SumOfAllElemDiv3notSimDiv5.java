package org.example;

public class SumOfAllElemDiv3notSimDiv5 {

  public static void myarray() {
    int[] array = {9, 15, 7, 6, 10, 18, 21};
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 3 == 0 && array[i] % 5 != 0) {
        sum = sum + array[i];
      }
    }
    System.out.println("Cумма всех элементов в массиве, которые делятся на 3 и одновременно не делятся на 5: " + sum);
  }
}
