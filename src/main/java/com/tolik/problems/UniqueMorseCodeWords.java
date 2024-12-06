package com.tolik.problems;

import java.util.HashSet;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        var set = new HashSet<String>();
        String[] morse = new String[]{
                ".-","-...","-.-.","-..",".",
                "..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--",
                "--.."
        };
        for (String word : words) {
            StringBuilder builder = new StringBuilder();
            char[] wordChars = word.toCharArray();
            for (char wordChar : wordChars) {
                builder.append(morse[wordChar - 'a']);
            }
            set.add(builder.toString());
        }
        return set.size();
    }
}
