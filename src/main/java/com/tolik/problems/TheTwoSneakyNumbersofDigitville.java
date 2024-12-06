package com.tolik.problems;

import java.util.HashSet;

public class TheTwoSneakyNumbersofDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        var set = new HashSet<Integer>();
        var array = new int[2];
        int index = 0;
        for (int num : nums) {
            if (set.contains(num)) {
                array[index++] = num;
            }
            else {
                set.add(num);
            }
        }
        return array;
    }
}