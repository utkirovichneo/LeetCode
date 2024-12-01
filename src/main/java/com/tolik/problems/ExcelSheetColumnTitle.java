package com.tolik.problems;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            builder.append((char)(columnNumber % 26 + 65));
            columnNumber /= 26;
        }
        return builder.reverse().toString();
    }
}
