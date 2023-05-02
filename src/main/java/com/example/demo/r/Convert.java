package com.example.demo.r;

public class Convert {

    public static void main(String[] args) {

//        String s = "PAYPALISHIRING";
        String s = "0123456789012345678";
        System.out.println("m\n" + "e\n" + "m\n");
        System.out.println(Convert.convert(s, 4));
    }


    public static String convert(String s, int numRows) {

        int length = s.length();
        if (length == 1) return s;
        String[] split = s.split("");
        if (length <= numRows) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length - 1; i++) {
                sb.append(split[i]).append("\n");
            }
            return (sb.append(split[split.length - 1])).toString();
        }

        int interval = (numRows - 1) * 2;
        int cycle = length / interval;
        int end = length - (interval * cycle);
        System.out.println(interval + " interval");
        System.out.println(cycle);
        System.out.println(end);

        int lGraph = (length / cycle) * cycle;
        int[][] graph = new int[numRows][(numRows - 1) * (length / (numRows - 1))];

        System.out.println(graph.length + "  graph.length");
//        for (int i = 0; i < graph.length; i++) {
//            for (int j = 0; j < (numRows - 1) * (length / (numRows - 1)); j++) {
//                System.out.print(graph[i][j] + " ");
//            }
//            System.out.println();
//        }

        int z = 0;
        int w = 0;
        int count = 0;
        while (z != (numRows)){
            graph[z][w] = count;
            z++;
            count++;
            System.out.println(z + " z");
            if (z == numRows){
                z = numRows - 2;
                w = w + 1;
                while (z != -1){
                    graph[z][w] = count;
                    count++;
                    z--;
                    w++;
                }
                z = 0;
            }


        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < (numRows - 1) * (length / (numRows - 1)); j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }



        return "99999";

    }

}
