package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        for (int i = 0; i < args.size(); i++) {
            if (!StringUtils.isPositiveNumber(args.get(i))) {
                return false;
            }
        }

        return true;
    }
}