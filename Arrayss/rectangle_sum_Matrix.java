package Arrayss;

import java.util.Scanner;

public class rectangle_sum_Matrix {
    static int findSum (int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1;j <= r2;j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
    // for third approach
    //calculate row and column wise sum
    //matrix[i][j] = sumofrectangle (0,0) (i,j) co-ordinates
    static void findPrefixSumMatrix (int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
      //Traverse Horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }

        //For third Approach
        //Traverse Vertically to calculate column-wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r;i++) {
                matrix[i][j] += matrix[i-1][j];
                
            }
        }
    }
    static int findSum2 (int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        findPrefixSumMatrix(matrix);

        for (int i = l1; i <= l2; i++) {
            // r1 to r2 sum of row i
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1-1];
            }else {
                sum += matrix[i][r2];
            }
        }

        return sum;
    }
    static int findSum3 (int[][] matrix, int l1, int r1, int l2, int r2) {
          int ans = 0,sum = 0, up = 0, left = 0, leftUp = 0;
        findPrefixSumMatrix(matrix);

        sum = matrix[l2][r2];
        if (r1 >= 1)
            left = matrix[l2][r1 - 1];
        if (l1 >= 1)
            up = matrix[l1 - 1][r2];
        if (l1 >= 1 && r1 >= 1)
            leftUp = matrix[l1 - 1][r1 - 1];

          ans = sum - up - left + leftUp;
          return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column of a Matrix :)");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter " + r * c + " Elements In matrix :)");

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Rectangle Boundaries l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle Sum " + findSum(matrix,l1,r1,l2,r2));
        System.out.println("Rectangle Sum " + findSum3(matrix,l1,r1,l2,r2));

    }
}
