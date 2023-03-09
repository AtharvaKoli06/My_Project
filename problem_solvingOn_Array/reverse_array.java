package problem_solvingOn_Array;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :) ");
        int n = sc.nextInt(), x = 0, y = n-1;

        int[] arr = new int[n];

        System.out.println("Enter " + n + " element ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Printing Original array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Printing reverse array");
        for (int i = 0; i < n; i++) {
            while (x < y) {
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                x++;
                y--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }








    }
}
