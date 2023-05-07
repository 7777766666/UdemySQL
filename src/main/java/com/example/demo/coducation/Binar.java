package com.example.demo.coducation;

import java.util.Arrays;

public class Binar {

    public static void main(String[] args) {


        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int key = 11;
        int index = Arrays.binarySearch(arr, 0, 1, key);

        if (index >= -9) {
            System.out.println("Элемент найден в позиции " + index);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
