package com.tolik.problems;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if(sum > maxWealth)
                maxWealth = sum;
        }
        return maxWealth;
    }
}
