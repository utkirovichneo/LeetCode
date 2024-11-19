package com.tolik.chellange75;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int area = -1;
        int left = 0, right = height.length - 1;
        while(left < right){
            int area1 = Math.min(height[left], height[right]) * (right - left);
            if(area1 > area) {
                area = area1;
            }
                if(height[left] < height[right]){
                    left++;
                }
                else{
                    right--;
                }
        }
        return area;
    }
}