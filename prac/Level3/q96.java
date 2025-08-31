package prac.Level3;

import java.util.Random;

public class q96 {
    public static void main(String[] args) {
        int[][] M = createMatrix(2, 2);
        System.out.println("Matrix:");
        display(M);

        System.out.println("Transpose:");
        display(transpose(M));

        System.out.println("Determinant: " + determinant2x2(M));
        double[][] inv = inverse2x2(M);
        if (inv != null) {
            System.out.println("Inverse:");
            display(inv);
        } else {
            System.out.println("Matrix not invertible");
        }
    }

    public static int[][] createMatrix(int r, int c) {
        Random rand = new Random();
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rand.nextInt(10);
        return m;
    }

    public static int[][] transpose(int[][] M) {
        int r = M.length, c = M[0].length;
        int[][] res = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[j][i] = M[i][j];
        return res;
    }

    public static int determinant2x2(int[][] M) {
        return M[0][0] * M[1][1] - M[0][1] * M[1][0];
    }

    public static double[][] inverse2x2(int[][] M) {
        int det = determinant2x2(M);
        if (det == 0) return null;
        double[][] res = {
                { M[1][1] / (double)det, -M[0][1] / (double)det },
                { -M[1][0] / (double)det, M[0][0] / (double)det }
        };
        return res;
    }

    public static void display(int[][] M) {
        for (int[] row : M) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void display(double[][] M) {
        for (double[] row : M) {
            for (double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }
}
