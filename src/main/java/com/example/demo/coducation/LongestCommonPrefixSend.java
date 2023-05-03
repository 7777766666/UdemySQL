package com.example.demo.coducation;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefixSend {


    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(LongestCommonPrefixSend.longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {


        StringBuilder result = new StringBuilder();
        String current = "";

        for (int i = 0; i < 200; i++) {
            Set<String> set = new HashSet<>();

            for (int j = 0; j < strs.length; j++) {

                String[] split = strs[j].split("");


                if (i == split.length) {
                    return result.toString();
                } else {
                    current = split[i];
                    set.add(split[i]);
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
