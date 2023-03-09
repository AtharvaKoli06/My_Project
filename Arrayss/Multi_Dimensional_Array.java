package Arrayss;

import java.util.Scanner;

public class Multi_Dimensional_Array {
    static void printArray(int[][] a) {
        System.out.println("The printed Array...!!");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Addition Not Possible Of this Wrong Input: ");
            return;
        }

        int[][] sum = new int[r1][c1];
        System.out.println("Enter " + r1 * c1 + " Elements: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if(c1 != r2) {
            System.out.println("Multiplication not Possible - Wrong Dimension :)");
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
        System.out.println("Multiplication of 2 matrices :) ");
        printMatrix(mul);
    }

    public static void main(String[] args) {
//        Addition of multi-dimensional array
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and column of matrix :)");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] a = new int[row][column];
        System.out.println("Enter Matrix Elements: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        //Matrix 2
        System.out.println("Enter Row and column of matrix2, Please Enter Correct Input :) ");
        int row2 = sc.nextInt();
        int column2 = sc.nextInt();

        int[][] b = new int[row2][column2];
        System.out.println("Enter Matrix2 Elements :)");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

//        int[][] a2 = {{2,5,9},
//                      {1,7,8},
//                      {3,4,6}};
        System.out.println("Matrix 1 :)..");
        printMatrix(a);
        System.out.println("Matrix 2 :)..");
        printMatrix(b);

        add(a, row, column, b, row2, column2);

    }
}

         */

        //Multiplying multi-dimensional array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and column of matrix :)");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] a = new int[row][column];
        System.out.println("Enter Matrix Elements: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        //Matrix 2
        System.out.println("Enter Row and column of matrix2 :) ");
        int row2 = sc.nextInt();
        int column2 = sc.nextInt();

        int[][] b = new int[row2][column2];
        System.out.println("Enter Matrix2 Elements :)");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

//        int[][] a2 = {{2,5,9},
//                      {1,7,8},
//                      {3,4,6}};
        System.out.println("Matrix 1 :)..");
        printMatrix(a);
        System.out.println("Matrix 2 :)..");
        printMatrix(b);

        multiply(a, row, column, b, row2, column2);
    }
}