package com.tolik.chellange75;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int cursor = -1;
        int leftSum = 0;
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
            for (int i = 0; i < nums.length; i++) {
                leftSum += nums[i];
                    if(leftSum == rightSum - nums[i])
                        cursor = i;
                rightSum -= nums[i];
            }
        return cursor;
    }
}
