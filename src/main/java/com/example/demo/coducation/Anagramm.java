package com.example.demo.coducation;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Anagramm {

    public static void main(String[] args) {

        String[] strs = {"bat", "ate", "eat", "tea", "nat", "tan"};

        Anagramm groupAnagrams = new Anagramm();

//        String[] x = {"taz", "mem", "azt", "zat", "atz", "lol", "llo"};
        String[] x = {"eaat", "teaa", "taan", "aate", "anat", "abat"};
//        String[] x = {"a"};
        System.out.println((groupAnagrams(x)) + " result");

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return Collections.emptyList();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] frequencyArr = new int[128];
            for(int i = 0;i<s.length();i++){
                frequencyArr[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(frequencyArr);
            List<String> tempList = map.getOrDefault(key, new LinkedList<String>());
            tempList.add(s);
            map.put(key,tempList);
        }
        return new LinkedList<>(map.values());
    }
}
