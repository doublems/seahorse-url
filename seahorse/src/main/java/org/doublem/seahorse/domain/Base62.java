package org.doublem.seahorse.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Base62 {

    private static final char[] codes = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z',
    };

    /**
     * Convert decimal to base62
     * @param decimalNumber
     * @return base62 in string
     */
    public static String execute(int decimalNumber) {

        int quotient = decimalNumber;
        List<Character> reminder = new ArrayList<>();

        while (quotient >= 62) {
            reminder.add(codes[quotient % 62]);
            quotient = quotient / 62;
        }

        StringBuffer result = new StringBuffer(String.valueOf(codes[quotient]));

        for (Character c : reminder) {
            result.append(c);
        }

        return result.toString();
    }

    /**
     * Convert base62 to decimal
     * @param base62Number
     * @return decimal in int
     */
    public static int execute(String base62Number) {

        char[] arr = base62Number.toCharArray();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int exponent = arr.length - i - 1;

            int value = Arrays.binarySearch(codes, arr[i]);

            if(value < 0){
                throw new IllegalArgumentException(CustomError.NO_BASE62_CODE.toString());
            }

            result += (int) Math.pow(62, exponent) * value;
        }

        return result;
    }

}