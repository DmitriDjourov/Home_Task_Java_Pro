package org.example.taski.dryKissYagni;

import java.util.List;

public class MathUtils {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
}
/**
 *
 */


class MathUtilsSumsOfNums {

    public static int calculateSum(int[] numbers) {
        if (numbers == null) {// проверка на null
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int calculateSum(List<Integer> numbers) {
        if (numbers == null) {// проверка на null
            throw new IllegalArgumentException("Input list cannot be null");
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
}
