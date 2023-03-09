package problem_solvingOn_Array;

import java.util.Scanner;

public class occurance {

    static int occurrence (int[] arr) {
        Scanner sc = new Scanner(System.in);
        int sel = sc.nextInt();
        int occu = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sel == arr[i]) {
                occu = occu + 1;
            }
        }
        return occu;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :) ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(occurrence(arr));
    }
}
