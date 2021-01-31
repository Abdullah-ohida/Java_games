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
    void creditCard_isAmericanExpressCard(){
        String creditCard = "375758848388374";
        boolean actual = CreditCardValidation.isAmericanExpressCardCard(creditCard);
        assertTrue(actual);
    }

    @Test
    void creditCard_isDefaultCard(){
        String creditCard = "675758848388374";
        boolean actual = CreditCardValidation.isDefaultCard(creditCard);
        assertTrue(actual);
    }

    @Test
    void testIfCreditCardIsValid(){
        String creditCard = "4388576018402626";
        String cardType = CreditCardValidation.isValid(creditCard);
        assertEquals("visa card", cardType);

        creditCard = "5388576018402626";
        cardType = CreditCardValidation.isValid(creditCard);
        assertEquals("master card", cardType);

        creditCard = "3788576018402626";
        cardType = CreditCardValidation.isValid(creditCard);
        assertEquals("american express card", cardType);

        creditCard = "6388576018402626";
        cardType = CreditCardValidation.isValid(creditCard);
        assertEquals("default card", cardType);

        creditCard = "8588576018402626";
        cardType = CreditCardValidation.isValid(creditCard);
        assertNull(cardType);

    }

    @Test
    void testForTheSumOfDoubleEvenPlaceInCreditCardNumber() {
    }


}