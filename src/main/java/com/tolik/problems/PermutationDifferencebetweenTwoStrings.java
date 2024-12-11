package com.tolik.problems;

public class PermutationDifferencebetweenTwoStrings {
    public int findPermutationDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result+=Math.abs(t.indexOf(s.charAt(i)) - i);
        }
        return result;
    }
}
