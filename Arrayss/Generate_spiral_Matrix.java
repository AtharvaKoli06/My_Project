package Arrayss;
import java.util.Scanner;
public class Generate_spiral_Matrix {
    static void printMatrix(int[][] matrix) {
        int x = 0, y = x-1;
        for (int i = 0;i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
//    /*
    static int[][] generateSpiralMatrix (int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
        int curr = 1;
        n = n*n;
        while (curr <= n) {
            //top row --> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && curr < n * n; j++) {
               matrix[topRow][j] = curr++;
            }
            topRow++;
            //right col --> topRow to BottomRow
            for (int i = topRow; i <= bottomRow && curr < n * n; i++) {
                matrix[i][rightCol] = curr++;
            }
            rightCol--;
            //bottomRow --> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && curr < n * n; j--) {
                matrix[bottomRow][j]  = curr++;
            }
            bottomRow--;
            //leftCol -->bottomRow to topRow
            for (int i = bottomRow; i >= topRow && curr < n * n; i--) {
                matrix[i][leftCol] = curr++;
            }
            leftCol++;
        }
        return matrix;
    }
//     */
    public static int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int val = 1;
        int left = 0, right = n-1;
        int up = 0, down = n-1;
        n = n*n;
        n++;
        while(val < n) {
            for(int j = left; j <= right && val < n; j++) {
                a[up][j] = val++;
            }
            for(int i = up+1; i <= down-1 && val < n; i++) {
                a[i][right] = val++;
            }
            for(int j = right; j >= left && val < n; j--) {
                a[down][j] = val++;
            }
            for(int i = down-1; i >= up+1 && val < n; i--) {
                a[i][left] = val++;
            }
            left++; right--; up++; down--;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter No....:)");
//        int n = sc.nextInt();
//
//        System.out.println("Generating.....wait!! SpiralOrder Matrix  :) ");
//        int[][] matrix = generateSpiralMatrix(n);
//        printMatrix(matrix);


        int n = sc.nextInt();
        int[][] a = generateMatrix(n);
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
