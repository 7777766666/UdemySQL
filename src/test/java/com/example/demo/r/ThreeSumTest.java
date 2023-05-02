package com.example.demo.r;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void threeSum() {


        int[] nums = {-1, 0, 1, 2, -1, -4};
//        Output: [[-1, -1, 2],[-1, 0, 1]]
        List<List<Integer>> lists = ThreeSum.threeSum(nums);
        List<List<Integer>> listInteger = new ArrayList<>();
        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(-1);
        integerList1.add(-1);
        integerList1.add(2);
        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(-1);
        integerList2.add(0);
        integerList2.add(1);
        listInteger.add(integerList1);
        listInteger.add(integerList2);
        assertEquals(listInteger, lists);

    }
}