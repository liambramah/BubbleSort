package com.sparta;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int numbers[] = {32, 5, 19, 14, 26, 81, 9};
        int sortedNumbers[] = BubbleSort.sort(numbers);
        PrintArray newArray = new PrintArray();
        System.out.println(newArray.printArray(sortedNumbers));
    }
}