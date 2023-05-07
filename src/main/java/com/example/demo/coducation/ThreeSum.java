package com.example.demo.coducation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public static void main(String[] args) {

        int[] nums = {0, 0, 0, 7, 0, 5, -7, -6};


        List<List<Integer>> listInteger = new ArrayList<>();


        System.out.println(ThreeSum.threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int binaryZero = Arrays.binarySearch(nums, 0, nums.length - 1, 0);
        int i = 0;
        int j = nums.length - 1;
        int k = -1;
        while (j - i > 2) {

            if (nums[i] >= 0 || nums[j] <= 0) {
                if (nums[i] == 0 && nums[i + 1] == 0 && nums[i + 2] == 0) {
                    result.add(Arrays.asList(0, 0, 0));
                    return result;
                } else if (nums[j] == 0 && nums[j - 1] == 0 && nums[j - 2] == 0) {
                    result.add(Arrays.asList(0, 0, 0));
                    return result;
                } else return result;
            }

            int diff = nums[j] + nums[i];
            if (binaryZero > 0 && diff == 0 && diff + nums[binaryZero] == 0) {
                result.add(Arrays.asList(nums[i], 0, nums[j]));
                i += 1;
                System.out.println(result);
            }
            if (diff > 0 ){
                int search = Arrays.binarySearch(nums, i + 1, j, (-1) * diff);
                if (search > 0) result.add(Arrays.asList(nums[i] + nums[search] + nums[j]));

                System.out.println(result);
            }else {
                int search = Arrays.binarySearch(nums, i + 1, j, (-1) * diff);
                if (search > 0) {
                    result.add(Arrays.asList(nums[i], nums[search], nums[j]));
                }
            }




        }
        return result;
    }
}
