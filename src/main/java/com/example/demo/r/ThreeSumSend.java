package com.example.demo.r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSumSend {

    public static void main(String[] args) {

//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        int[] nums = {-11, 0, 0, 6, -12, -11, 22, 8, 6, 9, 6, -11, 0, -15, 6};
//        int[] nums = {-1,-1,-1,1};
        int[] nums = {-2,-3,0,0,-2};


        System.out.println(ThreeSumSend.threeSum(nums));
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
        for (int i = 0; i < length; i++) {
            if ( nums[i] == 0 && length - i >= 3 && nums[i + 1] == 0 && nums[i + 2] == 0 ){
                result.add(Arrays.asList(0, 0 ,0 ));
                i = 2_000_000;
            }
        }

        Set<Integer> set = new HashSet<>();
        int shortLength = length;
        for (int i = 0; i < shortLength; i++) {
            for (int j = i + 1; j < shortLength; j++) {
                if (nums[i] == nums[j]) {
                    set.add(nums[i]);
                    nums[j] = nums[shortLength - 1];
                    j--;
                    shortLength--;
                }
            }
        }
        set.remove(0);
        int size = set.size();
        int[] doubl = new int[size];
        int t = 0;
        for (Integer element : set) {
                doubl[t] = element;
                t++;
        }

        int[] uniq = new int[shortLength];
        System.arraycopy(nums, 0, uniq, 0, shortLength);
        Arrays.sort(uniq);
        for (int i = 0; i < shortLength - 2; i++) {
            for (int j = shortLength - 1; j > i + 1; j--) {
                for (int k = j - 1; k > i; k--) {
                    if (uniq[i] + uniq[j] + uniq[k] == 0) {
                        result.add(Arrays.asList(uniq[i], uniq[j], uniq[k]));
                    }
                }
            }
        }
//        -1,0,1,2,-1,-4

        for (int i = 0; i < doubl.length; i++) {
            int binarySearch = Arrays.binarySearch(uniq, 0,uniq.length, doubl[i] * (-2));
            if (binarySearch > -1){
                result.add(Arrays.asList(doubl[i], doubl[i], uniq[binarySearch]));
            }
        }

        return result;
    }
}


