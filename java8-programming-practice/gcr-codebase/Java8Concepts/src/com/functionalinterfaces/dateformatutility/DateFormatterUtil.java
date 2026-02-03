package com.functionalinterfaces.dateformatutility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatterUtil {

    static String formatDate(LocalDate date, String pattern) 
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
