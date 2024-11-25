package com.tolik.problems;

import java.util.stream.IntStream;

public class ScoreofaString {
    public int scoreOfString(String s) {
        return IntStream.range(1, s.length())
                .map(i -> Math.abs(s.charAt(i) - s.charAt(i - 1)))
                .sum();
    }
}
