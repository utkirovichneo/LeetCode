package com.tolik.problems;

public class FindMinimumOperationstoMakeAllElementsDivisiblebyThree {
    public int minimumOperations(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if(num % 3 != 0)
                counter++;
        }
        return counter;
    }
}