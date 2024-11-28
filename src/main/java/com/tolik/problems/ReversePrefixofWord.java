package com.tolik.problems;

public class ReversePrefixofWord {
    public String reversePrefix(String word, char ch) {
        boolean k = true;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            builder.append(word.charAt(i));
            if (k && ch == word.charAt(i)) {
                builder.reverse();
                k = false;
            }
        }
        return builder.toString();
    }
}