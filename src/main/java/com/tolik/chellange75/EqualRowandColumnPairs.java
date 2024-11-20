package com.tolik.chellange75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowandColumnPairs {
    public int equalPairs(int[][] grid) {
        int counter = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int[] ints : grid) {
            if (map.containsKey(Arrays.toString(ints))) {
                map.put(Arrays.toString(ints), map.get(Arrays.toString(ints)) + 1);
            }
            else{
                map.put(Arrays.toString(ints), 1);
            }
        }
        for (int i = 0; i < grid.length; i++) {
            int[] array = new int[grid[i].length];
            for (int i1 = 0; i1 < grid[i].length; i1++) {
                array[i1] = grid[i1][i];
            }
            if(map.containsKey(Arrays.toString(array))) {
                counter+=map.get(Arrays.toString(array));
            }
        }
        return counter;
    }
}
