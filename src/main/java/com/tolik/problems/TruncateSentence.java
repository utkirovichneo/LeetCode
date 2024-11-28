package com.tolik.problems;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        StringBuilder builder = new StringBuilder();
        String[] words = s.split("\\s+");
        for (int i = 0; i < Math.min(k, words.length); i++) {
            builder.append(words[i]);
                if(i != words.length-1)
                    builder.append(" ");
        }
        return builder.toString();
    }
}
