package com.bulbul.boilerplate.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class FlexibleDateParser {

    private static List<ThreadLocal<SimpleDateFormat>> threadLocals = new ArrayList<ThreadLocal<SimpleDateFormat>>();

    public FlexibleDateParser(List<String> formats, final TimeZone tz){
        threadLocals.clear();
        for (final String format : formats) {
            ThreadLocal<SimpleDateFormat> dateFormatTL = new ThreadLocal<SimpleDateFormat>() {
                protected SimpleDateFormat initialValue() {
                    SimpleDateFormat sdf = new SimpleDateFormat(format);
                    sdf.setTimeZone(tz);
                    sdf.setLenient(false);
                    return sdf;
                }
            };
            threadLocals.add(dateFormatTL);
        }
    }

    public static Date parseDate(String dateStr) throws ParseException {
        for (ThreadLocal<SimpleDateFormat> tl : threadLocals) {
            SimpleDateFormat sdf = tl.get();
            try {
                return sdf.parse(dateStr);
            } catch (ParseException e) {
                // Ignore and try next date parser
            }
        }
        // All parsers failed
        return null;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(parseDate("11-Mar-25"));
    }
}
