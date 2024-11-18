package com.tolik.chellange75;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var result = new ArrayList<Boolean>();
        int max = 0;
        for (int candy : candies) {
            if (candy > max)
                max = candy;
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}