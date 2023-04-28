package com.example.demo.r;


import java.util.HashMap;
import java.util.Map;

public class CreateDatabase {

    public static void main(String[] args) {

        int x = 55;
        int y = 55;

        int z = 0;

        if (x > y)
            z = 10;

        if (x == y)
            z = 55;

        else z = 99;





//        int z = (x > y) ? 10 : (x == y ? 55 : 99);

        System.out.println(z);
    }

    private static int lol(int x, int y){

        if (x > y) return 10;

        else if (x ==y) return 55;

        else return 99;




    }

}



