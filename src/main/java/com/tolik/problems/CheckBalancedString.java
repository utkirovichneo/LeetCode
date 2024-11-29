package com.tolik.problems;

public class CheckBalancedString {
    public boolean isBalanced(String num) {
        int odd = 0, even = 0;
        char[] array = num.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(i%2 == 0)
                odd += (array[i] - '0');
            else
                even += (array[i] - '0');
        }
        return odd == even;
    }
}
