package org.example.taski.dryKissYagni;

import java.util.stream.Collectors;

public class StringUtils {
    public static String toUpperCase(String input) {
        // Сложная реализация для простой операции
        // ...
        return input.chars()
                .mapToObj(Character::toString)
                .map(s -> {
                    // Добавляем дополнительную логику преобразования, например, пропуск знаков препинания
                    if (s.equals(" ")) {
                        return " ";
                    } else {
                        return s.toUpperCase();
                    }
                })
                .collect(Collectors.joining());
    }
}
/**
 * рефакторинг.
 *  код использует регулярное выражение \\b(?!\\s)\\w, чтобы сопоставить все слова, кроме пробелов,
 *  и применяет String::toUpperCase для преобразования каждого символа в верхний регистр.
 */
//public class NewStringUtils {
//
//    public static String toUpperCase(String input) {
//        if (input == null) {
//            throw new IllegalArgumentException("Input string cannot be null");
//        }
//        return input.replaceAll("\\b(?!\\s)\\w", String::toUpperCase);
//    }
//}
