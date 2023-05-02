package com.example.demo.r;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    @Test
    void isPalindrome() {

        int x = -121;
        int x1 = 121;
        int x2 = 0;

        boolean result1 = IsPalindrome.isPalindrome(x);
        boolean result2 = IsPalindrome.isPalindrome(x1);
        boolean result3 = IsPalindrome.isPalindrome(x2);

        assertFalse(result1);
        assertTrue(result2);
        assertTrue(result3);


    }
}