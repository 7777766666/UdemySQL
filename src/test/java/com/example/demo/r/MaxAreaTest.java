package com.example.demo.r;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAreaTest {

    @Test
    void maxArea() {
        int[] x = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] x1 = {1, 1};
        int[] x2 = {4,3,2,1,4};

        MaxArea maxArea = new MaxArea();
        int result = maxArea.maxArea(x);
        int result2 = maxArea.maxArea(x1);
        int result3 = maxArea.maxArea(x2);

        assertAll(
                () -> assertEquals(49, result),
                () -> assertEquals(1, result2),
                () -> assertEquals(16, result3)

        );
    }
}