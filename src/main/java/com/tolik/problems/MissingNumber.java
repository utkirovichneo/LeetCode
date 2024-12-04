package com.tolik.problems;

import java.util.ArrayList;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        var list = new ArrayList<Integer>();
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.contains(i)) {
                return i;
            }
        }
        return list.size();
    }
}
