package com.number_algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getSizeOfNumberTest {

    @Test
    void testIfSizeOfDigitCanBeObtain(){
        int number = 73232776;
        int actual = getSizeOfNumber.getSize(number);
        assertEquals(actual, 8);
    }

}