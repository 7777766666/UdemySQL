package com.example.demo.r;


import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 3, 4, 5, 5, 6};

        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = arr[len-1];
                    len--;
                    j--;
                }
            }
        }

        Integer[] result = Arrays.copyOf(arr, len);

        System.out.println(Arrays.toString(result)); // [1, 2, 3, 4, 5, 6]
    }
}

