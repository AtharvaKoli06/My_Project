package Arrayss;

import java.util.Scanner;

public class Rotate {
    public static void rotate(int[] a, int k) {
        int n = a.length;
        k %= n; // k can be greater than n
        int[] ans = new int[n];

        for(int i = n-k; i <= n-1; i++) {
            ans[i-(n-k)] = a[i];
        }
        for(int i = 0; i < n-k; i++) {
            ans[i+k] = a[i];
        }
        for(int i = 0; i < n; i++) {
            a[i] = ans[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter k");
        int k = sc.nextInt();

        System.out.println("Enter the array elements");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }

        System.out.println("Output: ");
        rotate(a, k);

        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");

//            int a[]={1,2,3,4,5};
//            System.out.println("Original array ");
//
//            for(int i=0;i<a.length;i++){
//                System.out.print(a[i]+" ");
//            }
//            System.out.println("");
//
//            int k = 99;
//            rotate(a,k);
//            System.out.println("Rotated array ");
//            for(int i = 0;i < a.length;i++){
//                System.out.print(a[i]+" ");
            //}
        }
    }
}
