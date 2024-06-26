package com.example.Xuong_duAn_L1.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    private static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";
    private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);

    public static String format(LocalDate date) {
        return format(date, DEFAULT_DATE_FORMAT);
    }

    public static String format(LocalDate date, String pattern) {
        if (date == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    public static LocalDate parse(String dateString) {
        return parse(dateString, DEFAULT_DATE_FORMAT);
    }

    public static LocalDate parse(String dateString, String pattern) {
        if (dateString == null || dateString.trim().isEmpty()) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(dateString, formatter);
    }
}
