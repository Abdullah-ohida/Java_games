package com.credit_card_validation;

public class CreditCardValidation {

    public static boolean isVisaCard(String creditCard) {
        return isValidCreditCard(creditCard, '4');
    }

    public static boolean isMasterCard(String creditCard) {
        return isValidCreditCard(creditCard, '5');
    }

    public static boolean isDefaultCard(String creditCard) {
        return isValidCreditCard(creditCard, '6');
    }

    public static boolean isAmericanExpressCardCard(String creditCard) {
        return creditCard.charAt(0) == '3' && creditCard.charAt(1) == '7' && validateCardLength(creditCard);
    }

    private static boolean validateCardLength(String creditCard) {
        return creditCard.length() > 12 && creditCard.length() < 17;
    }

    private static boolean isValidCreditCard(String creditCard, char digit) {
        return creditCard.charAt(0) == digit && validateCardLength(creditCard);
    }

    public static String getCreditCardName(String creditCard){
        String cardType;
        if(isVisaCard(creditCard)){
            cardType = "visa card";
        }else if(isMasterCard(creditCard)){
            cardType = "master card";
        }else if(isDefaultCard(creditCard)){
            cardType = "default card";
        }else if(isAmericanExpressCardCard(creditCard)){
            cardType = "american express card";
        }else {
            cardType = null;
        }
        return cardType;
    }

    public static int sumOfDoubleEvenPlace(String creditCard) {
        int stringToNumber;
        int sumOfDigitLesserThanFive = 0;
        int sumOfDigitGreaterThanFour = 0;

        for (int count = 0; count < creditCard.length(); count++){
            if(isEvenPlace(count)){
                stringToNumber = convertStringToNumber(creditCard, count);
                sumOfDigitLesserThanFive = sumOfDigitLesserThanFive(stringToNumber, sumOfDigitLesserThanFive);
                sumOfDigitGreaterThanFour = sumOfDigitGreaterThanFour(stringToNumber, sumOfDigitGreaterThanFour);
            }
        }
        return sumOfDigitLesserThanFive + sumOfDigitGreaterThanFour;
    }

    private static boolean isEvenPlace(int count) {
        return count % 2 == 0;
    }

    private static int sumOfDigitGreaterThanFour(int stringToNumber, int sum) {
        if(stringToNumber > 4){
            sum += ((stringToNumber * 2) % 10) + 1;
        }
        return sum;
    }

    private static int sumOfDigitLesserThanFive(int stringToNumber, int sumEvenPlaceNumber) {
        if(stringToNumber < 5){
            sumEvenPlaceNumber += stringToNumber * 2;
        }
        return sumEvenPlaceNumber;
    }

    private static int convertStringToNumber(String creditCard, int count) {
        return Integer.parseInt(String.valueOf(creditCard.charAt(count)));
    }

    public static int sumOfOddPlace(String creditCard) {
        int sumOddDigits = 0;
        for (int count = 0; count < creditCard.length(); count++){
            if(isOddPlace(count)){
                int stringToNumber = convertStringToNumber(creditCard, count);
                sumOddDigits += stringToNumber;
            }
        }
        return sumOddDigits;
    }

    private static boolean isOddPlace(int count) {
        return count % 2 == 1;
    }

    public static int sumOfEvenAndOddPlace(String creditCard) {
        return sumOfDoubleEvenPlace(creditCard) + sumOfOddPlace(creditCard);
    }

    public static boolean isValidCreditCard(String creditCard) {
        return sumOfEvenAndOddPlace(creditCard) % 10 == 0;
    }
}
