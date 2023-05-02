package com.example.demo.r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsPalindrome {

    public static void main(String[] args) {

        int x = 424;

        System.out.println(IsPalindrome.isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {

        if (x < 0) return false;
        if (x < 10) return true;
        if (x % 10 == 0) return false;

        String s = String.valueOf(x);
        int length = s.length();
        int r = length - 1;
        int l = 0;

        while (true) {
            if (s.charAt(l++) == s.charAt(r--)){
                if (r < l || l == r) return true;
            }else {
                return false;
            }

        }



    }
}