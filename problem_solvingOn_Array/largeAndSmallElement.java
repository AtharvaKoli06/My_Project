package problem_solvingOn_Array;

import java.util.Scanner;

public class largeAndSmallElement {
    static void largeSmall (int[] arr) {
        int n = arr.length;
        int min = arr[0],max = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The min value is :) " + min);
        System.out.println("The max value is :) " + max);
    }

    static int Max (int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }
    static int secondMax (int[] arr) {
        int mx = Max(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return Max(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :) ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Element");
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        largeSmall(arr);
        System.out.println(Max(arr));
        System.out.println(secondMax(arr));
    }
}
