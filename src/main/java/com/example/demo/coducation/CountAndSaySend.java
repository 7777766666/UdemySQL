package com.example.demo.coducation;

import java.util.*;

public class CountAndSaySend {


    public static void main(String[] args) {
        int x = 9;
        int[] y = { 1, 7, 8, 7, 8, 6, 1};
        System.out.println(singleNumber(y));
        System.out.println(countAndSay(x));


    }
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer orDefault = map.getOrDefault(nums[i], 0);
            if (orDefault == 0){
                map.put(nums[i], 1);
            }else {
                map.remove(nums[i]);
            }
        }
        Object[] array = map.keySet().toArray();
        return (int) array[0];
    }

    public static int singleNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        Object[] array = set.toArray();
        return (int) array[0];
    }



    public static String countAndSay(int n) {
        if (n == 1) return "1";


        int[] x = new int[10];
        int[] y = new int[10];

        x[0] = 1;
        x[1] = 1;


        int count = 1;
        int w = 0;
        int l = 0;
        int r = 0;
        int finish = 0;


        while (finish != n - 2) {

            while (x[r] != 0) {
                if (x[l] == x[r + 1]) {
                    while (x[l] == x[r + 1]) {
                        r++;
                        count++;
                    }
                }
                y[w++] = x[l];
                y[w++] = count;
                count = 1;
                r++;
                l = r;
            }

            x = y;
            if (finish < 12) {
                y = new int[100];
            } else if (finish < 21) {
                y = new int[1000];
            } else if (finish < 25) {
                y = new int[2700];
            } else {
                y = new int[4500];
            }

            w = 0;
            l = 0;
            r = 0;
            finish++;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < x.length; i++) {
            if (x[i] != 0){
                builder.append(x[i]);
            }else {
                return builder.reverse().toString();
            }
        }

        return builder.toString();
    }
}
