package com.tolik.problems;

import java.util.List;
import java.util.stream.IntStream;

public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        return IntStream.range(0, words.length)
                .filter(i -> words[i].contains(String.valueOf(x)))
                .boxed()
                .toList();
    }
}
