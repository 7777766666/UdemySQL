package com.example.demo.coducation;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] x = {9, 9, 7,9, 9, 6};
//        int[] x = {9, 9, 9};
        System.out.println((Arrays.toString(plusOne(x))) + " result");

    }

    public static int[] plusOne(int[] digits) {

        int length = digits.length;
        if (digits[length - 1] < 9) {
            digits[length - 1] = digits[length - 1] + 1;
            return digits;
        }else {
            digits[length - 1] = 10;
        }
        for (int i = length - 1; i > 0 ; i--) {
            if (digits[i] == 10 ){
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            }else {
                break;
            }
        }
        if (digits[0] != 10) return digits;

        int[] result = new int[digits.length + 1];
            result[0] = 1;
            digits[0] = 0;
            System.arraycopy(digits, 0, result, 2, digits.length - 1);

        return result;
    }
}