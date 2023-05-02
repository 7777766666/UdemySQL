package com.example.demo.r;

public class MaxArea {

    public static void main(String[] args) {
        MaxArea maxArea = new MaxArea();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] height = {4,3,2,1,4};
        System.out.println((maxArea.maxArea(height)) + "  answer");
    }


    public int maxArea(int[] height) {

        int maxValue = 0;
        int l = 0;
        int r = height.length - 1;
        int value;
        int i = 1;
        while (true) {
            if (height[l] < i) {
                while (height[l] < i && l != r) {
                    l++;
                }
            }
            if (height[r] < i && l != r) {
                while (height[r] < i) {
                    r--;
                }
            }
            if (l == r) return maxValue;
            value = i * (r - l);
            maxValue = Math.max(maxValue, value);
            i++;
        }
    }
}