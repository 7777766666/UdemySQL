package com.example.demo.r;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestPalindrome {

    public static void main(String[] args) {

        String s = "aartasdsaaa";
        LongestPalindrome palindrome = new LongestPalindrome();
        System.out.println(palindrome.longestPalindrome(s));

    }

    public String longestPalindrome(String s) {

        int length = s.length();
        if (length == 0) return "";
        if (length == 1) return s;

        int longestPal = 1;
        int start = 0;
        int finish = 0;

        byte[] arr = new byte[length];
        Map<Byte, Integer> map = new HashMap<>();

        Set<Byte> byteHashSet = new HashSet<>();

        byte[] split = s.getBytes();
        for (int i = 0; i < length; i++) {
            Integer count = map.getOrDefault(split[i], 0);
            map.put(split[i], count + 1);
            if (count == 1) {
                byteHashSet.add(split[i]);
            }
        }
        for (int i = 0; i < split.length; i++) {
            if (byteHashSet.contains(split[i])) {
                arr[i] = split[i];
            }
        }
        System.out.println(byteHashSet + " byteHashSet");

        for (int i = 0; i < length; i++) {
            if (split[i] != 0) {
                int lStop = i;


                for (int j = length - 1; j > lStop; j--) {
                    if (split[j] == split[i]) {
                        int rStop = j;
                        int r = j;
                        int l = i;
                        System.out.print(i + " ");
                        System.out.println(j);
                        while (split[l] == split[r] && (r - l) > 0) {
                            l++;
                            r--;
                            if ((r - l) == 0 || l > r) {
                                int palind = (rStop - lStop) + 1;
                                System.out.println(palind + "  palind");
                                System.out.println(rStop + "  stop  " + lStop);
                                j = -555;

                                if (palind > longestPal) {
                                    longestPal = palind;
                                    start = lStop;
                                    finish = rStop;
                                    System.out.print(start + " start  " + finish + "  finish ");
                                    System.out.println();

                                }
                            }
                        }
                    }
                }


            }
        }
        System.out.println();
        System.out.println("------------------------------");
        System.out.println(start + " start " + finish + " finish");
        byte[] resultByte = Arrays.copyOfRange(split, start, finish + 1);
        String result = new String(resultByte, StandardCharsets.UTF_8);


        System.out.println();


        System.out.println(Arrays.toString(arr));

        return (longestPal == 1) ? new String(Character.toString((char) split[0])) : result;
    }
}