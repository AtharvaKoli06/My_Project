package Arrayss;

import java.util.Scanner;

public class prefix {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] makePrefixSum(int[] arr) {
        int n = arr.length;
//      int[] pref = new int[n];
//       pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
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

//        with traversing
        System.out.println("Input array: ");
        printArray(arr);
        int[] pref = makePrefixSum(arr);
        printArray(pref);

//        .......................................................................................
//        With Traversing
//        System.out.println("Enter array size: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n+1];
//        System.out.println("Enter " + n + " element: ");
//        for (int i = 1; i <= n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Input array: ");
//        printArray(arr);
//        int[] pref = makePrefixSum(arr);
//        printArray(pref);

//        ............................................................................

        //Without traversing
//        System.out.println("Enter array size: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n+1];
//        System.out.println("Enter " + n + " element: ");
//        for (int i = 1; i <= n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Input array: ");
//        printArray(arr);
//        int[] prefSum = makePrefixSum(arr);
//        System.out.println("Enter number of queries");
//        int q = sc.nextInt();

//        while (q-- > 0) {
//            System.out.println("Enter Range: ");
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//
//            int ans = prefSum[r] - prefSum[l-1];
//            System.out.println("PrefSum: " + ans);


//        preffix and suffix sum problem
//        System.out.println("Enter array size: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n+1];
//        System.out.println("Enter " + n + " element: ");
//        for (int i = 1; i <= n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Input array: ");
//        printArray(arr);
//
//        System.out.println("Equal Partition possible: " + equalsSumPartition(arr));
//        }
    }
}
