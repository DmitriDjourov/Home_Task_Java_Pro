package org.example.taski.dryKissYagni;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {
    public static String formatDateForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
    
    public static String formatTimeForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(date);
    }

    public static String formatDateTimeForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(date);
    }
}
/**
 * рефакторинг с использованием DateTimeFormatter
 * добавлены методы для работы с LocalDateTime
 */
class NewDateUtils {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static String formatDateForDisplay(Date date) {
        return formatDateForDisplay(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
    }

    public static String formatTimeForDisplay(Date date) {
        return formatTimeForDisplay(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
    }

    public static String formatDateTimeForDisplay(Date date) {
        return formatDateTimeForDisplay(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
    }

    public static String formatDateForDisplay(LocalDateTime localDateTime) {
        return localDateTime.format(dateFormatter);
    }

    public static String formatTimeForDisplay(LocalDateTime localDateTime) {
        return localDateTime.format(timeFormatter);
    }

    public static String formatDateTimeForDisplay(LocalDateTime localDateTime) {
        return localDateTime.format(dateTimeFormatter);
    }
}
