package com.example.demo.node;

import java.util.ArrayList;
import java.util.List;

public class Bit {


    public static void main(String[] args) {

        int[] x = {1, 2, 1, 2, 1, 2};

        int z = -1;
        int length = x.length;

        System.out.println(count(x, length -1) +" count()");

        System.out.println(sum +" sum");

    }

    static int sum = 0;
    static int count = -1;
    private static int count(int[] x, int length) {
        if (length == -1) { // базовый случай: достигнут конец массива
            return 1;
        } else {
            sum += x[length];
            return 1 + count(x, length -1); // рекурсивный случай: вызываем себя для следующего элемента массива и увеличиваем счетчик
        }
    }


}
