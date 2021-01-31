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

}