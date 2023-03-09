package Arrays_Assingment;

import java.util.Scanner;

public class Print_Positive_Element {

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void positive_number(int[] arr) {
        int pos = -1;
        for(int i = 0;i < arr.length;i++) {
            if (arr[i] > pos) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//2 6 -5 -1 0 4 -9
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Original array");
        printArray(arr);
        System.out.println("\nAfter Traversing... The Positive Number is: ");
        positive_number(arr);
    }
}
