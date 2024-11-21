package com.tolik.math;

public class ReverseInteger {
    public int reverse(int x) {
        int result;
        String number = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
        try{
            result = Integer.parseInt(number);
        }
        catch (NumberFormatException e){
            return 0;
        }
        return x > 0 ? result : -result;
    }
}