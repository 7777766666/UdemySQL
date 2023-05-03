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
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < strs.length; j++) {
                String str = strs[j];
                if (i == str.length()) {
                    return result.toString();
                } else {
                    current = str.charAt(i);
                    set.add(current);
                    if (set.size() > 1) {
                        return result.toString();
                    }
                }
            }
            result.append(current);
        }
        return result.toString();
    }
}