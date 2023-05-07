package com.example.demo.coducation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expect = new ArrayList<>();
        expect.add(Arrays.asList("bat"));
        expect.add(Arrays.asList("nat","tan"));
        expect.add(Arrays.asList("ate","eat","tea"));
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> actual = groupAnagrams.groupAnagrams(strs);



        assertAll(
                () -> assertEquals(expect, actual)

        );
    }
}