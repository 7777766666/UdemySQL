package com.example.demo.coducation;

import java.util.Arrays;

public class Jump {

    public static void main(String[] args) {
        int[] nums = {2, 3, 0, 1, 4};
        System.out.println(Jump.jump(nums));
    }

    public static int jump(int[] nums) {

        int length = nums.length;
        if (length == 1) return 0;
        if (length == 2) return 1;
        int[] way = new int[length];
        nums[length - 1] = 0;

        for (int i = length - 2; i >= 0; i--) {
            int count = 2;
            if (nums[i] != 0) {
                way[i] = way[i + 1];
                while (count + i != length && count <= nums[i]) {
                    way[i] = Math.min(way[count + i], way[i]);
                    count++;
                }
                way[i] += 1;
            } else {
                way[i] = 100_000;
            }
        }
        return way[0];
    }
}
