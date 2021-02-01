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
        String cardType = CreditCardValidation.getCreditCardName(creditCard);
        assertEquals("visa card", cardType);

        creditCard = "5388576018402626";
        cardType = CreditCardValidation.getCreditCardName(creditCard);
        assertEquals("master card", cardType);

        creditCard = "3788576018402626";
        cardType = CreditCardValidation.getCreditCardName(creditCard);
        assertEquals("american express card", cardType);

        creditCard = "6388576018402626";
        cardType = CreditCardValidation.getCreditCardName(creditCard);
        assertEquals("default card", cardType);

        creditCard = "8588576018402626";
        cardType = CreditCardValidation.getCreditCardName(creditCard);
        assertNull(cardType);

    }

    @Test
    void testForTheSumOfDoubleEvenPlaceInCreditCardNumber() {
        String creditCard = "4388576018402626";
        String cardType = CreditCardValidation.getCreditCardName(creditCard);
        assertEquals("visa card", cardType);

        int sumOfEven = CreditCardValidation.sumOfDoubleEvenPlace(creditCard);
        assertEquals(37, sumOfEven);
    }

    @Test
    void testForTheSumOfOddPlaceInCreditCard(){
        String creditCard = "4388576018402626";
        String cardType = CreditCardValidation.getCreditCardName(creditCard);
        assertEquals("visa card", cardType);

        int sumOfOdd = CreditCardValidation.sumOfOddPlace(creditCard);
        assertEquals(38, sumOfOdd);
    }

    @Test
    void testForTheTotalSumOfEvenAndOddNumberInCreditCard(){
        String creditCard = "4388576018402626";
        String cardType = CreditCardValidation.getCreditCardName(creditCard);
        assertEquals("visa card", cardType);

        int sumOfEvenAndOdd = CreditCardValidation.sumOfEvenAndOddPlace(creditCard);
        assertEquals(75, sumOfEvenAndOdd);
    }

    @Test
    void creditCard_isValid(){
        String creditCard = "4388576018410707";
        String cardType = CreditCardValidation.getCreditCardName(creditCard);
        assertEquals("visa card", cardType);

        boolean isValid = CreditCardValidation.isValidCreditCard(creditCard);
        assertTrue(isValid);

    }

}