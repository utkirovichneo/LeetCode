package com.tolik.problems;

public class ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        var result = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[nums.length + i] = nums[i];
        }
        return result;
    }
}
