package com.tolik.problems;

public class JewelsandStones {
    public int numJewelsInStones(String jewels, String stones) {
        char[] stonesCharArray = stones.toCharArray();
        int count = 0;
        for (char c : stonesCharArray) {
            if (jewels.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }
}
