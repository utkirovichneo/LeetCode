package com.tolik.chellange75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Long> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        i -> i,
                        Collectors.counting()
                ));
        var set = new HashSet<Long>();
            map.forEach((k, v) -> set.add(v));
                return set.size() == map.size();
    }
}