package com.tolik.chellange75;

import java.util.*;

public class FindtheDifferenceofTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var list1 = new ArrayList<Integer>();
        var list2 = new ArrayList<Integer>();
        for (int i : nums1) {
            list1.add(i);
        }
        for (int i : nums2) {
            list2.add(i);
        }
        var set1 = new HashSet<>(list1);
        var set2 = new HashSet<>(list2);

        list2.forEach(set1::remove);
        list1.forEach(set2::remove);

        list1 = new ArrayList<>(set1);
        list2 = new ArrayList<>(set2);

        return List.of(list1, list2);
    }
}
