package com.tolik.chellange75;

public class MaximumAverageSubarray_I {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        if(nums.length == k){
            return sum/k;
        }
        double max = sum / k;
        for (int i = 0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[i + k];
            if(max < sum/k)
                    max = sum/k;
        }
        return max;
    }
}
