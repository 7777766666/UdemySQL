package com.example.demo.r;

public class MaxAreaSend {

    public static void main(String[] args) {
        MaxAreaSend maxArea = new MaxAreaSend();
//        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height = {1, 5, 10, 10, 1, 6, 1};
        System.out.println((maxArea.maxArea(height)) + "  answer");
    }


    public int maxArea(int[] height) {


        int length = height.length - 1;
        if (length == 1) return Math.min(height[0], height[1]);

        int maxValue = 0;
        int l = 0;
        int r = length;
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
            if (maxValue < value) {
                maxValue = value;
            }
            i++;
        }
    }
}