/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
public class determenent {

    static boolean ab;

    static int det(int a[][], int n) {

        if (n == 1) {
            return a[0][0];
        }
        if (n == 2) {
            return a[0][0] * a[1][1] - a[1][0] * a[0][1];
        }
        int detof = 0;
        int i = 0, j = 0;

        for (i = 0; i < n; i++) {

            int cof = (int) Math.pow(-1, i) * a[0][i] * det(submatrix(a, 0, i), n - 1);

            detof = detof + cof;
        }
        return detof;
    }

    public static int[][] submatrix(int a[][], int r, int c) {
        int n = a.length;
        int arr[][] = new int[n - 1][n - 1];
        int row = 0, col = 0;
        for (int i = 0; i < n; i++) {
            if (i != row) {
                for (int j = 0; j < n; j++) {
                    if (j != col) {
                        arr[row][col] = a[i][j];
                        col++;
                    }

                }
                row++;
                col = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 0, 0},
        {0, 1, 0},
        {0, 0, 1}};
        int n = a.length;
        // System.out.println("det of a matrix : " + det(a, n));
        //    System.out.print(ab);
        String s = "12";
       // int inter = (int) s;
        System.out.println();

    }

}
