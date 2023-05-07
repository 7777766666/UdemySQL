package com.example.demo.coducation;

public class Recurse {

    public static void main(String[] args) {

        int[] z = {100, 6, 10, 5, 13};

        Recurse recurse = new Recurse();

        System.out.println(recurse.sum(z));

    }

    private int sum(int[] x){
        return sumAll(x, 0, 1);


    }

    private int sumAll(int[] arr, int x, int y){

        if (y == arr.length){
            return arr[x];
        }

        arr[x] = -arr[y] - sumAll(arr, x, y + 1);


        return arr[x];
    }



}
