package com.example.demo.r;

import java.util.ArrayList;


public class SmallestInfiniteSet {


    private ArrayList<Integer> integerArrayList;

    int[] arr;

    public SmallestInfiniteSet() {


        this.arr = new int[1000];
        this.integerArrayList = new ArrayList<>();
        integerArrayList.add(null);


    }


    public int popSmallest() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                integerArrayList.add(i + 1);
                arr[i] = 1;
                return i + 1;
            }

        }



        return -9999;

    }

    public void addBack(int num) {

        integerArrayList.add(null);
        if (arr[num - 1] == 1){
            arr[num - 1] = 0;
        }


    }


    public static void main(String[] args) {

        SmallestInfiniteSet obj = new SmallestInfiniteSet();


        obj.addBack(2);
        obj.popSmallest();
        obj.popSmallest();
        obj.popSmallest();
        obj.addBack(1);
        obj.popSmallest();
        obj.popSmallest();
        obj.popSmallest();

        System.out.println(obj.integerArrayList);

    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */

