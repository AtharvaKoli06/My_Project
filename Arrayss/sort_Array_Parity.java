package Arrayss;

import java.util.Scanner;

public class sort_Array_Parity {

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortArrayParity(int[] arr) {
        int n = arr.length;

        int left = 0, right = n-1;

        while(left < right) {
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] % 2 == 0) {
                left++;
            }
            if(arr[right] % 2 == 1) {
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        printArray(arr);
        sortArrayParity(arr);
        System.out.println("Sorted Array");
        printArray(arr);
    }
}
