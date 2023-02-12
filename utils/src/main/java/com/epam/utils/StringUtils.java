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
            float number_2 = Float.parseFloat(str);

            if (number_2 > 0.0) {
                return true;
            }

            return false;

        } catch(NullPointerException e) {
            return false;
        }

        return false;
    }
}
