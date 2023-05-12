package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        if(str==null) return false;
        if(str.startsWith("0") && !str.matches("0[.][0-8]+")) return false;

        try {
            double number = Double.parseDouble(str);
            return  number>0;
        } catch (NumberFormatException nfe) {
            return false;
        }

    }
}
