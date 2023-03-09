package Arrays_Assingment;

import java.util.Scanner;

public class Array_2D {
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void elementExistsOrNot (int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to be Find :)");
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == n) {
                    System.out.println("The value find at :)" + i +" " + j + " :) index :) Your Value is :) " + n);
                    return;
                }else {
                    System.out.println("The value is not found at " + i + " " + j);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :) ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter " + r * c + " Elements :) ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing Matrix..");
        printMatrix(arr);

        System.out.println("Printing the result... :)");
        elementExistsOrNot(arr);



    }


}
