package com.example.demo.r;


import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class LongestPalindrome2 {


    public static void main(String[] args) {

        String s = "aartasbbbbsaaa";
        LongestPalindrome2 palindrome = new LongestPalindrome2();
        System.out.println(palindrome.longestPalindrome(s));

    }

    public String longestPalindrome(String s) {

        int length = s.length();
        if (length == 0) return "";
        if (length == 1) return s;

        int longestPal = 1;
        int start = 0;
        int finish = 0;
        byte[] split = s.getBytes();

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
                                j = -555;

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
        if (longestPal == 1) return new String(s.substring(0, 1));

        byte[] resultByte = Arrays.copyOfRange(split, start, finish + 1);
        String result = new String(resultByte, StandardCharsets.UTF_8);

        return result;
    }
}