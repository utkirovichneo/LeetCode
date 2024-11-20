package com.tolik.chellange75;

import java.util.Stack;

public class RemovingStarsFromaString {

    public String removeStars(String s) {
        StringBuilder builder = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if(c == '*') {
                if(!builder.isEmpty()) {
                    builder.deleteCharAt(builder.length() - 1);
                }
            }
            else{
                builder.append(c);
            }
        }
        return builder.toString();
    }
}