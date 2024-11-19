package com.tolik.chellange75;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int fromIndex = -1;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            int indexOf = t.indexOf(s.charAt(i), fromIndex);
            if (indexOf !=-1) {
                fromIndex = indexOf + 1;
                counter++;
            }
        }
        return counter == s.length();
    }
}