package com.example.demo.r;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    @Test
    void longestPalindrome() {
        LongestPalindrome palindrome = new LongestPalindrome();
        String s = "babad";
        String result = palindrome.longestPalindrome(s);
        String except = "bab";
        Assertions.assertEquals(except, result); // check if actual output matches expected output


    }
}