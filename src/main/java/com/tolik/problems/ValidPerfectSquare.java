package com.tolik.problems;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        for (long i = 1; i*i <= num; i++){
            if (num == i * i)
                return true;
        }
        return false;
    }
}
