package com.bulbul.boilerplate.common.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class TestUtil {
    private static final String ON_COND = "ON_COND";
    private static final String N_A = "N/A";
    private static final List<String> MONTH_LIST = new ArrayList<>(Arrays.asList("JAN", "Mar", "FEB", "MAR", "OCT", "AUG"));

    public static void main(String[] args) {

        String type1 = "ON CON.";
        String type2 = "11-Mar-25";
        String type3 = "12/10/2022";
        String type4 = "12/07/25";
        String type5 = "OCT-25";
        String type6 = "N/A";
        String type7 = "AUG 24"; // adding year  from another row


        System.out.println("=======" + convertToDate(type2));

        // no problem now, DateTimeFormatter always uses Locale.US
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy", Locale.US);
        LocalDate localDate = LocalDate.parse(convertToDate(type2), formatter);
        System.out.println(localDate);  //default, print ISO_LOCAL_DATE

        System.out.println(formatter.format(localDate)); // print formatted date
    }

    private static String convertToDate(String shelfDate) {
        final String[] dayStr = new String[1];
        final String[] monthStr = new String[1];
        final String[] yearStr = new String[1];

        MONTH_LIST.forEach(month -> {
            if (shelfDate.contains(month)) {
                int index = shelfDate.indexOf(month);
                if (index != 0) {
                    yearStr[0] = shelfDate.substring(index + 4, index + 6);
                    monthStr[0] = shelfDate.substring(index, index + 3);
                    dayStr[0] = shelfDate.substring(0, 2);
                } else {
                    yearStr[0] = shelfDate.substring(index + 3, index + 6);
                    monthStr[0] = shelfDate.substring(index, index + 3);
                }
            }
            if (shelfDate.contains("/")) {

            }
            if (shelfDate.contains("-")) {

            }

        });
        return dayStr[0] + "-" + monthStr[0] + "-" + "20" + yearStr[0];
    }
}
