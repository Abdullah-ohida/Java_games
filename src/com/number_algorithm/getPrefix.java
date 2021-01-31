package com.number_algorithm;

public class getPrefix {

    public static String getNumberPrefix(int number, int digit) {
        String numberToString = Integer.toString(number);
        StringBuilder getNumber = new StringBuilder();
        if(digit < numberToString.length()){
            for(int count = 0; count < digit; count++){
                getNumber.append(numberToString.charAt(count));
            }
        }else {
            return numberToString;
        }
        return getNumber.toString();
    }
}
