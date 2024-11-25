package com.tolik.problems;

import java.util.ArrayList;

public class BuildArrayfromPermutation {
    public int[] buildArray(int[] nums) {
        var array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[nums[i]];
        }
        return array;
    }

}
