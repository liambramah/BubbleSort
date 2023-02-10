package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    @DisplayName("Given an array of ints, BubbleSort sorts them in ascending order")
    public void givenAnArrayOfInts_BubbleSort_SortsThemInAscendingorder(){
        int[] expectedArray = {2, 14, 32, 54, 67};
        BubbleSort sortArray = new BubbleSort();
        int[] startingArray = {14, 32, 2, 67, 54};
        int[] result = sortArray.sort(startingArray);
        Assertions.assertArrayEquals(expectedArray, result);
    }

}