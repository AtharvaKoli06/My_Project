package problem_solvingOn_Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    static void swap (int[] arr, int n, int m) {
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
    static void reverse (int[] arr) {
        int n = arr.length, i = 0,j = n - 1;
       while (i < j) {
           int tmp = arr[i];
           arr[i] = arr[j];
           arr[j] = tmp;
           i++;
           j--;
       }
    }
    static void AcsendingSortArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
          }
        }
    }
    static void decsendingSortArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size :) ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " Element");
        for (int i = 0; i < n;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Asending Sor :) ");
//        AcsendingSortArray(a);
        for (int i = 0;i < n;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
//        System.out.println("Desending Sort :)");
//        decsendingSortArray(a);

        System.out.println("Reverse to from a decending Array:) ");
        reverse(a);
        for (int i = 0;i < n;i++) {
            System.out.print(a[i] + " ");
        }

    }
}
