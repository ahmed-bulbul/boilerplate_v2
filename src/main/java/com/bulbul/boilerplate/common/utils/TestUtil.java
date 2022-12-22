package com.bulbul.boilerplate.common.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestUtil {
    private static final String ON_COND="ON_COND";
    private static final String N_A="N/A";
    private static final List<String> MONTH_LIST = new ArrayList<>(Arrays.asList("JAN","FEB","MAR","OCT","AUG"));

    public static void main(String[] args) {



      //  String type1 = "ON CON.";
        String type2 = "11 MAR 25";
//        String type3 = "12/10/2022";
//        String type4 = "12/07/25";
//        String type5 = "OCT-25"
//        String type6="N/A";
//        String type7 = "AUG 24";

        List<String> dateList = new ArrayList<>();
    //    dateList.add(type1);
        dateList.add(type2);
//        dateList.add(type3);
//        dateList.add(type4);
//        dateList.add(type5);
//        dateList.add(type6);
//        dateList.add(type7);

        TestUtil.convertToDate(dateList);
    }

    private static LocalDate convertToDate(List<String> dateList){

        dateList.forEach(item -> {
            MONTH_LIST.forEach(month -> {
                if (month.contains(item)) {
                    System.out.println("Matched : " + item);
                }
            });

        });

        throw new IllegalArgumentException("String are not valid");

    }
}
