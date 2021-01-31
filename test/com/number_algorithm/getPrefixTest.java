package com.number_algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getPrefixTest {

    @Test
    void testIfPrefixCanBeGottenFromANumber(){
        int number = 832636;
        int digit = 7;
        String actual = getPrefix.getNumberPrefix(number, digit);
        assertEquals("832636", actual);
    }

}