package com.number_algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class prefixMatchedTest {
    @Test
    void checkIfADigitCanBePrefixOfANumber(){
        int number = 7464;
        int digit = 7;
        boolean actual  = prefixMatched.isPrefix(number, digit);
        assertTrue(actual);
    }
}