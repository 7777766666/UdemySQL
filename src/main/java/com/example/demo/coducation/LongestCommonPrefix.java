package com.example.demo.coducation;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();
        char current = 'z';
        for (int i = 0; i < 200; i++) {

            for (int j = 0; j < strs.length; j++) {
                String str = strs[j];
                if (i == str.length()) {
                    return result.toString();
                } else {
                    if (j == 0) {
                        current = str.charAt(i);
                    } else {
                        if (current != str.charAt(i)) {
                            return result.toString();
                        }
                    }
                }
            }
            result.append(current);
        }
        return result.toString();
    }
}