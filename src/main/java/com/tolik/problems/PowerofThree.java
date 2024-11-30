package com.tolik.problems;

public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        if(n == 1)
            return true;
        if(n < 0)
            return false;
        for (int i = 0; i < 22; i++) {
            if (n == Math.pow(3, i))
                return true;
        }
        return false;
    }
}
