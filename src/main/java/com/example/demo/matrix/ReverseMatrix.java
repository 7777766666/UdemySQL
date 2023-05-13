package com.example.demo.matrix;


public class ReverseMatrix {

    static final String s3 = "При";
    static final String s4 = "вет";
    public static void main(String[] args) {
        String s11 = "Привет";
        String s1 = "При";
        String s22 = s3 + s4;
        System.out.println(s11 == s22);

        int size = 3;
        int start = 1;
        int[][] x = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                x[i][j] = start++;
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("\n");

        int[][] y = rotate(x);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.print("\n");
        }


        int xxx = 888;
        funFunction(xxx);
        String s = funFunction(xxx);


    }


    private static String funFunction(int xxx) {
        String s = String.valueOf(xxx);
        return s;
    }


    public static int[][] rotate(int[][] matrix) {

        int length = matrix.length;
        int j = 0;
        while (j < length) {
            for (int i = length - 1; i > j; i--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            j++;
        }

        j = 0;
        int l = 0;
        int r = matrix.length - 1;
        while (j < matrix.length ) {
            while (l < r) {
                int temp = matrix[j][l];
                matrix[j][l] = matrix[j][r];
                matrix[j][r] = temp;

                l++;
                r--;
            }
            j++;
            l = 0;
            r = matrix.length - 1;
        }



        return matrix;
    }


}
