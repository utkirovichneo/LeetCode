package com.tolik.chellange75;

import java.util.Arrays;

public class ReverseWordsinaString {

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder builder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            builder.append(words[i]);
                if(i != 0){
                    builder.append(" ");
                }
        }
        return builder.toString();
    }
}
