package com.example.demo.r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum1 {


    public static void main(String[] args) {

//        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {-11, 0,0, 6, -12, -11, 22, 8, 6, 9, 6, -11, 0,-15,  6};


        System.out.println(ThreeSum1.threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        if (length == 3) {
            result.add(Arrays.asList(nums[0], nums[1], nums[2]));
            return (nums[0] + nums[1] + nums[2] == 0) ? result : new ArrayList<>();
        }


        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int z = 0;
        while (nums[z + 1] < 0) {
            if (nums[z] == nums[z + 1]) {
                int binar = Arrays.binarySearch(nums, z + 1, length, (nums[z] * (-2)));
                System.out.println(binar + " binar");
                System.out.println(nums[z] * -2);
                if (binar >= 0) {
                    result.add(Arrays.asList(nums[z], nums[z], nums[binar]));
                }
            }
            while (nums[z + 1] == nums[z]){
                z++;
            }
            z++;
        }
        z = length - 1;
        while (nums[z - 1] >= 0) {
            if (nums[z] == nums[z - 1]) {
                int binarySearch = Arrays.binarySearch(nums, 0, z, (nums[z] * -2));
                System.out.println(binarySearch + " binarySearch");
                if (binarySearch >= 0) {
                    result.add(Arrays.asList(nums[z], nums[z], nums[binarySearch]));
                }
            }
            while ( nums[z - 1] >= 0 && nums[z - 1] == nums[z] ) {
                z--;
            }
            z--;
        }
        int shortLength = length;
        for (int i = 0; i < shortLength ; i++) {
            for (int j = i + 1; j < shortLength ; j++) {
                if (nums[i] == nums[j]){
                    nums[j] = nums[shortLength - 1];
                    j--;
                    shortLength--;
                }
            }
        }
        int[] uniq = new int[shortLength];
        System.arraycopy(nums, 0, uniq, 0, shortLength );
        System.out.println(Arrays.toString(uniq));
        for (int i = 0; i < shortLength - 2; i++) {
            for (int j = shortLength - 1; j > i + 1; j--) {
                for (int k = j - 1; k > i; k--) {
                    if (uniq[i] + uniq[j] + uniq[k] == 0){
                        result.add(Arrays.asList(uniq[i], uniq[j], uniq[k]));
                    }
                }
            }
        }


        System.out.println(result + "  result");


        return result;

    }
}

