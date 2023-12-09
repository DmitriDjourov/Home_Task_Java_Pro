package org.example.taski.dryKissYagni;

public class SUT {

    public static String toUpperCase1(String input) {
        return input.toUpperCase();
    }

    public static String toLowerCase2(String input) {
        return input.toLowerCase();
    }

    public static char[] toCharArray2(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(i);
        }
        return result;
    }
}

/**
 * рефакторинг
 * метод toUpperCase1 убрана 1
 * метод toLowerCase2 убрана 2
 * метод toCharArray2 убрана 2
 *
 */
 class NewSUT {

    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }

    public static char[] toCharArray(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(i);
        }
        return result;
    }
}

