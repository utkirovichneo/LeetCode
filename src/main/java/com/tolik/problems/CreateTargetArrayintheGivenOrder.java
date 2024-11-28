package com.tolik.problems;

import java.util.ArrayList;

public class CreateTargetArrayintheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        var list = new ArrayList<Integer>();
        var array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
