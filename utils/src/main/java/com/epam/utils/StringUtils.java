package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen
        int number = Integer.parseInt(str);

        if (number > 0) {
            return true;
        }

        return false;
    }
}
