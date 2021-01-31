package com.credit_card_validation;

public class CreditCardValidation {

    public static boolean isVisaCard(String creditCard) {
        if(creditCard.charAt(0) == '4'){
            return true;
        }
        return false;
    }
}
