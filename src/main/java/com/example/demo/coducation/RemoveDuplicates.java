package com.example.demo.coducation;

public class RemoveDuplicates {

    public static void main(String[] args) {

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] x = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates.removeDuplicates1(x));

    }

    public int removeDuplicates1(int[] nums) {

        int l = nums[nums.length - 1];
        return 666;

    }


    public int removeDuplicates(int[] nums) {

        int l = 0;
        int r = l + 1;
        while (r != nums.length) {
            if (nums[l] == nums[r]) {
                r++;
            } else {
                if (r - l > 1) {
                    nums[l + 1] = nums[r];
                }
                l++;
                r++;
            }
        }
        return l + 1;
    }
}

