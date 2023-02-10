package com.sparta;

public class PrintArray {
    public String printArray(int numbers[]){
        int length = numbers.length;
        String printedString = "";
        for (int i = 0; i < length; ++i){
            printedString = printedString + numbers[i] + " ";
        }
        return printedString;
    }
}
