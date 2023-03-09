package Sorting_Algorithm;

import java.util.Scanner;

public class problemOnSortingAlgorithm {
    static void relatedToBubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] == 0 && arr[j+1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    } //bubble sort
    static void lexicographicalString (String[] arr) {
      int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j].compareTo(arr[min_index]) < 0) {
                    min_index = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    } //Selection sort
    static void wordToWordStringsSortingUsingBubbleSort (String[] arr) {
        int n = arr.length;
        System.out.println("word wise sorting of string");
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    static void letterToLetterStringsSortingUsingBubbleSort (String[] arr) {
        int n = arr.length;
        System.out.println("\ncharacter wise sorting of string");
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j].compareTo(arr[i]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    static String lexicographicalOrderString (String s,int n) {
        char[] a = s.toCharArray();//Converting the String to character
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j-1]) {
                //swap a[j] a[j-1]
                char temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
        String ans = "";
        for(int i = 0; i < a.length; i++){
            ans += a[i];
        }
//        for (char c :a) {
//            ans = ans + a[c];
//        }
        return ans;
    }
//    Q7- Given an array, sort it using insertion sort recursively.
    public static void rec(int[] arr, int n) {
        if (n <= 1)
            return;
        rec(arr, n - 1);
        // Insert last element at its correct position in sorted array.
        int last = arr[n - 1];
        int j = n - 2;
        /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int[] arr = {0,1,0,1,8,1,0};
//        int n = arr.length;
//        relatedToBubbleSort(arr);
//        for (int i :arr) {
//            System.out.print(i + " ");
//        }

//        String[] fruits = {"kiwi", "Grapes","apple", "papaya", "mango"};
//        lexicographicalString(fruits);
//        for (String val :fruits) {
//            System.out.println(val + " ");
//        }

//        Q1 - Given an array of strings arr[]. Sort given strings using Bubble Sort and display the sorted array.

/*            System.out.println("Enter the length of array");
//            int n = scn.nextInt();
//            String[] arr = {"coding","is","fun"};
//        String[] arr = {"college","cot","cottage"};

//        String[] arr = new String[n];
//            System.out.println("Enter the elements of array");
//            for(int i = 0; i < arr.length; i++){
//                arr[i] = scn.nextLine();
//            }
//            wordToWordStringsSortingUsingBubbleSort(arr);
//        for (String val :arr) {
//            System.out.print(val + " ");
//        }
//        letterToLetterStringsSortingUsingBubbleSort(arr);
//        for (String val :arr) {
//            System.out.print(val + " ");
//        }
*/

//        Q2- Given a string s, return the string which contains all characters of s in lexicographical order.
//        System.out.println("Enter the string: ");
//        String s = scn.nextLine();
//        int n = s.length();
//        System.out.println(lexicographicalOrderString(s,n));

//        Q3 - Given an integer array and an integer k where k < size of array, We need to return the kth smallest
//        element of the array
        System.out.println("Enter the length of array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
/*        System.out.println("Enter the index");
//        int k = scn.nextInt();
//        for (int i = 1; i < n; i++) {
//            int j = i;
//            // Insert a[i] into sorted left part 0..i-1
//            while (j > 0 && arr[j] < arr[j - 1]) {
//                // Swap a[j] and a[j-1]
//                int temp = arr[j];
//                arr[j] = arr[j - 1];
//                arr[j - 1] = temp;
//                // Decrement j by 1
//                j--;
//            }
//        }
        System.out.print(arr[k - 1]);*/

//        Q4 - Given an array of n elements, the task is to find the elements that are greater than half of elements
//        in an array. In case of odd elements, we need to print elements larger than floor(n/2) elements where n is
//        total number of elements in array.
        /*
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        int si;
        if (n % 2 == 0) {
            si = n / 2;
        } else{
            si = n / 2 + 1;
        }
        for (int i = si; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

         */

//        Q 5 Given an array of digits (values are 0 to 9), the task is to find the minimum possible sum of two
//        numbers formed from digits of the array. please note that all digits of the given array must be used to form
//        the two numbers

/*        for (int i = 0; i < n; i++) {
//            int j = i;
//            while (j > 0 && arr[j] < arr[j - 1]) {
//                int temp = arr[j];
//                arr[j] = arr[j - 1];
//                arr[j - 1] = temp;
//                j--;
//            }
//        }
//        int a = 0;
//        int b = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(i % 2 == 0){
//                a = a * 10 + arr[i];
//            }else{
//                b = b * 10 + arr[i];
//            }
//        }
//        System.out.println(a + b);

 */

//        Q6 - Given an array with N distinct elements, convert the given array to a form where all elements are in
//        the range from 0 to N-1. The order of elements is the same, i.e., 0 is placed in the place of the smallest
//        element, 1 is placed for the second smallest element, ... N-1 is placed for the largest element.
/*
        int[] temp = arr.clone();
        for (int i = 0; i < n; i++) {
            int j = i;
           while (j > 0 && arr[j] < arr[j - 1]) {
               int val = arr[j];
               arr[j] = arr[j - 1];
               arr[j - 1] = val;
               j--;
           }
        }
     int pos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] == temp[i]) {
                    arr[j] = pos;
                    pos++;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        */

//        Q7- Given an array, sort it using insertion sort recursively.
        rec(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
