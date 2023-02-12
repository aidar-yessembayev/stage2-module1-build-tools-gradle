package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen
        if (str.isEmpty()) {
            return false;
        }

        try {
            int number = Integer.parseInt(str);

            if (number > 0) {
                return true;
            }

        } catch(NumberFormatException e) {
            return false;

        } catch(NullPointerException e) {
            return false;
        }

        return false;
    }
}
