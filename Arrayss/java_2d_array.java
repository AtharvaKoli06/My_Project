package Arrayss;

import java.util.Scanner;

public class java_2d_array {
    static void printMatrix (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] TransposeMatrix(int[][] matrix, int r, int c) {
        int[][] ans = new  int[r][c];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    //This is only use for Square Method
    static void TransposeInPlace (int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
//                Swap
             int temp = matrix[i][j];
             matrix[i][j] = matrix[j][i];
             matrix[j][i] = temp;

//             matrix[i][j] = matrix[i][j] + matrix[j][i];
//             matrix[j][i] = matrix[i][j] - matrix[j][i];
//             matrix[i][j] = matrix[i][j] - matrix[j][i];
            }
        }
    }
    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length-1;

        while (i < j) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];

//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateMatrix(int[][] matrix, int n) {
        //Rotation Of Matrix

        //transpose array
        //reverse each row of transposed array
        TransposeInPlace(matrix, n, n);

        //reverse  each row of transport matrix
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }
    }
    static int[][] pascal(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            /*
            ans[0] = new int[1];
            ans[1] = new int[2]
             */
//            ith row has i+1 columns
            ans[i] = new int[i+1];
            //1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                /*
                  ans[i-1][j] --> Directly above column
                  ans[i-1][j-1] --> THis is directly Above back side
                 */
                //this is formula of pascals
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows and Columns of Matrix :) ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElement = r * c;
        System.out.println("Entered " + totalElement + " Values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("Transpose Of Matrix");

//        int[][] ans = TransposeMatrix(matrix, r, c);
//        printMatrix(ans);
//        TransposeInPlace(matrix,r, c);// it works only for square matrix..........

        rotateMatrix(matrix, r);
        printMatrix(matrix);



//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Number");
//        int n = sc.nextInt();
//        System.out.println("Pascal's Of Matrix");
//        int[][] ans = pascal(n);
//        printMatrix(ans);

    }
}
