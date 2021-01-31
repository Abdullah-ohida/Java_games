package com.credit_card_validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationTest {

    @Test
    void creditCard_isVisaCard(){
        String creditCard = "485758848388374";
        boolean actual = CreditCardValidation.isVisaCard(creditCard);
        assertTrue(actual);
    }

    @Test
    void creditCard_isMasterCard(){
        String creditCard = "545758848388374";
        boolean actual = CreditCardValidation.isMasterCard(creditCard);
        assertTrue(actual);
    }

    @Test
    void creditCard_isAmericanExpressCardCard(){
        String creditCard = "375758848388374";
        boolean actual = CreditCardValidation.isAmericanExpressCardCard(creditCard);
        assertTrue(actual);
    }

}