package com.tolik.problems;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int number = 0;
        int length = columnTitle.length();
        for (int i = 0; i < length; i++) {
            number = number * 26 + columnTitle.charAt(i) - 64;
        }
        return number;
    }
}
