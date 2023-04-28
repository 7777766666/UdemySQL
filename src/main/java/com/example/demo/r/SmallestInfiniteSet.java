package com.example.demo.r;

import java.util.ArrayList;
import java.util.HashMap;


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

        char x = 'a';
        char y = 'b';
        String r = String.valueOf(x +  y);
        System.out.println(r);

        char t = 'a';
        int t1 = t;
        System.out.println(t1);
        byte z = (byte) t;
        System.out.println(z);

        // Создаем HashMap, которая принимает char в качестве ключа и возвращает строку
        HashMap<Character, String> charToStringMap = new HashMap<>();

        // Добавляем пары ключ-значение в HashMap
        for (char c = 'a'; c <= 'z'; c++) {
            String str = String.valueOf(c);
            charToStringMap.put(c, str);
        }

        // Пример использования HashMap
        char key = 'a';
        String value = charToStringMap.get(key);
        System.out.println("Значение для ключа " + key + " в HashMap: " + value);



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

