package com.example.demo.r;

public class Graph {
    private int[][] adjMatrix;
    private int numVertices;

    public Graph(int[][] matrix) {
        numVertices = matrix.length;
        adjMatrix = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                adjMatrix[i][j] = matrix[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        };

        Graph graph = new Graph(matrix);

        // Выводим матрицу смежности
        for (int i = 0; i < graph.numVertices; i++) {
            for (int j = 0; j < graph.numVertices; j++) {
                System.out.print(graph.adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
