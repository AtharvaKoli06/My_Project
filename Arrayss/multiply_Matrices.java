package Arrayss;

import java.util.Scanner;

public class multiply_Matrices {
    static void printMatrix (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void mulMatrices (int[][] a,int r1, int r2,int[][] b, int c1,int c2) {
        if(c1 != r2) {
            System.out.println("You Cannot Multiply the matrix: ");
            return;
        }
        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two matrix :) ");
        printMatrix(mul);
    }
    static int[][] transposeMatrix (int[][] matrix, int r, int c) {
        int[][] ans = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    static void reverseArray(int[] arr) {
        int x = 0, y = arr.length-1;

        while (x < y) {
            x = x + y;
            y = x - y;
            x = x - y;
            x++;
            y--;
        }

    }
    static void rotateMatrix90Degree (int[][] matrix, int r, int c) {

        transposeMatrix(matrix, r, c);

        for (int i = 0;i < r;i++) {
            reverseArray(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix row no.. and column no.. :) ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] matrix = new int[r1][c1];
         int totalElement = r1 * c1;
        System.out.println("Enter "+ totalElement + " matrix Element :) ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix2 row no.. and column no.. :) ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] matrix2 = new int[r2][c2];
        int totalElement1 = r2 * c2;

        System.out.println("Enter "+ totalElement1+ " matrix2 Element :) ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }


        System.out.println("Printing Inputed Matrix.... :) ");
        printMatrix(matrix);
        printMatrix(matrix2);


        mulMatrices(matrix,r1,r2,matrix2,c1,c2);
//        rotateMatrix90Degree(mulMatrices(matrix,r1,r2,matrix2,c1,c2));



    }
}
