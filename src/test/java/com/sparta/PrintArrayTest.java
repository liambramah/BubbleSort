package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PrintArrayTest {

    @Test
    @DisplayName("Given an Int array, PrintArray prints a string of numbers")
    public void givenAnArray_PrintArray_PrintsAStringOfNumbers(){
        String expectedString = "3 6 14 9 2 23 ";
        int[] intArray = {3, 6, 14, 9, 2, 23};
        PrintArray testArray = new PrintArray();
        String result = testArray.printArray(intArray);
        Assertions.assertEquals(expectedString, result);
    }
}