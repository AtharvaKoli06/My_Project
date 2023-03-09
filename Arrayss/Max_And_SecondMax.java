package Arrayss;

import java.util.Scanner;

public class Max_And_SecondMax {
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }
    static int findSecondMax(int arr[]) {
        int secMx = findMax(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == secMx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :) ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter Elements :) ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The MAX :) " + findMax(a));
        System.out.println("The SecondMax is :) " + findSecondMax(a));

    }
}
