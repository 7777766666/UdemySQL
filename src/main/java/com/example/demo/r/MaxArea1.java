package com.example.demo.r;

public class MaxArea1 {

    public static void main(String[] args) {
        MaxArea1 maxArea = new MaxArea1();
//        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height = {1, 5, 10,  10, 1, 6, 1};
        System.out.println((maxArea.maxArea(height)) + "  answer");
    }


    public int maxArea(int[] height) {


        int maxValue = 0;
        int big = 0;
        int small = 0;

        if (height.length == 2) return Math.min(height[0], height[1]);

        if (height[0] < height[1]) {
            big = height[1];
            small = height[0];
        } else {
            big = height[0];
            small = height[1];
        }


        for (int i = 1; i < height.length - 1; i++) {
            if (big < height[i + 1]) {
                small = big;
                big = height[i + 1];
                System.out.println(big);
                System.out.println(small);
            } else if (small < height[i + 1]) {
                small = height[i + 1];
                System.out.println(big);
                System.out.println(small);

            }
        }
        if (small == 0) return 0;

//        int l = 0;
//        int r = height.length - 1;
        int value = 0;
        for (int i = 0; i < small; i++) {
            int l = 0;
            int r = height.length - 1;
            while (height[l] < i){
                l++;
            }
            while (height[r] < i){
                r--;
            }
            value = i * (r - l);
            System.out.println(i + " i " + l + " l " + r + " r" + "  result " + value);
            maxValue = Math.max(maxValue, value);
        }



//        int value = height[r] - height[l];
//        maxValue = Math.max(maxValue, value);

        return maxValue;


    }

}
