package Arrays_Assingment;

import java.util.Scanner;

public class Print_Even_Element {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i: arr) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}

