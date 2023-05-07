package com.example.demo.coducation;

import java.util.Arrays;

public class ReverseInt {


    public static void main(String[] args) {
        int x = -12;
        System.out.println(Integer.MIN_VALUE);
        System.out.println((ReverseInt.reverse(x) + "  Resalt"));


    }


        public static int reverse(int x) {

            long z = 0;
            while (x != 0) {
                z = z * 10 + x % 10;
                x /= 10;
            }
            return (z > Integer.MAX_VALUE || z < Integer.MIN_VALUE) ? 0 : (int) z;
        }


    public static int reverse1(int x) {

        if (x == 0) return 0;
        while (x % 10 == 0) {
            x /= 10;
        }
        int sign = (x < 0) ? -1 : 1; // -1 minus, 1 plus
        String s = String.valueOf(Math.abs(x));
        StringBuilder builder = new StringBuilder();
        builder.append(s).reverse();
        try {
            x = Integer.parseInt(builder.toString()) * sign;
        } catch (NumberFormatException e) {
            x = 0;
        }
        return x;
    }
}
