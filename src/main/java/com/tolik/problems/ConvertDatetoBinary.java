package com.tolik.problems;

public class ConvertDatetoBinary {
    public String convertDateToBinary(String date) {
        StringBuilder result = new StringBuilder();
        String[] elements = date.split("-");
        result.append(Integer.toBinaryString(Integer.parseInt(elements[0])));
        result.append("-");
        result.append(Integer.toBinaryString(Integer.parseInt(elements[1])));
        result.append("-");
        result.append(Integer.toBinaryString(Integer.parseInt(elements[2])));
        return result.toString();
    }
}