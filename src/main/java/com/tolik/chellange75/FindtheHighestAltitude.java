package com.tolik.chellange75;

public class FindtheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int result = Math.max(gain[0], 0);
        int sum = gain[0];
            for (int i = 0; i < gain.length - 1; i++) {
                sum += gain[i+1];
                    if(result < sum)
                        result = sum;
            }
        return result;
    }
}
