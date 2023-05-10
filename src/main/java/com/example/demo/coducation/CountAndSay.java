package com.example.demo.coducation;

import java.util.Arrays;

public class CountAndSay {


    public static void main(String[] args) {
        int x = 6;
        System.out.println(countAndSay(x));

    }

    public static String countAndSay(int n ) {
        if (n == 1) return "1";


        int[] x = new int[10];
        int[] y = new int[10];

        x[0] = 1;
        x[1] = 1;


        int count = 1;
        int w = 0;
        int l = 0;
        int r = 0;


        while (n != 2) {

            while (x[r] != 0) {
                if (x[l] == x[r + 1]) {
                    while (x[l] == x[r + 1]) {
                        r++;
                        count++;
                    }
                }
                y[w++] = x[l];
                y[w++] = count;
                count = 1;
                r++;
                l = r;
            }

            x = y;
            y = new int[4500];
            w = 0;
            l = 0;
            r = 0;
            n--;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < y.length; i++) {
            if (x[i] != 0 ){
                builder.append(x[i]);
            }else {
                return builder.reverse().toString();
            }
        }
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

        return "lol";
    }
}
