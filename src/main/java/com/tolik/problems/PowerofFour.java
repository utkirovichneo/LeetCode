package com.tolik.problems;

public class PowerofFour {
    public boolean isPowerOfFour(int n) {
        int num = 1;
        for (int i = 0; i < 16 && n > 0; i++) {
            if(num == n)
                return true;
            num *=4;
        }
        return false;
    }
}
