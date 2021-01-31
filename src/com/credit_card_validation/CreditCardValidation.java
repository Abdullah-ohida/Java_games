package com.credit_card_validation;

public class CreditCardValidation {

    public static boolean isVisaCard(String creditCard) {
        return ValidateCheckCard(creditCard, '4');
    }

    public static boolean isMasterCard(String creditCard) {
        return ValidateCheckCard(creditCard, '5');
    }

    private static boolean validateCardLength(String creditCard) {
        return creditCard.length() > 12 && creditCard.length() < 17;
    }

    private static boolean ValidateCheckCard(String creditCard, char digit) {
        boolean isValid = false;
        if (creditCard.charAt(0) == digit && validateCardLength(creditCard)) {
            isValid = true;
        }
        return isValid;
    }
}
