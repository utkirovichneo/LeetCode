package com.tolik.chellange75;

import java.util.Objects;

public class GreatestCommonDivisorofStrings {

    public static String gcdOfStrings(String str1, String str2) {

        if(!Objects.equals(str1+str2, str2+str1)){
            return "";
        }
            int ekub = ekub(str1.length(), str2.length());
        return str1.substring(0, ekub);
    }

    public static int ekub(int a, int b) {
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}