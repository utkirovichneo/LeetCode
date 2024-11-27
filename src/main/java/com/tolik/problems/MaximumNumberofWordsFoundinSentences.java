package com.tolik.problems;

public class MaximumNumberofWordsFoundinSentences {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (String sentence : sentences) {
            int length = sentence.split("\\s+").length;
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}
