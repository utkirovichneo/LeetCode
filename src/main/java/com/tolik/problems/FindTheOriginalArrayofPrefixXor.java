package com.tolik.problems;

public class FindTheOriginalArrayofPrefixXor {
    public int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        int x = 0;
        for (int i = 0; i < pref.length; i++) {
            result[i] = pref[i] ^ x;
            x ^= pref[i];
        }
        return result;
    }
}
