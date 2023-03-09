package Arrayss;

import java.util.Scanner;

public class sort_square {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static void reverse1(int[] a, int i, int j) {

        int tmp = 0;
        while (i < j) {
            tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
    }
    static int[] sortSquare(int[] arr) {
        int n = arr.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];
        int k = 0;
        //Not to put reverse method for this statement
//        int k = n-1;

        while(left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                //Not to put reverse method for this statement
//                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                //Not to put reverse method for this statement
//                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
//        reverse1(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt(),a = 0, b = n-1;

        int[] arr = new int[n];
        System.out.println("Enter " + n + " element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        printArray(arr);
        int[] ans = sortSquare(arr);
        System.out.println("square root..");
        printArray(ans);
        System.out.println("Sorted Array");
        reverse1(ans,a,b);
        printArray(ans);
    }
}
