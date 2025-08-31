package prac.Level3;

import java.util.Random;

public class q95 {
    public static void main(String[] args) {
        int[][] A = createMatrix(2, 2);
        int[][] B = createMatrix(2, 2);

        System.out.println("Matrix A:");
        display(A);
        System.out.println("Matrix B:");
        display(B);

        System.out.println("Addition:");
        display(add(A, B));

        System.out.println("Subtraction:");
        display(subtract(A, B));

        System.out.println("Multiplication:");
        display(multiply(A, B));
    }

    public static int[][] createMatrix(int r, int c) {
        Random rand = new Random();
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rand.nextInt(10);
        return m;
    }

    public static int[][] add(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = A[i][j] + B[i][j];
        return res;
    }

    public static int[][] subtract(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = A[i][j] - B[i][j];
        return res;
    }

    public static int[][] multiply(int[][] A, int[][] B) {
        int r = A.length, c = B[0].length, n = B.length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < n; k++)
                    res[i][j] += A[i][k] * B[k][j];
        return res;
    }

    public static void display(int[][] M) {
        for (int[] row : M) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
}
