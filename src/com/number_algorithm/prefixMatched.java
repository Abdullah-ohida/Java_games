package com.number_algorithm;

public class prefixMatched {
    public static boolean isPrefix(int number, int digit) {
        String numberToString = Integer.toString(number);
        String digitToString = Integer.toString(digit);
        if(numberToString.charAt(0) == digitToString.charAt(0)){
            return true;
        }
        return false;
    }
}
