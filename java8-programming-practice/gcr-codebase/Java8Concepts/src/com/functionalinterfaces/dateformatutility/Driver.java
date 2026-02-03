package com.functionalinterfaces.dateformatutility;

import java.time.LocalDate;

public class Driver {
  public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String format1 = DateFormatterUtil.formatDate(today, "dd-MM-yyyy");
        String format2 = DateFormatterUtil.formatDate(today, "yyyy/MM/dd");
        String format3 = DateFormatterUtil.formatDate(today, "MMM dd, yyyy");

        System.out.println("Format 1: " + format1);
        System.out.println("Format 2: " + format2);
        System.out.println("Format 3: " + format3);
    }
}
