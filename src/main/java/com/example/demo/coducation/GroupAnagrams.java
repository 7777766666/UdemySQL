package com.example.demo.coducation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {


    public static void main(String[] args) {

        String[] strs = {"bat", "ate", "eat", "tea", "nat", "tan"};

        GroupAnagrams groupAnagrams = new GroupAnagrams();

//        String[] x = {"taz", "mem", "azt", "zat", "atz", "lol", "llo"};
        String[] x = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println((groupAnagrams.groupAnagrams(x)) + " result");

    }

    public List<List<String>> groupAnagrams(String[] strs) {

        String[] finish = new String[strs.length];

        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            byte[] bytes = strs[i].getBytes();
            Arrays.sort(bytes);
            String s = new String(bytes);
            finish[i] = s;
        }

        for (int i = 0; i < finish.length; i++) {
            if (finish[i] != null) {
                List<String> stringList = new ArrayList<>();
                stringList.add(strs[i]);
                for (int j = i + 1; j < finish.length; j++) {
                    if (finish[j] != null) {
                        if (finish[i].equals(finish[j])) {
                            stringList.add(strs[j]);
                            finish[j] = null;
                        }
                    }
                }
                list.add(stringList);
            }
        }

        return list;
    }
}
