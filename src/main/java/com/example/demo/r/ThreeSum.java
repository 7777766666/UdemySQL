package com.example.demo.r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
//        Output: [[-1,-1,2],[-1,0,1]]
//        List<List<Integer>> lists = ThreeSum.threeSum(nums);
        List<List<Integer>> listInteger = new ArrayList<>();
        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(-1);
        integerList1.add(-1);
        integerList1.add(2);
        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(-1);
        integerList2.add(0);
        integerList2.add(1);
        listInteger.add(integerList1);
        listInteger.add(integerList2);
//        System.out.println(listInteger);


        System.out.println(ThreeSum.threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = nums.length - 1; j > i + 1; j--) {
                for (int k = j - 1; k > i; k--) {
                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[k], nums[j]);
                        System.out.println(temp + "  temp");
                        Collections.sort(temp); // сортировка элементов
                        if (!result.contains(temp))
                            result.add(temp);
                    }
                }


            }
        }
        System.out.println(result + "  result");


        return result;

    }
}
