package com.tolik.problems;

public class SubtracttheProductandSumofDigitsofanInteger {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int subtract = 1;
            while (n > 0) {
                sum += n % 10;
                subtract *= n % 10;
                n /= 10;
            }
        return subtract - sum;
    }
}
