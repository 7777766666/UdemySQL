package com.example.demo.r;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class LongestPalindromeSend2 {


    public static void main(String[] args) {

        String s1 = "ssfabtbafs";
        String s = "cbbd";
        LongestPalindromeSend2 palindrome = new LongestPalindromeSend2();
        System.out.println(palindrome.longestPalindrome(s) + " result!");
    }

    public String longestPalindrome(String s) {

        int length = s.length();
        if (length == 0) return "";
        if (length == 1) return s;

        int longestPal = 1;
        int start = 0;
        int finish = 0;

        Map<Byte, Integer> map = new HashMap<>();
        byte[] split = s.getBytes();
        for (int i = 0; i < length; i++) {
            Integer count = map.getOrDefault(split[i], 0);
            if (count < 2){
                map.put(split[i], count + 1);
            }
        }
        for (int i = 0; i < length; i++) {
            if (split[i] != 0) {
                int lStop = i;

                for (int j = length - 1; j > lStop; j--) {
                    if (split[j] == split[i]) {
                        int rStop = j;
                        int r = j;
                        int l = i;

                        while (split[l] == split[r] && (r - l) > 0) {
                            l++;
                            r--;
                            if ((r - l) == 0 || l > r) {
                                int palind = (rStop - lStop) + 1;
                                j = -5;
                                if (palind > longestPal) {
                                    longestPal = palind;
                                    start = lStop;
                                    finish = rStop;
                                }
                            }
                        }
                    }
                }
            }
        }

        byte[] resultByte = Arrays.copyOfRange(split, start, finish + 1);
        String result = new String(resultByte, StandardCharsets.UTF_8);


        return (longestPal == 1) ? (Character.toString((char) split[0])) : result;
    }
}