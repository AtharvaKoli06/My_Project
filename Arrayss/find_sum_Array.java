package Arrayss;

import java.util.Scanner;

public class find_sum_Array {
    static int findSumOfArray(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        return totalSum;
    }

    static int firstRepeatingNumber(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length :) ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
//        System.out.println("The Total Sum is :) " + findSumOfArray(a));
        System.out.println("The first Repeating nUmber is :) " + firstRepeatingNumber(a));

    }
}
